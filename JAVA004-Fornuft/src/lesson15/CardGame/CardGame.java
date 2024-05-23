package lesson15.CardGame;

public class CardGame {
    private final Deck deck;
    private final Player[] players;
    private int playerCount;

    public CardGame(int maxPlayers) {
        this.deck = new Deck();
        this.players = new Player[maxPlayers];
        this.playerCount = 0;
    }

    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount++] = player;
        } else {
            System.out.println("Maximum number of players reached");
        }
    }

    public void dealCards(int numberOfCards) {
        deck.shuffle();
        for (int i = 0; i < numberOfCards; i++) {
            for (int j = 0; j < playerCount; j++) {
                if (deck.hasCards()) {
                    players[j].addCard(deck.cardCounter());
                }
            }
        }
    }

    public void printPlayerHands() {
        for (int i = 0; i < playerCount; i++) {
            System.out.println(players[i]);
        }
    }

    public void WinnerCheck() {
        Player winner = null;
        int highestPoints = 0;
        for (int i = 0; i < playerCount; i++) {
            int playerPoints = players[i].calculatePoints();
            System.out.println(players[i].getName() + " has " + playerPoints + " points.");
            if (playerPoints > highestPoints) {
                highestPoints = playerPoints;
                winner = players[i];
            }
        }
        System.out.println("The winner is " + winner.getName() + " with " + highestPoints + " points!");

    }
}
