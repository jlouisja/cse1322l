
// Jasmine Louis-Jacques
// CSE 1322L
// Assignment 2
 
import java.util.ArrayList;
import java.util.Scanner;

public class Assignement2 {
    public static boolean populateAccounts(ArrayList<Account> accounts, String filename) {
        ArrayList<String> transactions = TransactionLoader.loadTransactions(filename);
        if (transactions != null) {
           // 2.	In a loop, read every element in "transactions".
           for (String transaction : transactions) {
                //	Extract the parties involved and the amount
                String sender = transaction.split(" ")[0];
                String receiver = transaction.split(" ")[1];
                int amount = Integer.parseInt(transaction.split(" ")[2]);
                // Entry.createEntries(). Save the returned array
                Entry[] entries = Entry.createEntries(sender, receiver, amount);
                // 	Retrieve the Account objects of both the sender and the receiver from "accounts"
                Account senderAccount = null;
                Account receiverAccount = null;
                for (Account account : accounts) {
                    if (account.getOwner().equals(sender)) {
                        senderAccount = account;
                    }
                    if (account.getOwner().equals(receiver)) {
                        receiverAccount = account;
                    }
                }
                // •	If the sender or the receiver don't have accounts, create and append them to "accounts"
                if (senderAccount == null) {
                    senderAccount = new Account(sender);
                    accounts.add(senderAccount);
                }
                if (receiverAccount == null) {
                    receiverAccount = new Account(receiver);
                    accounts.add(receiverAccount);
                }
                // 	Call the postEntry() method of the giver's Account object using the Entry at index 0 of the array above
                senderAccount.postEntry(entries[0]);
                // 	Call the postEntry() method of the receiver's Account object using the Entry at index 1 of the array above
                receiverAccount.postEntry(entries[1]);

            }
         
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // Create an arraylist of Accounts called "ledger".
        ArrayList<Account> ledger = new ArrayList<>();
        boolean prompt = true;
        Scanner scanner = new Scanner(System.in);

        while (prompt) {
            System.out.println("*** Ledger App ***s");
            // Print the following menu:
            System.out.println("1. Load file");
            System.out.println("2. Show all accounts");
            System.out.println("3. Show account statement");
            System.out.println("4. List all entries in account");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    // Load file
                    System.out.print("Enter the filename: ");
                    String filename = scanner.nextLine();
                    if (populateAccounts(ledger, filename)) {
                        System.out.println("File loaded successfully.");
                    } else {
                        System.out.println("Error loading file.");
                    }
                    break;
                case "2":
                    // Show all accounts
                    System.out.println("Accounts:");
                    for (Account account : ledger) {
                        System.out.println(account.getOwner());
                    }
                    break;
                case "3":
                    // Show account statement
                    System.out.print("Enter the account name: ");
                    String accountName = scanner.nextLine();
                    Account account = null;
                    for (Account acc : ledger) {
                        if (acc.getOwner().equals(accountName)) {
                            account = acc;
                            break;
                        }
                    }
                    if (account != null) {
                        System.out.println(account.getStatement());
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case "4":
                    // List all entries in account
                    System.out.print("Enter the account name: ");
                    String accName = scanner.nextLine();
                    Account accToList = null;
                    for (Account acc : ledger) {
                        if (acc.getOwner().equals(accName)) {
                            accToList = acc;
                            break;
                        }
                    }
                    if (accToList != null) {
                        System.out.print("Enter the counterparty name: ");
                        String counterpartyName = scanner.nextLine();
                        ArrayList<Entry> entries = accToList.listByCounterparty(counterpartyName);
                        for (Entry entry : entries) {
                            System.out.println(entry.toString());
                        }
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case "5":
                    // Quit
                    System.out.println("Exiting the ledger. Goodbye!s");
                    prompt = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        // Then, in a loop, implement the following menu options:
        // 1.	Load file: prompts the user for a file name, passing said name and "ledger" to populateAccounts(). If the method call returns true, print a success message. Otherwise, print an error message
        // 2.	Show all accounts: prints the "owner" field of all objects in "ledger", one per line
        // 3.	Show account statement: prompts the user for an account name. If no account has the user's input as its "owner", print an error message. Otherwise, print the getStatement() of that account
        // 4.	List all entries in account: prompts the user for an account name. If no account has the user's input as its "owner", print an error message then return to the menu. Otherwise, prompt the user for the name of a counterparty, then pass the counterparty's name to the account's listByCounterParty()
        // 5.	Quit: Terminates the program

    }
  
}
