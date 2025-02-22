package lesson23;

import java.util.Arrays;
import java.util.List;

public class ProductOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);


        System.out.println("Product of all numbers: " + product);
    }
}
