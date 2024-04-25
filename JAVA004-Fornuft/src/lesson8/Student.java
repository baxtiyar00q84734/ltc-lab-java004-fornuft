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

    public void printDetails() {
        System.out.println("Student Name: " + name + ", Grade: " + grade + ", Is Graduating: " + isGraduating);
    }

    public boolean isPassing() {

        if (grade >= 50) {
            return true;
        } else return false;

        // return grade >= 50;
    }
}
