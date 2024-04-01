package lesson3;

import java.util.Scanner;

public class GuessNumberGameV2 {
    public static void main(String[] args) {

        System.out.println("Welcome to The Guess Game, please try to guess the number(1-10), I'm thinking of.");

        Scanner scanner = new Scanner(System.in);
        int rand = (int) (Math.random() * 10) + 1;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess (" + (i) + "/3):");
            double input = scanner.nextByte();

            if (input >= 1 && input <= 10) {
                if (input > rand) {
                    System.out.println("Too high. " + "My number was " + rand);
                } else if (input < rand) {
                    System.out.println("Too low. " + "My number was " + rand);
                } else {
                    System.out.println("Congratulations.");
                    break;
                }
            } else {
                System.out.println("My number is not in the this range, please try again and give input between 1-10.");
            }
        }
    }
}
