package lesson7;

import java.util.Scanner;

public class BattleshipWarGame {
    public static void main(String[] args) {

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

            if (battleshipMap[userHitRow][userHitCol] == 1) {
                System.out.println("You hit!");
                
                battleshipMap[userHitRow][userHitCol] = 2;
            } else {
                System.out.println("No hit!");
            }

            System.out.println("Do you want to continue? (type 'quit' to stop)");
            String finishGame = scanner.next();
            if ("quit".equals(finishGame)) {
                break;
            }
        }
        System.out.println("Game Over!");
    }
}
