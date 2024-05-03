package lesson10.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bakhtiyar", 20, "Computer Science");

        Student student2 = new Student("Ferid", 18, "Mathematics");

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Major: " + student1.getFaculty());

        System.out.println("\nStudent 2:");
       System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Major: " + student2.getFaculty());

        student1 = null;
    }
}
