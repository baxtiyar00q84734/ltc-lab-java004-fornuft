package lesson15.CardGame;

import java.util.Random;

public class Deck {
    private Card[] cards;
    private int CardIndex;
    private static final int NUMBER_OF_CARDS = 52;

    public Deck() {
        cards = new Card[NUMBER_OF_CARDS];
        int index = 0;
        Suit[] suits = {Suit.HEARTS, Suit.DIAMONDS, Suit.CLUBS, Suit.SPADES};
        Rank[] ranks = {Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN,
                Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING, Rank.ACE};

        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                cards[index++] = new Card(suit, rank);
            }
        }
        CardIndex = 0;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        CardIndex = 0;
    }// .

    public Card cardCounter() {
        if (CardIndex < cards.length) {
            return cards[CardIndex++];
        } else {
            System.out.println("No cards left in the deck");
        }
        return null;
    }

    public boolean hasCards() {
        return CardIndex < cards.length;
    }
}
