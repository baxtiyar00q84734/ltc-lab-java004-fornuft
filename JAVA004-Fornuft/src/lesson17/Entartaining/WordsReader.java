package lesson17.Entartaining;

public class WordsReader {
    private String[] words1 = {"Getdim", "bir", "2", "kor", "yırtıq", "var"};
    private String[] words2 = {"gördüm", "dərədə", "kar", "kürkü", "kirpi"};
    private int index1 = 0;
    private int index2 = 0;
    private boolean thread1Turn = true;

    public synchronized void printWordsFromThread1() {
        while (index1 < words1.length || index2 < words2.length) {
            while (!thread1Turn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (index1 < words1.length) {
                System.out.println(Thread.currentThread().getName() + " : " + words1[index1]);
                index1++;
            }
            thread1Turn = false;
            notifyAll();
        }
    }

    public synchronized void printWordsFromThread2() {
        while (index1 < words1.length || index2 < words2.length) {
            while (thread1Turn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (index2 < words2.length) {
                System.out.println(Thread.currentThread().getName() + " : " + words2[index2]);
                index2++;
            }
            thread1Turn = true;
            notifyAll();
        }
    }
}
