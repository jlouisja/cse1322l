import java.util.Scanner;
public class Lab2 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Count from a number to another");
        System.out.println("2. Determine largest number");
        System.out.println("3. Type in word");
        System.out.println("4. Quit");
        System.out.print("Enter option: ");
        int option = scanner.nextInt();
        System.out.println();

        switch (option){
            case 1:
                System.out.println();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.print("Shutting off...");
                break;
            default:
                System.out.println("Not a valid option...");
        }
    }
}
/*
•	Your main method must implement the following menu options:
        1.	Count from a number to another
            	Prompts the user for 2 numbers (start and end), both of which can be either positive or negative
            	If the numbers are the same, print “Start and end are the same!”
            	Otherwise, print the starting number, every number between the starting and the ending number, and the ending number, all in order from start to finish. Each number must be in its own line
            	Once done, print “Done counting”
        2.	Determine largest number:
            	Prompts the user for numbers until the user enters 0
            	If the number the user enters is larger than the current largest number, remember that number instead
            	The initial “largest” number should be 0
            	Once the user enters 0, print out “The largest number was X”, with X being the largest number the user entered
        3.	Type in word:
            	Print “Type in the word ‘Computer’: ”
            	If the user types in “Computer”, print “Correct!”
            	Otherwise, keep prompting the user to type until they type in “Computer”
        4.	Quit: Terminates the program
*/