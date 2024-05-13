package lesson13.Vehicle;

public class Bike extends Vehicle{
    int numWheels;

    public Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "numWheels=" + numWheels +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
