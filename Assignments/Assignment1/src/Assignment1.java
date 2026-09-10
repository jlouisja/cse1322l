// CSE1322L - B01
// Assignment 1
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class Assignment1 {

    void main() {
        Scanner scanner = new Scanner(System.in);
// 3 variables to keep track of the price of each ticket type for the current event
        double gaPrice = 55.00;
        double paPrice = 105.00;
        double vipPrice = 250.00;
// 3 variables to keep track of the quantity of each ticket type sold for the current event
        int gaTickets = 0;
        int paTickets = 0;
        int vipTickets = 0;
// 3 variables to keep track of the revenue of each ticket type across all events
        double totalGARevenue = 0.00;
        double totalPARevenue = 0.00;
        double totalVIPRevenue = 0.00;
// 3 variables to keep track of the quantity of each ticket type sold across all events
        int totalGATickets = 0;
        int totalPATickets = 0;
        int totalVIPTickets = 0;
        int option;
        do {

            System.out.println("[TICKET HUB]");
            System.out.println();
            System.out.println("1. Sell tickets");
            System.out.println("2. View sales and prices for this event");
            System.out.println("3. Change ticket prices");
            System.out.println("4. Refund tickets");
            System.out.println("5. Consolidate sales");
            System.out.println("0. Generate Report and Exit");
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            System.out.println();

        switch (option){
            case 0:
                System.out.print("Generating report..");
                break;
            case 1:
                System.out.println("*** Sell Tickets ***");
                System.out.println("1. General Admission");
                System.out.println("2. Premium Admission");
                System.out.println("3. VIP Admission");
                System.out.print("Which ticket would you like to sell?");
                int sellOption = scanner.nextInt();
                switch (sellOption) {
                    case 1:
                        System.out.print("How many?");
                        int gaSold = scanner.nextInt();
                        double gaSale = (gaSold * gaPrice);
                        gaTickets+= gaSold;
                        totalGATickets += gaSold;
                        totalGARevenue+=gaSale;
                        System.out.println("Sold "+gaSold+" General Admission tickets at $"+gaPrice+" for a total of $"+gaSale);
                        break;
                    case 2:
                        System.out.print("How many?");
                        int paSold = scanner.nextInt();
                        double paSale = paSold * paPrice;
                        paTickets+= paSold;
                        totalPATickets += paSold;
                        totalPARevenue += paSale;
                        System.out.println("Sold "+paSold+" General Admission tickets at $"+paPrice+" for a total of $"+paSale);
                        break;
                    case 3:
                        System.out.print("How many?");
                        int vipSold = scanner.nextInt();
                        double vipSale = vipSold *vipPrice;
                        vipTickets += vipSold;
                        totalVIPTickets += vipSold;
                        totalVIPRevenue += vipSale;
                        System.out.println("Sold "+vipSold+" General Admission tickets at $"+vipPrice+" for a total of $"+vipSale);
                        break;
                }
                break;
            case 2: // view sales and prices
                System.out.println("*** Sales and Prices for This Event ***");

                System.out.println();
                System.out.println("General Admission: "+gaTickets+" at $"+gaPrice);
                System.out.println("Premium Admission: "+paTickets+" at $"+paPrice);
                System.out.println("VIP Admission: "+vipTickets+" at $"+vipPrice);
                break;
            case 3: // change ticket prices
                System.out.println("*** Change Ticket Prices ***");
                // make sure to disable price changes after the event has started
                if (gaTickets > 0 || paTickets > 0 || vipTickets > 0)
                {System.out.println("Tickets for this event have already been sold");}
                else {
                System.out.println("1. General Admission");
                System.out.println("2. Premium Admission");
                System.out.println("3. VIP Admission");
                System.out.print("Which ticket price would you like to change?");
                int chngeOpt = scanner.nextInt();
                switch (chngeOpt){
                    case 1:
                        System.out.print("What would you like to change the General Admission price to?");
                        gaPrice = scanner.nextDouble();
                    case 2:
                        System.out.print("What would you like to change the Premium Admission price to?");
                        paPrice = scanner.nextDouble();
                    case 3:
                        System.out.print("What would you like to change the VIP Admission price to?");
                        vipPrice = scanner.nextDouble();
                }}
                break;
            case 4: // refund tickets
                System.out.println("*** Refund Tickets ***");
                // check for negative results
                // option to refund all tickets for current event with a confirmation
                break;
            case 5: // consolidate sales
                System.out.println("*** Consolidate Sales ***");
                // show how many of ticket has been sold for current event
                // show revenue for each
                // update current variables
                break;
        }
        } while (option != 0);
    }
}
