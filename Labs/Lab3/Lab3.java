// Jasmine Louis-Jacques
// CSE 1322L
// Lab 3


import java.util.ArrayList;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	outside main loop, create an arraylist to hold arrays of strings called “phonebook”
        ArrayList<String[]> phonebook = new ArrayList<>();
        boolean prompt = true;

        while(prompt) {
            System.out.println();
            System.out.println("*** Phonebook Menu ***");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. List Contacts");
            System.out.println("4. Search Contacts");
            System.out.println("5. Quit");
            System.out.print("Choose a menu option: ");

            String option = scanner.nextLine();
            switch(option){
            // add contact
                case "1":
                    System.out.println("*** Add Contact ***");

                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter contact phone number: ");
                    String phone = scanner.nextLine();

                    // Store both of them in an array of strings.
                    String[] contact = new String[2];
                    contact[0] = name;
                    contact[1] = phone;
                    // then store array in phonebook array list
                    phonebook.add(contact);

                    System.out.println("New contact has been added.");
                    break;

            // remove contact
                case "2":
                    System.out.println("*** Remove Contact ***");
                    if (phonebook.isEmpty()){
                        System.out.println("The phonebook is empty.");
                    } else {
                        // ask for name and traverse
                        System.out.print("Enter the name of the contact you would like to remove: ");
                        String contactName = scanner.nextLine();
                        boolean found = false;
                        for (int i = 0; i < phonebook.size(); i++) {
                            String[] nameSearch = phonebook.get(i);
                            // name must match exactly
                            if (nameSearch[0].equals(contactName)) {
                                // more than one match - remove only the first
                                phonebook.remove(i);
                                found = true;
                                break;
                            }
                        }
                        // no match - No contact with that name
                        if (found) {
                            System.out.println("Contact removed.");
                        } else {
                            System.out.println("No contact with that name.");
                        }
                    }
                    break;

            // list contacts - Name: X | Phone: Y
                case "3":
                    System.out.println("*** Contact List ***");
                    if (phonebook.isEmpty()){
                        System.out.println("The phonebook is empty.");
                    } else {
                        for (int i = 0; i < phonebook.size(); i++) {
                            String[] nameSearch = (String[]) phonebook.get(i);
                            System.out.println("Name: " + nameSearch[0] + " | Phone: " + nameSearch[1]);
                        }
                    }
                    break;
            // search contacts
                case "4":
                    System.out.println("*** Contact Search ***");
                    if (phonebook.isEmpty()){
                        System.out.println("The phonebook is empty.");
                    } else {
                        System.out.print("Enter keyword to search for: ");
                        String search = scanner.nextLine();
                        System.out.println("Searching contacts for keyword...");
                        boolean found = false;
                        for (int i = 0; i < phonebook.size(); i++) {
                            String[] nameSearch = phonebook.get(i);
                            if (nameSearch[0].contains(search)) {
                                System.out.println("Name: " + nameSearch[0] + " | Phone: " + nameSearch[1]);
                                found = true;
                            }
                        }
                        // no match - No contact with that name
                        if (!found) {
                            System.out.println("No contacts contained that keyword.");
                        }
                    }
                    break;
            // quit
                case "5":
                    System.out.println("Exiting phonebook..");
                    prompt = false;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
   }
    }
}
