// TASK-1 Number Game
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int maxAttempts = 6;                                     // maximum number of attempts per round
        int maxRounds = 5;                                       // maximum number of rounds
        int score = 0;                                           // user's score

        Scanner sc = new Scanner(System.in);                     //sc-->scanner
        Random random = new Random();
        for (int round = 1; round <= maxRounds; round++) {
            int numberToGuess = random.nextInt(100) + 1;   // generate a random number between 1 and 100
            int attempts = 0;

            System.out.println("Round " + round + ":");
            System.out.println("I'm thinking of a number between 1 and 100.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println(" Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1;         //increment score based on attempts taken
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you didn't guess the number. It was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (y/n): ");
            String response = sc.next();

            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Your final score is " + score + ".");
    }
}