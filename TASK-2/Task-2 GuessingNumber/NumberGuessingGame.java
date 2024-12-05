import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int numberOfTries = 0;
        int maxTries = 10;  // Maximum number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is? You have " + maxTries + " attempts.");

        // Loop for user input until they guess correctly or exhaust attempts
        while (userGuess != numberToGuess && numberOfTries < maxTries) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            // Provide feedback based on the guess
            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " attempts.");
                break;
            }

            // If the user reaches the maximum number of attempts
            if (numberOfTries == maxTries) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
            }
        }

        scanner.close();
    }
}
