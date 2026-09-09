import java.util.Scanner;
public class Lab1 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[Budgeting System]");

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Hello, " + name + ". ");
        System.out.print("Please enter your monthly salary: ");
        double salary = scanner.nextFloat();
        System.out.println();
        double yearlySalary = salary * 12;

        System.out.print("What is the amount of your loan?: ");
        double loanPrincipal = scanner.nextFloat();
        System.out.print("What is the interest rate of your loan?: ");
        double loanInterest = scanner.nextFloat();
        System.out.println();
        loanInterest = loanInterest / 100;
        double newPrincipal = loanPrincipal * Math.pow(1 + (loanInterest / 12), 12);

        System.out.println("Your yearly salary is $" + yearlySalary);
        System.out.println("In 12 months, your loan's principal will be $" + newPrincipal);
        System.out.println();

        System.out.print("At the end of the year, you will have paid off your debt: ");
        System.out.println(yearlySalary >= newPrincipal);

        System.out.print("At the end of the year, you will still have some debt left: ");
        System.out.println(yearlySalary < newPrincipal);

        System.out.println("At the end of the year, you will have $" + (yearlySalary - newPrincipal));
        System.out.println();

        System.out.println("The government is offering loan relief for persons 25 and under, and for those 65 and over.");
        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        boolean eligibleForRelief = (age <= 25 || age >= 65);
        System.out.println("The relief is $10000. You are eligible for relief: " + eligibleForRelief);

        boolean loanPaidOff = (yearlySalary >= newPrincipal) || (eligibleForRelief && ((yearlySalary + 10000) >= newPrincipal));
        System.out.println("With or without relief, you will be able to pay your loan in full: " + loanPaidOff);
    }
}