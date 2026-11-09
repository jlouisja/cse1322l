import java.util.Scanner;
import java.util.ArrayList;
public class Lab9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alarm> alarms = new ArrayList<>();

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("*** Alarm Menu ***");
            System.out.println("1. Create a new alarm");
            System.out.println("2. List all alarms");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter alarm name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter timer in seconds: ");
                    if (!scanner.hasNextInt() || scanner.nextInt() <= 0) {
                        System.out.println("Invalid input. Please enter a valid number for the timer.");
                        scanner.nextLine(); // consume the invalid input
                        break;
                    }
                    int timer = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    Alarm alarm = new Alarm(name, timer);
                    alarms.add(alarm);
                    alarm.start();
                    break;
                case 2:
                    System.out.println("*** Current Alarms ***");
                    for (Alarm a : alarms) {
                        if (a.timer > 0){
                            System.out.println(a.toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Stopping all alarms...");
                    for (Alarm a : alarms) {
                        a.interrupt();
                    }
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}