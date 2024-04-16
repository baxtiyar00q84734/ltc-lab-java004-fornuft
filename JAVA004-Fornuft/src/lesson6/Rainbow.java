package lesson6;

import java.util.Arrays;

public class Rainbow {
    public static void main(String[] args) {

        String[] rainbowColors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet",};

        // for i
        for (int i = 0; i < rainbowColors.length; i++) {
            System.out.println(rainbowColors[i]);
        }

        // enhanced for
        for (String rc :rainbowColors){
            System.out.println(rc);
        }

        // with to string from java util (no cover yet)
        System.out.println(Arrays.toString(rainbowColors));

    }
}
