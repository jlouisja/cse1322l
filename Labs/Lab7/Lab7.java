package Labs.Lab7;
import java.util.Scanner;

public class Lab7 {

    int recursiveMultiply(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + recursiveMultiply(a, b - 1);
        }
    }
    int recursiveDivision(int a, int b) {
        if (b == 0) {
            return -1;        
        }
        else {
            if (a < b) {
                return 0;
            } else 
                return 1 + recursiveDivision(a - b, b);
            
        }
    }
    int recursiveRemainder(int a, int b) {
        if (b == 0) {
            return -1;        
        }
        else if (a < b) {
            return a;
        }
        else {
            return recursiveRemainder(a - b, b);
        }
    }
    String recursiveEcho(String str, int n) {
        if (n == 0) {
            return "";
        } else {
            return str + recursiveEcho(str, n - 1);
        }
    }
    boolean recursiveReverse(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        if (str1.isEmpty()) {
            return true;
        }
        if (str1.charAt(0) != str2.charAt(str2.length() - 1)) {
            return false;
        }
        return recursiveReverse(str1.substring(1), str2.substring(0, str2.length() - 1));
    }
    void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" *** Recursive Functions Menu ***");
        boolean running = true;
        while (running) {
            System.out.println("1. Multiply 2 Numbers");
            System.out.println("2. Divide 2 Numbers");
            System.out.println("3. Mod 2 Number");
            System.out.println("4. Echo Sentence");
            System.out.println("5. Determine Reverse");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int b = scanner.nextInt();
                    int product = recursiveMultiply(a, b);
                    System.out.println("Product: " + product);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter dividend: ");
                    a = scanner.nextInt();
                    System.out.print("Enter divisor: ");
                    b = scanner.nextInt();
                    System.out.println("Quotient: " + recursiveDivision(a, b));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter dividend: ");
                    a = scanner.nextInt();
                    System.out.print("Enter divisor: ");
                    b = scanner.nextInt();
                    int remainder = recursiveRemainder(a, b);
                    System.out.println("Remainder: " + remainder);
                    System.out.println();
                    break;
                case 4:
                    scanner.nextLine(); 
                    System.out.print("Enter a string: ");
                    String str = scanner.nextLine();
                    System.out.print("Enter number of times to echo: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    String echoedString = recursiveEcho(str, n);
                    System.out.println("String Echoed " + n + " times: " + echoedString);
                    System.out.println();
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("Enter first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    String str2 = scanner.nextLine();
                    boolean isReverse = recursiveReverse(str1, str2);
                    if (isReverse) {
                        System.out.println(str2 + " is the reverse of " + str1);
                    } else {
                        System.out.println(str2 + " is not the reverse of " + str1);
                    }
                    System.out.println();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting the program ...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}