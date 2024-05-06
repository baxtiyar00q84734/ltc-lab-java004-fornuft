package lesson11;

import java.util.Scanner;

public class FullNameConcatenation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String fullName = firstName.concat(" ").concat(lastName);

//      String fullName = firstName + " " + lastName;

        System.out.println("Your full name is: " + fullName);
    }
}
