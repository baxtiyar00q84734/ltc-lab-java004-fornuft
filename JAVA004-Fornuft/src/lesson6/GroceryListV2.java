package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        System.out.println("Enter the items for your grocery list. Type 'DONE' when you are finished:");


        while (true) {
            String input = scanner.nextLine();

            if ("DONE".equalsIgnoreCase(input)) {
                break;
            }

            groceryList.add(input);
        }

        System.out.println("\nYour grocery list:");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }
}
