package lesson10;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        GarbageCollectionDemo demo = new GarbageCollectionDemo();


        Object myObject = new Object();

        myObject = null;

        demo.runGarbageCollector();

        System.out.println("Garbage collection requested.");
    }

    public void runGarbageCollector() {
        System.out.println("Requesting garbage collection");
        System.gc();
    }
}
