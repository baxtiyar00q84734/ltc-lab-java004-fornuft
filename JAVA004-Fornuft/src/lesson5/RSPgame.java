package lesson5;

import java.util.Scanner;

public class RSPgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int computerScore = 0;
        int tieScore = 0;
        int numberOfRounds = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.println("Enter 'rock', 'paper', or 'scissors' (or 'quit' to exit):");
            String userInput = scanner.nextLine().toLowerCase();
            int userInputNum = 0;
            int compInput = (int) (Math.random() * 3) + 1;
            String compChoice = "";


            switch (userInput) {
                case "rock":
                    userInputNum = 1;
                    break;
                case "scissors":
                    userInputNum = 2;
                    break;
                case "paper":
                    userInputNum = 3;
                    break;
                case "quit":

                    System.out.println("Thank you for playing! Final scores:");
                    System.out.println("Player: " + playerScore);
                    System.out.println("Computer: " + computerScore);
                    System.out.println("Ties: " + tieScore);
                    return;
                default:
                    System.out.println("Invalid input, please try again.");
                    continue;
            }

            switch (compInput) {
                case 1:
                    compChoice = "rock";
                    break;
                case 2:
                    compChoice = "scissors";
                    break;
                case 3:
                    compChoice = "paper";
                    break;
            }

            System.out.println("Computer chose: " + compChoice);

            if (userInputNum == compInput) {
                System.out.println("It's a tie!");
                tieScore++;
            } else if ((userInputNum == 1 && compInput == 2) ||
                    (userInputNum == 2 && compInput == 3) ||
                    (userInputNum == 3 && compInput == 1)) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("You lose!");
                computerScore++;
            }

            numberOfRounds++;
        }
    }
}
