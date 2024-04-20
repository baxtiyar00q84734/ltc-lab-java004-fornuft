package lesson7;

import java.util.Scanner;

public class BattleshipWarGame {
    public static void main(String[] args) {

// 0- empty and not checked  1- full not checked 2- full and checked 3-empty checked

        int[][] battleshipMap = {
                {0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 1, 1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 1},

        };

        // visualize map
//        for (int i = 0; i < battleshipMap.length; i++) {
//            for (int j = 0; j < battleshipMap[i].length; j++) {
//                System.out.print(battleshipMap[i][j] + " ");
//            }
//            System.out.println();
//        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter coordinates (row and column):");
            int userHitRow = scanner.nextInt();
            int userHitCol = scanner.nextInt();

            if (userHitRow < 0 || userHitRow >= 10 || userHitCol < 0 || userHitCol >= 10) {
                System.out.println("Coordinates out of bounds. Rows and columns must be between 0 and 9.");
                continue;
            }

            if (battleshipMap[userHitRow][userHitCol] == 1) {
                System.out.println("You hit!");

                battleshipMap[userHitRow][userHitCol] = 2;
            } else {
                System.out.println("No hit!");

                battleshipMap[userHitRow][userHitCol] = 3;
            }

            System.out.println("Do you want to continue? (type 'quit' to stop)");
            String finishGame = scanner.next();
            if ("quit".equals(finishGame)) {

                for (int i = 0; i < battleshipMap.length; i++) {
                    for (int j = 0; j < battleshipMap[i].length; j++) {
                        System.out.print(battleshipMap[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            }
        }
        System.out.println("Game Over!");
    }
}
