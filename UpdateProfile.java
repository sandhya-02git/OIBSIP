
    import java.util.Scanner;

    public class UpdateProfile {
        private static String currentUsername = "admin";
        private static String currentPassword = "password123";
    
        public static void update(Scanner scanner) {
            System.out.println("\n--- Update Your Profile ---");
            System.out.print("Enter new username: ");
            currentUsername = scanner.nextLine();
            System.out.print("Enter new password: ");
            currentPassword = scanner.nextLine();
            System.out.println("\nProfile updated successfully!");
        }
    
        public static String getUsername() {
            return currentUsername;
        }
    
        public static String getPassword() {
            return currentPassword;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Profile Update System!");
    
            update(scanner);
            System.out.println("\n--- Updated Profile Details ---");
            System.out.println("Username: " + getUsername());
            System.out.println("Password: " + getPassword());
    
            scanner.close();
        }
    }

    
    

