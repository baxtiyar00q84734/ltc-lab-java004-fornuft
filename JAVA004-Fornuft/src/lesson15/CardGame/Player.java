package lesson15.CardGame;

import java.util.Arrays;

public class Player {
    private final String name;
    private final Card[] hand;
    private int cardCount;

    public Player(String name, int handSize) {
        this.name = name;
        this.hand = new Card[handSize];
        this.cardCount = 0;
    }

    public String getName() {
        return name;
    }

    public Card[] getHand() {
        return hand;
    }

    public void addCard(Card card) {
        if (cardCount < hand.length) {
            hand[cardCount++] = card;
        } else {
            System.out.println("Hand is full");
        }
    }

    public int calculatePoints() {
        int points = 0;
        for (int i = 0; i < cardCount; i++) {
            String rank = hand[i].getRank().getName();
            switch (rank) {
                case "2": case "3": case "4": case "5": case "6":
                case "7": case "8": case "9": case "10":
                    points += Integer.parseInt(rank);
                    break;
                case "Jack": case "Queen": case "King":
                    points += 10;
                    break;
                case "Ace":
                    points += 11;
                    break;
            }
        }
        return points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + Arrays.toString(hand) +
                ", cardCount=" + cardCount +
                '}';
    }
}
