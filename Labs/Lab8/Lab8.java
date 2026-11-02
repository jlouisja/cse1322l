import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Lab8 { 
    public static int timeDelta(String time1, String time2) throws InvalidTimeException {
        String[] parts1 = time1.split(":");
        String[] parts2 = time2.split(":");

        if (parts1.length != 3 || parts2.length != 3) {
            throw new InvalidTimeException("Invalid time format. Expected HH:MM:SS.");
        }

        int hours1 = Integer.parseInt(parts1[0]);
        int minutes1 = Integer.parseInt(parts1[1]);
        int seconds1 = Integer.parseInt(parts1[2]);

        int hours2 = Integer.parseInt(parts2[0]);
        int minutes2 = Integer.parseInt(parts2[1]);
        int seconds2 = Integer.parseInt(parts2[2]);

        if (hours1 < 0 || hours1 > 23 || minutes1 < 0 || minutes1 > 59 || seconds1 < 0 || seconds1 > 59 ||
            hours2 < 0 || hours2 > 23 || minutes2 < 0 || minutes2 > 59 || seconds2 < 0 || seconds2 > 59) {
            throw new InvalidTimeException("Invalid time values. Hours must be between 0-23, minutes and seconds between 0-59.");
        }

        int totalSeconds1 = hours1 * 3600 + minutes1 * 60 + seconds1;
        int totalSeconds2 = hours2 * 3600 + minutes2 * 60 + seconds2;

        return Math.abs(totalSeconds1 - totalSeconds2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the input file name: ");
        String firstFile = scanner.nextLine(); 

        System.out.print("Enter the output file name: ");
        String secondFile = scanner.nextLine();
// Read every line in the first file. 
        File inputFile = new File(firstFile);
        File outputFile = new File(secondFile);
        try (Scanner fileScanner = new Scanner(inputFile);
             PrintWriter writer = new PrintWriter(outputFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] times = line.split(" ");
                timeDelta(times[0], times[1]);
            } 
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (InvalidTimeException e) {
            System.out.println("Invalid time format: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();    
       
    }
}