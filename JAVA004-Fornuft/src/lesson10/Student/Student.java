package lesson10.Student;

public class Student {
     String name;
     int age;
    String faculty;

    public Student(String name, int age,String faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
