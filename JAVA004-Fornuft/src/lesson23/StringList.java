package lesson23;

import java.util.Arrays;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Bakhtiyar", "Qadim", "Teymur", "Fuad", "Riad");

        List<String> filteredString = stringList.stream().filter(str -> str.length() >= 5).toList();

        System.out.println(filteredString);
    }
}
