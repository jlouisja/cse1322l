// Jasmine Louis-Jacques
// CSE 1322L - B01
// Lab 6 - Fibonacci Calculator

package Labs.Lab6;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
            FibFormula formula = new FibFormula();
            FibIteration iteration = new FibIteration();

            System.out.println();
            System.out.println("*** FIBONACCI CALCULATOR ***");
            System.out.print("Which position of the Fibonacci sequence would you like to calculate?: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            System.out.println("Fibonacci of " + n + " using iteration: " + iteration.calculateFib(n));
            System.out.println("Fibonacci of " + n + " using Binet's formula: " + formula.calculateFib(n));
    }
}
