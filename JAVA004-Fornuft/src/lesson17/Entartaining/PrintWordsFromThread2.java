package lesson17.Entartaining;

public class PrintWordsFromThread2 extends Thread{
    private WordsReader object;

    public PrintWordsFromThread2(WordsReader object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printWordsFromThread2();
    }
}
