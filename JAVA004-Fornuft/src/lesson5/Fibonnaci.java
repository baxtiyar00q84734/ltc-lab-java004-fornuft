package lesson5;

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 10;
        int[] fibonacciNumbers = new int[n];

        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }

    }
}
