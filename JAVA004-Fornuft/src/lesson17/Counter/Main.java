package lesson17.Counter;

public class Main {
    public static void main(String[] args) {
        EvenOddNumber a = new EvenOddNumber();
        EvenNumberThread thread1=new EvenNumberThread(a);
        OddNumberThread thread2=new OddNumberThread(a);

        thread1.start();
        thread2.start();
    }
}
