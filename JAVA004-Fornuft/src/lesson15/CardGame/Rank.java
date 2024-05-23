package lesson15.CardGame;

public class Rank {
    public static final Rank TWO = new Rank("2");
    public static final Rank THREE = new Rank("3");
    public static final Rank FOUR = new Rank("4");
    public static final Rank FIVE = new Rank("5");
    public static final Rank SIX = new Rank("6");
    public static final Rank SEVEN = new Rank("7");
    public static final Rank EIGHT = new Rank("8");
    public static final Rank NINE = new Rank("9");
    public static final Rank TEN = new Rank("10");
    public static final Rank JACK = new Rank("Jack");
    public static final Rank QUEEN = new Rank("Queen");
    public static final Rank KING = new Rank("King");
    public static final Rank ACE = new Rank("Ace");

    private final String name;

    private Rank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

