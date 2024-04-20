package lesson7;

import java.util.Arrays;

public class CarInventory {
    public static void main(String[] args) {
        String[][] cars={
                {"Mercedes-Benz", "BMW", "Volkswagen", "Audi", "Porsche"},
                {"Jaguar", "Mini", "Rolls-Royce", "Land Rover", "Bentley"},
                {"Renault", "Peugeot", "Citroën", "Bugatti", "DS Automobiles"},
                {"Hyundai", "Kia", "Genesis", "SsangYong", "Renault Samsung Motors"},
                {"Ford", "Chevrolet", "Tesla", "Dodge", "Jeep"}
        };

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// have to finish 3 part is missing