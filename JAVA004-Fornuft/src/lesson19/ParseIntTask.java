package lesson19;

import java.util.Scanner;

public class ParseIntTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        String ageInput = scanner.nextLine();

        int age = Integer.parseInt(ageInput);

        int yearsUntil18 = 18 - age;

        if (yearsUntil18 > 0) {
            System.out.println("You will turn 18 in " + yearsUntil18 );
        } else {
            System.out.println("You are already 18 or older.");
        }
    }
}
