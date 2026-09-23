public class Entry {
    // •	A string field called "counterparty"
    private String counterparty;
// •	A boolean field called "counterpartyGiving".
    private boolean counterpartyGiving;
// •	An integer field called "quantity",
    private int quantity;
// •	An integer field called "id"
    private int id;
// •	A static integer field called "nextId", 
    private static int nextId = 1;
// •	private Entry(String, int, boolean):
private Entry(String counterparty, int quantity, boolean counterpartyGiving) {
        this.counterparty = counterparty;
        this.quantity = quantity;
        this.counterpartyGiving = counterpartyGiving;
        this.id = nextId;
        nextId++;
    }
// getters and setters for all fields except nextId
    public String getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(String counterparty) {
        this.counterparty = counterparty;
    }

    public boolean getCounterpartyGiving() {
        return counterpartyGiving;
    }

    public void setCounterpartyGiving(boolean counterpartyGiving) {
        this.counterpartyGiving = counterpartyGiving;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }
// •	String toString(): returns one of the strings below:
// #{id}: received ${quantity} from {counterparty}
// 				OR
// #{id}: gave ${quantity} to {counterparty}
public String toString() {
        if (counterpartyGiving) {
            return String.format("#%d: received $%d from %s", id, quantity, counterparty);
        } else {
            return String.format("#%d: gave $%d to %s", id, quantity, counterparty);
        }
    }
// The string to be returned depends on the "counterpartyGiving" variable: if the counterparty is giving (i.e.: the field is true), then the first string must be returned. Otherwise, the second string must be returned.

public static Entry[] createEntries(String reciever, String sender, int amount) {
        Entry[] entries = new Entry[2];
        entries[0] = new Entry(reciever, amount, true);
        entries[1] = new Entry(sender, amount, false);
        nextId += 1;
        return entries;
    }

}
