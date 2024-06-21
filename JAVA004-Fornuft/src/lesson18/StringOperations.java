package lesson18;

public class StringOperations {
    public static void main(String[] args) {

        String part1 = "Hello, ";
        String part2 = "World!";
        String fullSentence = part1 + part2;
        System.out.println("Sentence: " + fullSentence);


        String substring = fullSentence.substring(7, 12);
        System.out.println("Substring: " + substring);
    }
}
