import java.util.Scanner;
public class OnlineExam {

    public static void startExam() {
        Scanner scanner = new Scanner(System.in);

        // Start Timer with 5 minutes (300,000 milliseconds)
        Timer examTimer = new Timer(30* 1000);  // 5 minutes exam timer

        // Displaying questions and taking answers
        System.out.println("Welcome to the Online Exam!");
        System.out.println("Please answer the following question:");
        System.out.println("1. What is the capital of France?");
        System.out.println("a) London\nb) Paris\nc) Rome\nd) Madrid");
        
        String answer = scanner.nextLine();  // Taking input for the answer
        
        // Start the timer
        examTimer.start();  // Start the countdown timer

        // After time is up, submit the exam
        submitExam();
    }

    public static void submitExam() {
        System.out.println("Your exam has been submitted.");
        // Further processing of the answers can be done here
    }

    public static void main(String[] args) {
        startExam();  // Start the exam when the program runs
    }
}

