package lesson19.EnumTask;

public class Main {
    public static void main(String[] args) {
        Month currentMonth = Month.JUNE;

        if (currentMonth == Month.JUNE || currentMonth == Month.JULY || currentMonth == Month.AUGUST) {
            System.out.println(currentMonth + " is a summer month.");
        } else {
            System.out.println(currentMonth + " is not a summer month.");
        }
    }
}
