package lesson19;

import java.util.Scanner;

public class DoubleInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");

        String input = scanner.nextLine();
        Integer number = Integer.parseInt(input);

        double doubledNumber = number.doubleValue();

        System.out.println("double of " + number + " is " + doubledNumber);
    }
}
