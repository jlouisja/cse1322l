
// Jasmine Louis-Jacques
// CSE 1322L
// Assignment 2
 
import java.util.ArrayList;

public class Assignement2 {
    public static boolean populateAccounts(ArrayList<Account> accounts, String filename) {
        ArrayList<String> transactions = TransactionLoader.loadTransactions(filename);
        if (transactions != null) {
           // 2.	In a loop, read every element in "transactions".
           for (String transaction : transactions) {
                //	Extract the parties involved and the amount
                // 	Pass the giver, the receiver, and the amount, in that order, to Entry.createEntries(). Save the returned array
                // 	Retrieve the Account objects of both the sender and the receiver from "accounts"
                // •	If the sender or the receiver don't have accounts, create and append them to "accounts"
                // 	Call the postEntry() method of the giver's Account object using the Entry at index 0 of the array above
                // 	Call the postEntry() method of the receiver's Account object using the Entry at index 1 of the array above

            }
         
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        // Create an arraylist of Accounts called "ledger". Then, in a loop, implement the following menu options:
        // 1.	Load file: prompts the user for a file name, passing said name and "ledger" to populateAccounts(). If the method call returns true, print a success message. Otherwise, print an error message
        // 2.	Show all accounts: prints the "owner" field of all objects in "ledger", one per line
        // 3.	Show account statement: prompts the user for an account name. If no account has the user's input as its "owner", print an error message. Otherwise, print the getStatement() of that account
        // 4.	List all entries in account: prompts the user for an account name. If no account has the user's input as its "owner", print an error message then return to the menu. Otherwise, prompt the user for the name of a counterparty, then pass the counterparty's name to the account's listByCounterParty()
        // 5.	Quit: Terminates the program

    }
  
}
