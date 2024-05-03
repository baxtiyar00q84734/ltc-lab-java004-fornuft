package lesson10;

public class MemoryDemo {
    public static void main(String[] args) {
        MemoryDemo demo = new MemoryDemo();
        demo.stackVsHeap();
    }

    public void stackVsHeap() {

        int a = 20;
        System.out.println("pri value - stack: " + a);

        Integer b = new Integer(20);
        System.out.println("object in heap" + b);

    }
}
