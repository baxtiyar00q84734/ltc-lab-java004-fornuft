package lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Bakhtiyar", 20, 89.5));
        students.add(new Student("Qadim", 22, 92.0));
        students.add(new Student("Teymur", 19, 88.5));
        students.add(new Student("Sabir", 21, 91.0));

        System.out.println("Students before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        students.sort(new GradeComparator());

        System.out.println("\nStudents after sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGrade(), s2.getGrade());
    }
}
