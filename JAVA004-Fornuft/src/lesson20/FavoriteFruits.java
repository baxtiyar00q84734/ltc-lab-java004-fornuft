package lesson20;

import java.util.ArrayList;

public class FavoriteFruits {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Strawberry");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
