import java.util.ArrayList;

public class Account {
    private String owner;
    private ArrayList<Entry> entries;

    public Account(String owner) {
        this.owner = owner;
        this.entries = new ArrayList<Entry>();
    }
    public String getOwner() {
        return owner;
    }

    public void postEntry(Entry entry) {
        entries.add(entry);
    }
    public ArrayList<Entry> listByCounterparty(String counterparty) {
        ArrayList<Entry> filteredEntries = new ArrayList<Entry>();
        if (counterparty.equals("")){
            filteredEntries.addAll(entries);
        }
        else {
            for (Entry entry : entries) {
                if (entry.getCounterparty().equals(counterparty)) {
                    filteredEntries.add(entry);
                }
        }
    }
        return filteredEntries;
    }
    public ArrayList<String> listByCounterparties()
    {
        ArrayList<String> counterparties = new ArrayList<String>();
        for (Entry entry : entries) {
            if (!counterparties.contains(entry.getCounterparty())) {
                counterparties.add(entry.getCounterparty());
            }
        }
        return counterparties;
    }
    public String getStatement(){

        String statement = "Statement for '" + owner + "':\n";
        
        ArrayList<String> counterparties = listByCounterparties();
        
        for (String counterparty : counterparties) {
            int balance = 0;
            ArrayList<Entry> entriesForCounterparty = listByCounterparty(counterparty);
            for (Entry entry : entriesForCounterparty) {
                if (entry.getCounterpartyGiving()){
                    balance += entry.getQuantity();
                } else {
                    balance -= entry.getQuantity();
                }
            }
            if (balance > 0) {
                statement += owner + " is owed $" + balance + " from " + counterparty + "\n";
            } else if (balance < 0) {
                statement += owner + " owes $" + Math.abs(balance) + " to " + counterparty + "\n";
            }
        }
        return statement;
    }
}




