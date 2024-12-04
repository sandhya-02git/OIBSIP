import java.util.Scanner;

public class MCQ {
    // Define the MCQ questions and options
    private static String[] questions = {
        "What is the capital of France?",
        "Which programming language is known as the 'mother of all languages'?",
        "What is 5 + 3?"
    };
    
    private static String[][] options = {
        {"1. Paris", "2. London", "3. Rome", "4. Berlin"},
        {"1. Java", "2. C", "3. Assembly", "4. Python"},
        {"1. 6", "2. 7", "3. 8", "4. 9"}
    };

    private static int[] answers = {1, 2, 3}; // Correct answers (indices of options)

    public static void startExam(Scanner scanner) {
        int score = 0;
        System.out.println("\n--- Online Exam ---");

        // Loop through all the questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            // Display options
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Get user input for answer
            System.out.print("Enter your choice (1-4): ");
            int userAnswer = scanner.nextInt();

            // Check if the answer is correct
            if (userAnswer == answers[i]) {
                score++;
            }
        }

        // Show results
        System.out.println("\nExam completed! Your score: " + score + "/" + questions.length);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startExam(scanner);
        scanner.close();
    }
}

