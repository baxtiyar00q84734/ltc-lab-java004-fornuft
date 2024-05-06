package lesson11.Car;

import lesson11.MyClass;

public class Main {


    public static void main(String[] args) {
        Car car=new Car("Mercedes","E200h");
        System.out.println(car);
        MyClass myClass=new MyClass(6);
        System.out.println(myClass.getNumber());
        int a=myClass.setNumber(10);
        System.out.println();
    }
}
