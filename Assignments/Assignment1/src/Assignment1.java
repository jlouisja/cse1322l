// CSE1322L - B01
// Assignment 1
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class Assignment1 {

    void main(String[] args) {
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
            System.out.println();
            System.out.println("*** TICKET HUB ***");
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
                System.out.println("*** FINAL REPORT ***");
                System.out.println("General Admission -- Tickets Sold: "+totalGATickets+" Event Revenue: $"+totalGARevenue);
                System.out.println("Premium Admission -- Tickets Sold: "+totalPATickets+" Event Revenue: $"+totalPARevenue);
                System.out.println("VIP Admission -- Tickets Sold: "+totalVIPTickets+" Event Revenue: $"+totalVIPRevenue);
                System.out.println("Total Tickets: "+ (totalGATickets + totalPATickets + totalVIPTickets));
                System.out.println("Total Revenue: $"+(totalGARevenue + totalPARevenue + totalVIPRevenue));
                System.out.println("Bye! :)");
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
                        System.out.println("Sold "+paSold+" Premium Admission tickets at $"+paPrice+" for a total of $"+paSale);
                        break;
                    case 3:
                        System.out.print("How many?");
                        int vipSold = scanner.nextInt();
                        double vipSale = vipSold *vipPrice;
                        vipTickets += vipSold;
                        totalVIPTickets += vipSold;
                        totalVIPRevenue += vipSale;
                        System.out.println("Sold "+vipSold+" VIP Admission tickets at $"+vipPrice+" for a total of $"+vipSale);
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
                {System.out.println("Tickets for this event because sales have already started. Please refund tickets or consolidate sales.");}
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
                        System.out.println("General Admission ticket price has been updated.");
                        break;
                    case 2:
                        System.out.print("What would you like to change the Premium Admission price to?");
                        paPrice = scanner.nextDouble();
                        System.out.println("Premium Admission ticket price has been updated.");
                        break;
                    case 3:
                        System.out.print("What would you like to change the VIP Admission price to?");
                        vipPrice = scanner.nextDouble();
                        System.out.println("VIP Admission ticket price has been updated.");
                        break;
                }}
                break;
            case 4: // refund tickets
                System.out.println("*** Refund Tickets ***");
                System.out.println("1. General Admission");
                System.out.println("2. Premium Admission");
                System.out.println("3. VIP Admission");
                // option to refund all tickets for current event with a confirmation
                System.out.println("4. REFUND ALL TICKETS");
                System.out.print("Which ticket type would you like to refund?");
                int refundOpt = scanner.nextInt();
                switch (refundOpt){
                // check for negative results
                    case 1:
                        if (gaTickets == 0) {
                            System.out.print("There are no General Admission tickets to refund for the current event.");}
                        else {
                            System.out.print("How many General Admission tickets would you like to refund?");
                            int gaRefund = scanner.nextInt();
                            if (gaTickets - gaRefund < 0){
                                System.out.println("We have not sold that many General Admission tickets.");
                            }
                            else {
                                // total revenue
                                totalGARevenue -= (gaRefund * gaPrice);
                                // ga ticket
                                gaTickets -= gaRefund;
                                // total tickets
                                totalGATickets -= gaRefund;
                                System.out.println("We have refunded "+gaRefund+" General Admission tickets.");
                            }
                        }
                        break;
                    case 2:
                        if (paTickets == 0){
                            System.out.print("There are no Premium Admission tickets to refund for the current event.");}
                        else {
                            System.out.print("How many Premium Admission tickets would you like to refund?");
                            int paRefund = scanner.nextInt();
                            if (paTickets - paRefund < 0){
                                System.out.println("We have not sold that many Premium Admission tickets.");
                            }
                            else {
                                // pa ticket
                                paTickets -= paRefund;
                                // total tickets
                                totalPATickets -= paRefund;
                                // total revenue
                                totalPARevenue -= (paRefund * paPrice);
                                System.out.println("We have refunded "+paRefund+" Premium Admission tickets.");

                            }
                        }
                        break;
                    case 3:
                        if (vipTickets == 0){
                            System.out.print("There are no VIP Admission tickets to refund for the current event.");}
                        else {
                            System.out.print("How many VIP Admission tickets would you like to refund?");
                            int vipRefund = scanner.nextInt();
                            if (vipTickets - vipRefund < 0){
                                System.out.println("We have not sold that many VIP Admission tickets.");
                            }
                            else {
                                // vip
                                vipTickets -= vipRefund;
                                // total tickets
                                totalVIPTickets -= vipRefund;
                                // total revenue
                                totalVIPRevenue -= (vipRefund * vipPrice);
                                System.out.println("We have refunded "+vipRefund+" VIP Admission tickets.");

                            }
                        }
                        break;
                    case 4:
                        int totalCurrentSales = (gaTickets + paTickets +vipTickets);
                        if (totalCurrentSales == 0){
                            System.out.println("There are no tickets to refund.");
                        }
                        else {
                            System.out.println("!WARNING! Are you sure you want to refund all ticket sales? Type 'Y' to confirm.");
                            var confirm = scanner.next();
                            if (confirm.equals("Y")){
                                // adjust total revenue
                                totalVIPRevenue -= (vipTickets * vipPrice);
                                totalPARevenue -= (paTickets * paPrice);
                                totalGARevenue -= (gaTickets * gaPrice);
                                // adjust current ticket total
                                totalVIPTickets -= vipTickets;
                                totalPATickets -= paTickets;
                                totalGATickets -= gaTickets;
                                // adjusts total ticket total
                                vipTickets = 0;
                                paTickets = 0;

                                System.out.println("We have refunded all tickets for this event.");

                            }
                            else {break;}
                        }
                }
                break;
            case 5: // consolidate sales
                System.out.println("*** Sales and Revenue ***");
                // show the user how many of each ticket type has been sold for the current event,
                // show how many of ticket has been sold for current event
                System.out.println("General Admission -- Tickets Sold: "+gaTickets+" Event Revenue: $"+(gaTickets * gaPrice));
                System.out.println("Premium Admission -- Tickets Sold: "+paTickets+" Event Revenue: $"+(paTickets * paPrice));
                System.out.println("VIP Admission -- Tickets Sold: "+vipTickets+" Event Revenue: $"+(vipTickets * vipPrice));
                System.out.println("Total Tickets: "+ (gaTickets + paTickets + vipTickets));
                System.out.println("Total Revenue: $"+((gaTickets * gaPrice) + (paTickets * paPrice) + (vipTickets * vipPrice)));
                // show revenue for each
                // update current variables
                gaTickets = 0;
                paTickets = 0;
                vipTickets = 0;
                System.out.println("Event Ticket Sales Consolidated.");
                break;
        }
        } while (option != 0);
    }
}
