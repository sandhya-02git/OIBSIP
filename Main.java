import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example of where the user might choose to log out
        System.out.println("Welcome to the Online Exam System!");
        
        // Option to either start exam or log out
        System.out.println("1. Start Exam");
        System.out.println("2. Log Out");
        System.out.print("Choose an option: ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            // Code to start the exam (you can integrate the MCQ timer or other exam features here)
            System.out.println("Starting the exam...");
        } else if (choice == 2) {
            // Log out
            Logout.logout();
        } else {
            System.out.println("Invalid choice. Exiting.");
        }
        
        scanner.close();
    }
}
