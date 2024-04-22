package lesson7;


import java.util.Scanner;

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
        Scanner scanner=new Scanner(System.in);
        System.out.println("Which place you want to change?");
        int row=scanner.nextInt(),column=scanner.nextInt();
        cars[row][column]= scanner.next();

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }

}
