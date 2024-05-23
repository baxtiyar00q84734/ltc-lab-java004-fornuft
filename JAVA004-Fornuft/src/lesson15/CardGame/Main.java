package lesson15.CardGame;

public class Main {
    public static void main(String[] args) {
        CardGame game = new CardGame(4);
        game.addPlayer(new Player("bakh", 5));
        game.addPlayer(new Player("ferid", 5));

        game.dealCards(5);
        game.printPlayerHands();
        game.WinnerCheck();

    }
}
