package lesson11;

public class MyClass {
    private int number;


    public MyClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }

    public void printNumber(int number) {
        System.out.println("Parameter number: " + number); //   method parameter
        System.out.println("Instance variable number: " + this.number); //   instance variable
    }
}
