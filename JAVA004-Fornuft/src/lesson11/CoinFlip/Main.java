package lesson11.CoinFlip;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userWins = 0;
        int computerWins = 0;

        System.out.println("Welcome to the Coin Flip game!");
        while (userWins < 3 && computerWins < 3) {
            System.out.println("Guess 'Heads' or 'Tails': ");
            String userGuess = scanner.nextLine().toLowerCase();

            if (!userGuess.equals("heads") && !userGuess.equals("tails")) {
                System.out.println("Invalid input. Please guess 'Heads' or 'Tails'.");
                continue;
            }

            int coinResult = random.nextInt(2); //  0 or 1
            String result = (coinResult == 0) ? "heads" : "tails";

            System.out.println("The coin shows: " + result);

            if (userGuess.equals(result)) {
                System.out.println("Congratulations! Your guess was correct.");
                userWins++;
            } else {
                System.out.println("Sorry, your guess was incorrect.");
                computerWins++;
            }

            System.out.println("User Wins: " + userWins + ", Computer Wins: " + computerWins);

            if (userWins == 3) {
                System.out.println("Congratulations! You won 3 games. Game over!");
            } else if (computerWins == 3) {
                System.out.println("Computer wins 3 games. Game over!");
            } else {
                System.out.println("Do you want to play again? (yes/no)");
                String playChoice = scanner.nextLine().toLowerCase();

                if (!playChoice.equals("yes")) {
                    break;
                }
            }
        }

        System.out.println("Thanks for playing!");
    }
}
