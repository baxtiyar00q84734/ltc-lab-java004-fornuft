package lesson17.Counter;

public class EvenOddNumber {
    public static final int MAX = 10000;
    public int counter = 1;

    public void generateEvenNumbers() {
        synchronized (this) {
            while (counter < MAX) {
                while (counter % 2 == 1) {
                    try {
                        wait();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("Even Number:" + counter);
                counter++;
                notifyAll();
            }
        }
    }

    public void generateOddNumbers() {
        synchronized (this) {
            while (counter < MAX) {
                while (counter % 2 == 0) {
                    try {
                        wait();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("Odd Number:" + counter);
                counter++;
                notifyAll();
            }
        }
    }
}
