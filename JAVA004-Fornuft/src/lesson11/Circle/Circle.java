package lesson11.Circle;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    double areaCalculate(){
        return Math.pow(radius,2)*Math.PI;
    }
}
