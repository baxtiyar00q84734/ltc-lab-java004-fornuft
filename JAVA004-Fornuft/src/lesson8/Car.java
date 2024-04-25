package lesson8;

public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Car Make: " + make + ", Model: " + model + ", Year: " + year);
    }

    public boolean isOldCar() {

        if (year < 2010) {
            return true;
        } else return false;

        // return year < 2010;
    }

}
