package lesson13;

public class MathUtils {
    public final int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        int result = math.add(5, 3);
        System.out.println("Result: " + result);
    }
}
