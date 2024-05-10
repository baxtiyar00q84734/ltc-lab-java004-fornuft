package lesson12.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Sabir");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        Person person1 = new Person();
        Person person2 = new Person();

        System.out.println("Person1 equals Person2: " + person1.equals(person2));
        System.out.println("Person1 hash code: " + person1.hashCode());
        System.out.println("Person2 hash code: " + person2.hashCode());
    }
}
