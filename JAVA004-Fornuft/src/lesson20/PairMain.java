package lesson20;

public class PairMain {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "One");
        System.out.println(pair);

        pair.setFirst(2);
        pair.setSecond("Two");
        System.out.println(pair);

        Pair<Double, Boolean> anotherPair = new Pair<>(3.5, true);
        System.out.println(anotherPair);
    }
}
