package lesson18;

public class StringBuilderTask {
    public static void main(String[] args) {

        StringBuilder quote = new StringBuilder("Always and Forever");

        System.out.println("Quote: " + quote);

        quote.append(" - Original Family");

        System.out.println("Quote: " + quote);
    }
}
