package lesson23;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageStringLength {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("Bakhtiyar", "Qadim", "Teymur", "Fuad", "Riad");

        OptionalDouble averageLength = word.stream()
                .mapToInt(String::length)
                .average();

        System.out.println(averageLength);
    }
}
