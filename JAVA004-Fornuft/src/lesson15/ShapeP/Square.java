package lesson15.ShapeP;

public class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.pow(side, 2);
    }
}
