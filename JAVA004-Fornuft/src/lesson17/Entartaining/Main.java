package lesson17.Entartaining;

public class Main {
    public static void main(String[] args) {
        WordsReader a = new WordsReader();
        PrintWordsFromThread1 thread1 = new PrintWordsFromThread1(a);
        PrintWordsFromThread2 thread2 = new PrintWordsFromThread2(a);

        thread1.start();
        thread2.start();
    }
}
