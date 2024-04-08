package additional_material;

import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add sides of triangle:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("It is a triangle");
            } else {
                System.out.println("It is not a triangle");
            }
        } else {
            System.out.println("Sides must be greater than zero");
        }
    }
}
