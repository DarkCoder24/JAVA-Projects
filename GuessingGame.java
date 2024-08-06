// TASK-2 CREATE A GUESSING GAME

import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);                           // sc-->scanner
        int randomNumber = random.nextInt(10) + 1;               // generates a random number between 1 and 10
        int attempts = 0;
        boolean correctGuess = false;

        System.out.println("Guess a number between 1 and 10:");

        while (!correctGuess) 
        {
            attempts++;
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess < randomNumber) 
            {
                System.out.println("Too low Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high Try again.");
            } else {
                correctGuess = true;
            }
        }

        System.out.println("Congratulations You guessed the number in " + attempts + " attempts.");
    }
}
