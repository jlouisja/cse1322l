import java.util.ArrayList;

public class Account {
    private String owner;
    private ArrayList<Entry> entries;

    public Account(String owner) {
        this.owner = owner;
        this.entries = new ArrayList<>();
    }
    public String getOwner() {
        return owner;
    }

    public void postOwner(Entry entry) {
        entries.add(entry);
    }
    public ArrayList<Entry> listByCounterparty(String counterparty) {
        ArrayList<Entry> filteredEntries = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.getCounterparty().equals(counterparty)) {
                filteredEntries.add(entry);
            }
        }
        return filteredEntries;
    }
    public ArrayList<String> listByCounterparties()
    {
        ArrayList<String> counterparties = new ArrayList<>();
        for (Entry entry : entries) {
            String counterparty = entry.getCounterparty();
            if (!counterparties.contains(counterparty)) {
                counterparties.add(counterparty);
            }
        }
        return counterparties;
    }
    public String getStatement(){
        // returns a string containing the balance that this account has with every other account in the following format:
// Statement for '{owner}'
// {balances}
// Where {balances} has all the balances this account has with every other account, one per line. These balances must be in one of the formats below:
// 	{owner} owes ${amount} to {counterparty}
// OR
// 	{owner} is owed ${amount} from {counterparty}
// Thus, using the example given under "Accounts and Entries", Bob's account's getStatement() would return the following string (Note that {amount} is not negative):
// 	Statement for 'Bob':
// 	Bob is owed $35 from Alice
// Bob owes $15 to Charlie
        StringBuilder statement = new StringBuilder();
        statement.append(String.format("Statement for '%s':\n", owner));
        ArrayList<String> counterparties = listByCounterparties();
        for (String counterparty : counterparties) {
            int balance = 0;
            ArrayList<Entry> entriesWithCounterparty = listByCounterparty(counterparty);
            for (Entry entry : entriesWithCounterparty) {
                if (entry.getCounterpartyGiving()) {
                    balance += entry.getQuantity();
                } else {
                    balance -= entry.getQuantity();
                }
            }
            if (balance > 0) {
                statement.append(String.format("%s is owed $%d from %s\n", owner, balance, counterparty));
            } else if (balance < 0) {
                statement.append(String.format("%s owes $%d to %s\n", owner, -balance, counterparty));
            }
        }
        return statement.toString();

    }
}
