package lesson13.ZooSimulator;

public class Aquatic extends Animal{
    String swimmingDepth;

    public Aquatic(String name, int age, String sound, String swimmingDepth) {
        super(name, age, sound);
        this.swimmingDepth = swimmingDepth;
    }

    public void swim(){
        System.out.println("SWIM");
    }
}
