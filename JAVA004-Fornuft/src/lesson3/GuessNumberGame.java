package lesson3;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        System.out.println("Welcome to The Guess Game, please try to guess the number(1-10), I'm thinking of.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a try:");
        double input = scanner.nextByte();

        int rand = (int) (Math.random() * 10) + 1;

        if (input >= 1 && input <= 10) {
            if (input > rand) {
                System.out.println("Too high. " + "My number was " + rand);
            } else if (input < rand) {
                System.out.println("Too low. " + "My number was " + rand);
            } else {
                System.out.println("Congratulations.");
            }
        } else {
            System.out.println("My number is not in the this range, please try again and give input between 1-10.");
        }
    }
}
