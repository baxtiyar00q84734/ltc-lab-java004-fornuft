package lesson17.Counter;

public class OddNumberThread extends Thread{
    private EvenOddNumber object;

    public OddNumberThread(EvenOddNumber object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.generateOddNumbers();
    }
}
