package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //car
        Car car = new Car("Mercedes", "E200", 2020);
        car.printDetails();

        car.isOldCar();
        System.out.println(car.isOldCar());
        //student
        Student student = new Student("Sabir", 87, true);
        student.printDetails();

        student.isPassing();

        // task entertaining

    }
}
