package lesson15.CardGame;

public class Suit {
    public static final Suit HEARTS = new Suit("Hearts");
    public static final Suit DIAMONDS = new Suit("Diamonds");
    public static final Suit CLUBS = new Suit("Clubs");
    public static final Suit SPADES = new Suit("Spades");

    private final String name;

    private Suit(String name) {
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

