package lesson23;

import java.util.Arrays;
import java.util.List;

public class SkipMet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> remainingNumbers = numbers.stream()
                .skip(2)
                .toList();

        System.out.println(remainingNumbers);
    }
}

