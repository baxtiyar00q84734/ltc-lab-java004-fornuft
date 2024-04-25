package lesson8;

public class Student {
    String name;
    int grade;
    boolean isGraduating;

    public Student(String name, int grade, boolean isGraduating) {
        this.name = name;
        this.grade = grade;
        this.isGraduating = isGraduating;
    }

    public static void main(String[] args) {
        Student student = new Student("Sabir", 87, true);

        System.out.println("Name: " + student.name);
        System.out.println("Grade : " + student.grade);
        System.out.println("isGraduating: " + student.isGraduating);
    }
}
