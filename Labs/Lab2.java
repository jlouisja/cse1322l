// Jasmine Louis-Jacques
// CSE1322 - B01
// Lab 2

import java.util.Objects;
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

        switch (option) {
            case 1:
                System.out.print("Enter your starting number: ");
                int firstNumber = scanner.nextInt();
                System.out.print("Enter your ending number: ");
                int secondNumber = scanner.nextInt();

                if (firstNumber == secondNumber) {
                    System.out.println("Start and end are the same!");
                } else if (firstNumber > secondNumber) {
                    System.out.println("Counting from "+firstNumber+" to "+secondNumber+"...");

                    do {
                        System.out.println(firstNumber);
                        firstNumber--;
                    } while (firstNumber >= secondNumber);
                } else {
                    System.out.println("Counting from "+firstNumber+" to "+secondNumber+"...");
                    do {
                        System.out.println(firstNumber);
                        firstNumber++;
                    } while (firstNumber <= secondNumber);
                }
                System.out.println("Done counting! :)");
                break;
            case 2:
                int currentLargest = 0;
                int newNumber;
                System.out.println("This option will display the largest number entered. Enter 0 when done.");
                do {
                    System.out.print("Enter a number (current largest is " + currentLargest + "): ");
                    newNumber = scanner.nextInt();
                    if (newNumber > currentLargest){currentLargest = newNumber;}

                }
                while (newNumber != 0);

                System.out.println("The largest number entered was "+currentLargest);
                break;
            case 3:
                String correctWord = "Computer";
                String typedWord;
                System.out.print("Type in the word 'Computer': ");
                typedWord = scanner.next();
                do {
                    System.out.print("Incorrect. You must type the word 'Computer': ");
                    typedWord = scanner.next();
                } while (!Objects.equals(typedWord, correctWord));
                System.out.print("Correct!");

                break;
            case 4:
                System.out.print("Shutting off...");
                break;
            default:
                System.out.println("Not a valid option...");
        }
    }
}