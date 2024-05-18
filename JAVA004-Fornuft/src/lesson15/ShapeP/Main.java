package lesson15.ShapeP;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        Square square=new Square(10);
        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());
    }
}
