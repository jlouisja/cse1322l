package Assignments.Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
    ArrayList<Content> contents = new ArrayList<Content>();
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
        //content menu
        System.out.println();
        System.out.println("*** Content Menu ***");
        System.out.println("1. Add Written Content");
        System.out.println("2. Add Image Content");
        System.out.println("3. Add Audio Content");
        System.out.println("4. Add Video Content");
        System.out.println("5. List All Content");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                // Add Written Content
                System.out.println();
                System.out.println("*** Add Written Content ***");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter description: ");
                String description = scanner.nextLine();
                System.out.print("Enter location: ");
                String location = scanner.nextLine();
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                System.out.print("Enter number of words: ");
                int words = scanner.nextInt();
                WrittenContent writtenContent = new WrittenContent(name, description, location, author, words);
                contents.add(writtenContent);
                System.out.println("Written content added successfully!");
                break;
            case 2:
                // Add Image Content
                System.out.println();
                System.out.println("*** Add Image Content ***");
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                System.out.print("Enter description: ");
                description = scanner.nextLine();
                System.out.print("Enter location: ");
                location = scanner.nextLine();
                System.out.print("Enter author: ");
                author = scanner.nextLine();
                System.out.print("Enter width: ");
                int width = scanner.nextInt();
                System.out.print("Enter height: ");
                int height = scanner.nextInt();
                int[] dimensions = {width, height};
                ImageContent imageContent = new ImageContent(name, description, location, author, dimensions);
                contents.add(imageContent);
                System.out.println("Image content added successfully!");
                break;
            case 3:
                // Add Audio Content
                System.out.println();
                System.out.println("*** Add Audio Content ***");
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                System.out.print("Enter description: ");
                description = scanner.nextLine();
                System.out.print("Enter location: ");
                location = scanner.nextLine();
                System.out.print("Enter duration (in milliseconds): ");
                int duration = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                System.out.print("Enter names of participants (blank when done): ");

                ArrayList<String> participants = new ArrayList<String>();
                String participant;
                while (!(participant = scanner.nextLine()).isEmpty()) {
                System.out.print("Enter names of participants (blank when done): ");

                    participants.add(participant);
                }
                AudioContent audioContent = new AudioContent(name, description, location, duration, participants);
                contents.add(audioContent);
                System.out.println("Audio content added successfully!");
                break;
            case 4:
                // Add Video Content
                System.out.println();
                System.out.println("*** Add Video Content ***");
                System.out.print("Enter name: ");
                name = scanner.nextLine();
                System.out.print("Enter description: ");
                description = scanner.nextLine();
                System.out.print("Enter location: ");
                location = scanner.nextLine();
                System.out.print("Enter duration (in milliseconds): ");
                duration = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                System.out.print("Enter resolution (240, 320, 480, 1080, 1440, 1920, 2048): ");
                int resolution = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                VideoContent videoContent = new VideoContent(name, description, location, duration, resolution);
                contents.add(videoContent);
                System.out.println("Video content added successfully!");
                break;
            case 5:
                // List All Content
                System.out.println();
                if (contents.isEmpty()) {
                    System.out.println("No content available.");
                } else {
                    System.out.println("*** List of All Content ***");
                    System.out.println();
                    for (Content content : contents) {
                        System.out.println(content.toString());
                        System.out.println();
                        System.out.println("--------------------");
                        System.out.println();
                    }
                }
                break;
            case 0:
                System.out.println("Exiting the program. Goodbye!");
                running = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

}
