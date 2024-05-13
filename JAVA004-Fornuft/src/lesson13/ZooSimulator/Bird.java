package lesson13.ZooSimulator;

public class Bird extends Animal{
    String wingSpan;

    public Bird(String name, int age, String sound, String wingSpan) {
        super(name, age, sound);
        this.wingSpan = wingSpan;
    }

    public void fly(){
        System.out.println("FLY");
    }
}
