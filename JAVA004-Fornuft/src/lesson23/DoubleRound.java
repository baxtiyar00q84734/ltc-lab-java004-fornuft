package lesson23;

import java.util.Arrays;
import java.util.List;

public class DoubleRound {
    public static void main(String[] args) {
        double[] numbers = {1.2, 3.5, 4.7, -2.3, 6.8};

        int[] roundedNumbers = Arrays.stream(numbers)
                .mapToInt(d -> (int) Math.round(d))
                .toArray();

        System.out.println(Arrays.toString(roundedNumbers));
    }
}
