package lesson17.Entartaining;

public class PrintWordsFromThread1 extends Thread{
    private WordsReader object;

    public PrintWordsFromThread1(WordsReader object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printWordsFromThread1();
    }
}
