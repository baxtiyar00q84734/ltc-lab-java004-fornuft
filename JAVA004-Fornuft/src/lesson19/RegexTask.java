package lesson19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        String sentence = scanner.nextLine();

        String regex = "\\b[Ss]\\w*\\b";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(sentence);

        System.out.println("Words starting with 'S':");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
