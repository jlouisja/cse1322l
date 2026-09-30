// Jasmine Louis-Jacques
// CSE 1322L - B01
// Lab 5

import java.util.Scanner;

public class Lab5 { 
    public static void main(String[] args) {
        Checking checkingAccount = new Checking(0);
        Savings savingsAccount = new Savings(500);

        boolean running = true;
        while (running) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("*** WORLDS SMALLEST BANK ***");
            System.out.println("1. Withdraw from Checking Account");
            System.out.println("2. Withdraw from Savings Account");
            System.out.println("3. Deposit to Checking Account");
            System.out.println("4. Deposit to Savings Account");
            System.out.println("5. View Checking Account Balance");
            System.out.println("6. View Savings Account Balance");
            System.out.println("7. Award Interest to Savings Account");
            System.out.println("8. Exit");
            System.out.print("Please select an option: ");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println();
                    System.out.println(" *** Withdraw from Checking Account ***");
                    System.out.print("Enter amount to withdraw: $");
                    double amount = scanner.nextDouble();
                    checkingAccount.withdraw(amount);
                    System.out.println("Withdrawal successful.");
                    System.out.println("New balance: " + checkingAccount.getAccountBalance());
                    break;
                case "2":
                    System.out.println();
                    System.out.println(" *** Withdraw from Savings Account ***");
                    System.out.print("Enter amount to withdraw: $");
                    amount = scanner.nextDouble();
                    savingsAccount.withdraw(amount);
                    System.out.println("Withdrawal successful.");
                    System.out.println("New balance: " + savingsAccount.getAccountBalance());
                    break;
                case "3":
                    System.out.println();
                    System.out.println(" *** Deposit to Checking Account ***");
                    System.out.print("Enter amount to deposit: $");
                    amount = scanner.nextDouble();
                    checkingAccount.deposit(amount);
                    System.out.println("Deposit successful.");
                    System.out.println("New balance: " + checkingAccount.getAccountBalance());
                    break;
                case "4":
                    System.out.println();
                    System.out.println(" *** Deposit to Savings Account ***");
                    System.out.print("Enter amount to deposit: $");
                    amount = scanner.nextDouble();
                    savingsAccount.deposit(amount);
                    System.out.println("Deposit successful.");
                    System.out.println("New balance: " + savingsAccount.getAccountBalance());
                    break;
                case "5":
                    System.out.println();
                    System.out.println(" *** View Checking Account Balance ***");
                    System.out.println(checkingAccount.toString());
                    break;
                case "6":
                    System.out.println();
                    System.out.println(" *** View Savings Account Balance ***");
                    System.out.println(savingsAccount.toString());
                    break;
                case "7":
                    System.out.println();
                    System.out.println(" *** Award Interest to Savings Account ***");
                    savingsAccount.addInterest();
                    System.out.println("New balance: " + savingsAccount.getAccountBalance());
                    break;
                case "8":
                    System.out.println();
                    System.out.println("Thank you for using the World's Smallest Bank. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}