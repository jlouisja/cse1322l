// Jasmine Louis-Jacques
// CSE 1322L
// Lab 4

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkWallet wallet = new ParkWallet(100);

        boolean prompt = true;

        //	In a loop, implement the following menu options:
        while (prompt) {
            System.out.println();
            System.out.println("*** Park Wallet Menu ***");
            System.out.println("1. Add tickets");
            System.out.println("2. Set tickets");
            if (ParkWallet.getHoliday()) {
                System.out.println("3. Buy prize (Holiday Prices!)");
            } else {
                System.out.println("3. Buy prize");
            }
            
            System.out.println("4. Set holiday");
            System.out.println("5. Quit");
            System.out.println("Current tickets: " + wallet.getTickets());
            System.out.print("Choose a menu option: ");

            String option = scanner.nextLine();
            switch(option){
                // 1.	Add tickets: Prompts the user for the number of tickets to add to the wallet, incrementing the wallet with the number of tickets entered.
                case "1":
                    // Add tickets
                    System.out.println("*** Add Tickets *** ");
                    System.out.print("Enter the number of tickets to add: ");
                    int ticketsToAdd = scanner.nextInt();
                    wallet.addTickets(ticketsToAdd);
                    scanner.nextLine(); 
                    System.out.println("Added " + ticketsToAdd + " tickets.");
                    break;
                // 2.	Set tickets: Prompts the user for the number of tickets to which their wallet should be set to.
                case "2":
                    // Set tickets
                    System.out.println("*** Set Tickets *** ");
                    System.out.print("Enter the number of tickets to set: ");
                    int ticketsToSet = scanner.nextInt();
                    wallet.setTickets(ticketsToSet);
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.println("*** Buy Prize *** ");
                    // 3.	Buy prize: 
                    // The prizes are worth 150, 350, and 600 points respectively. 
                    int tshirtPrice = 150;
                    int sunHatPrice = 350;
                    int sneakersPrice = 600;
                    // Shows the user 3 prizes they can buy: a t-shirt, a sun hat, and a pair of sneakers. 
                    // If the user has enough tickets to buy a prize, deduce that many tickets from their wallet and then print a saying the purchase went through, otherwise, print an error message.
                    if (ParkWallet.getHoliday()) {
                        // 	If it is currently a holiday, the above prices should be 50% off
                        System.out.println("Holiday prices are in effect! All prizes are 50% off.");
                        tshirtPrice = (int) (tshirtPrice * 0.5);
                        sunHatPrice = (int) (sunHatPrice * 0.5);
                        sneakersPrice = (int) (sneakersPrice * 0.5);
                        System.out.println("1. T-shirt: " + tshirtPrice + " tickets");
                        System.out.println("2. Sun Hat: " + sunHatPrice + " tickets");
                        System.out.println("3. Sneakers: " + sneakersPrice + " tickets");
                    } else {
                        System.out.println("1. T-shirt: " + tshirtPrice + " tickets");
                        System.out.println("2. Sun Hat: " + sunHatPrice + " tickets");
                        System.out.println("3. Sneakers: " + sneakersPrice + " tickets");
                    }
                    System.out.print("Enter the number of the prize you want to buy: ");
                    int prizeChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (prizeChoice) {
                        case 1:
                            if (wallet.removeTickets(tshirtPrice)) {
                                System.out.println("You have successfully purchased a T-shirt for " + tshirtPrice + " tickets!");
                            } else {
                                System.out.println("You do not have enough tickets to buy a T-shirt.");
                            }
                            break;
                        case 2:
                            if (wallet.removeTickets(sunHatPrice)) {
                                System.out.println("You have successfully purchased a Sun Hat for " + sunHatPrice + " tickets!");
                            } else {
                                System.out.println("You do not have enough tickets to buy  sun hat.");
                            }
                            break;
                        case 3:
                            if (wallet.removeTickets(sneakersPrice)) {
                                System.out.println("You have successfully purchased Sneakers for " + sneakersPrice + " tickets!");
                            } else {
                                System.out.println("You do not have enough tickets to buy Sneakers.");
                            }
                            break;
                        default:
                            System.out.println("Invalid prize choice.");
                    }
                    break;
                case "4":
                    // 4.	Set holiday: Flips the ParkWallet static field to its current opposite, using the appropriate method
                    ParkWallet.setHoliday(!ParkWallet.getHoliday());
                    if (ParkWallet.getHoliday()) {
                        System.out.println("It is now a holiday!");
                    } else {
                        System.out.println("It is no longer a holiday.");
                    }
                    break;
                case "5":
                // 5.	Quit: Terminates the program
                    prompt = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
    
}
