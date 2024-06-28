package lesson20.Game2048;

import java.util.Scanner;

public class Game2048 {
    private Board board;

    public Game2048() {
        board = new Board();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        board.display();

        while (true) {
            System.out.print("Move (WASD): ");
            char move = scanner.next().charAt(0);

            boolean moved = false;
            switch (Character.toUpperCase(move)) {
                case 'A':
                    moved = board.moveLeft();
                    break;
                case 'D':
                    moved = board.moveRight();
                    break;
                case 'W':
                    moved = board.moveUp();
                    break;
                case 'S':
                    moved = board.moveDown();
                    break;
                default:
                    System.out.println("Invalid move. Use WASD to move.");
            }

            if (moved) {
                board.display();
            } else {
                System.out.println("Move not possible.");
            }
        }
    }

    public static void main(String[] args) {
        Game2048 game = new Game2048();
        game.play();
    }
}
