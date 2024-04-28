package self_learning.string;

public class StringFormatting {
    public static void main(String[] args) {
        String sentence = "Hello, Mr. %s , good %s";
        String name = "Bakhtiyar";
        String time = "morning";
        String formattedString = String.format(sentence, name, time);
        System.out.println(formattedString);

    }
}
