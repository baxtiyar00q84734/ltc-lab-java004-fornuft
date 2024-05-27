package lesson17.Counter;

public class EvenNumberThread extends Thread {
    private EvenOddNumber object;

    public EvenNumberThread(EvenOddNumber object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.generateEvenNumbers();
    }
}
