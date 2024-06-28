package lesson20;

import java.util.HashSet;

public class HashNumbers {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);


        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
