package lesson14.MathOperation;

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println(math.add(5, 3));
        System.out.println(math.add(5.5, 3.7));

        System.out.println(math.subtract(8, 3));
        System.out.println(math.subtract(8.7, 3.2));

        System.out.println(math.multiply(4, 6));
        System.out.println(math.multiply(4.5, 3.2));

        System.out.println(math.divide(10, 2));
        System.out.println(math.divide(10.5, 3));

        System.out.println(math.divide(10.5));
    }
}
