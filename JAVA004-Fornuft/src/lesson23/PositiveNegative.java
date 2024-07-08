package lesson23;

import java.util.Arrays;
import java.util.List;

public class PositiveNegative {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 4, 6, -5, 11);

        System.out.println("Positive:");

        List<Integer> positiveNums = numbers.stream()
                .filter(num -> num > 0)
                .toList();
        //  .collect(Collectors.toList());

        System.out.println(positiveNums);

        System.out.println("Negative:");

        List<Integer> negativeNums = numbers.stream()
                .filter(num -> num < 0)
                .toList();

        System.out.println(negativeNums);
    }
}
