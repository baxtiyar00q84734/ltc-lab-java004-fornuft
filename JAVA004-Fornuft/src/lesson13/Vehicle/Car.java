package lesson13.Vehicle;

public class Car extends Vehicle{
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
