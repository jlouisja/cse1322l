public class ParkWallet {
    //	2 fields - tickets (int) and holiday (boolean) static and set to false
// 	The first field is to keep track of how many tickets the guest has, while the second is to keep track of if it is currently a holiday or not, as prices are half off during holidays
    private int tickets;
    private static boolean holiday = false;

//	2 constructors
// 	ParkWallet(): Sets tickets to 0
public ParkWallet() {
        this.tickets = 0;
    }
// 	ParkWallet(int): Sets tickets to the passed argument
public ParkWallet(int tickets) {
        this.tickets = tickets;
    }
// 	 getters
    public int getTickets() {
        return tickets;
    }

    public static boolean getHoliday() {
        return holiday;
    }
// setters
    public void setTickets(int tickets) {
        if (tickets > 0) {
            this.tickets = tickets;
        }
    }

    public static void setHoliday(boolean holiday) {
        ParkWallet.holiday = holiday;
    }
// void addTickets(int): 
// must not be negative 
// increment tickets by the argument
    public void addTickets(int tickets) {
        if (tickets >= 0) {
            this.tickets += tickets;
        }
    }
// 	boolean removeTickets(int): 
//  must have enough tickets.
//  decrement that many tickets from the wallet and return true 
//  otherwise return false and do not decrement tickets.
    public boolean removeTickets(int tickets) {
        if (tickets >= 0 && this.tickets >= tickets) {
            this.tickets -= tickets;
            return true;
        } else {
            return false;
        }
    }

}
