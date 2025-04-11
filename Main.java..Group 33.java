
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Student");
            System.out.println("2. Program");
            System.out.println("3. Exit");
            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = input.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentID = input.nextLine();
                    System.out.println("Student Information:");
                    System.out.println("Name: " + studentName);
                    System.out.println("ID: " + studentID);
                    break;

                case 2:
                    System.out.print("Enter program name: ");
                    String programName = input.nextLine();
                    System.out.print("Enter program duration: ");
                    String duration = input.nextLine();
                    System.out.println("Program Information:");
                    System.out.println("Name: " + programName);
                    System.out.println("Duration: " + duration);
                    break;

                case 3:
                    keepRunning = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        input.close();
    }
}
