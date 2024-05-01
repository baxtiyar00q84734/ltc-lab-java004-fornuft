package lesson10;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample();

        obj1 = null;

        System.gc();
        System.out.println("Requested garbage collection.");

        if (obj1 == null) {
            System.out.println("Student 1 is null.");
        } else {
            System.out.println("Student 1 is not null.");
        }
    }


}
