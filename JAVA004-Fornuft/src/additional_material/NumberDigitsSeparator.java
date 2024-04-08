package additional_material;

import java.util.Scanner;

public class NumberDigitsSeparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//7488
        int reversedN = 0;

        while (n > 0) {
            int digit = n % 10;
            reversedN = reversedN * 10 + digit;
            n /= 10;

        }

        // System.out.println(reversedN);

        boolean isFirstDigit = true;

        while (reversedN > 0) {
            if (!isFirstDigit) {
                System.out.print("-");
            }
            int temp = reversedN % 10;
            reversedN /= 10;
            System.out.print(temp);
            isFirstDigit = false;
        }
    }
}
