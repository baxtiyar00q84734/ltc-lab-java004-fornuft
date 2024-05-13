package lesson13.ZooSimulator;

public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal("A", 12, "B", "Black");
        Aquatic aquatic = new Aquatic("A", 15, "b", "a");
        Bird bird = new Bird("c", 4, "c", "c");

        mammal.giveBirth();
        aquatic.swim();
        bird.fly();
    }
}
