package self_learning.enumP;

public class EnumDemo {
    public static void main(String[] args) {

        // Enums always used for const value which never can be changed , for example days of week

        Priority priority = Priority.HIGH;
        switch (priority) {
            case HIGH:
                System.out.println("High");
                break;
            case MEDIUM:
                System.out.println("Medium");
                break;
            case LOW:
                System.out.println("Low");
                break;
        }

        Priority priority2 = Priority.valueOf("HIGH");
        System.out.println(priority2);



    }


}
