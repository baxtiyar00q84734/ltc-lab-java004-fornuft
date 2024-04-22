package lesson7;

import java.util.Scanner;

public class BattleshipWarGameV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hideShip = false;
        int c4 = 0, c3 = 0, c2 = 0, c2a = 0, c2b = 0, c1 = 0, c1a = 0, c1b = 0, c1c = 0, c3b = 0;
        int count1 = 0, count2 = 0, count3 = 0;

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
            } else if (battleshipMap[userHitRow][userHitCol] == 0) {
                System.out.println("No hit!");

                battleshipMap[userHitRow][userHitCol] = 3;
            } else {
                System.out.println("You already checked this coordinate!!!");
            }

            System.out.println("Do you want to continue? (type 'quit' to stop)");
            String finishGame = scanner.next();
            if ("quit".equals(finishGame)) {
                break;
            }

            //4
            if (battleshipMap[0][2] == 2 && battleshipMap[0][3] == 2 && battleshipMap[0][4] == 2 && battleshipMap[0][5] == 2) {
                if (c4 == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 4 lengths.");
                c4++;

            }

            //3
            if (battleshipMap[5][3] == 2 && battleshipMap[5][4] == 2 && battleshipMap[5][5] == 2) {
                if (c3 == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 3 lengths.");
                c3++;
                count3++;
            }
            if (battleshipMap[3][0] == 2 && battleshipMap[4][0] == 2 && battleshipMap[5][0] == 2) {
                if (c3b == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 3 lengths.");
                c3b++;
                count3++;
            }

            // Checks for ships of length 2
            if (battleshipMap[1][7] == 2 & battleshipMap[2][7] == 2) {
                if (c2 == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 2 lengths.");
                c2++;
                count2++;
            }

            if (battleshipMap[8][9] == 2 && battleshipMap[9][9] == 2) {
                if (c2a == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 2 lengths.");
                c2a++;
                count2++;
            }
            if (battleshipMap[8][1] == 2 && battleshipMap[8][2] == 2) {
                if (c2b == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 2 lengths.");
                c2b++;
                count2++;
            }

            // Check for ships of length 1
            if (battleshipMap[7][4] == 2) {
                if (c1 == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 1 lengths.");
                c1++;
                count1++;
            }
            if (battleshipMap[5][8] == 2) {
                if (c1a == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 1 lengths.");
                c1a++;
                count1++;
            }
            if (battleshipMap[9][5] == 2) {
                if (c1b == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 1 lengths.");
                c1b++;
                count1++;
            }
            if (battleshipMap[2][2] == 2) {
                if (c1c == 1) {
                    continue;
                }
                System.out.println("You sank a ship of 1 lengths.");
                c1c++;
                count1++;
            }
            if (!hideShip) {
                for (int i = 0; i < battleshipMap.length; i++) {
                    for (int j = 0; j < battleshipMap[i].length; j++) {
                        if (battleshipMap[i][j] == 2) {
                            System.out.print("X ");
                        } else if (battleshipMap[i][j] == 3) {
                            System.out.print("O ");
                        } else {
                            System.out.print(battleshipMap[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }

        if (!hideShip) {
            System.out.println("0-empty and not checked \n1-full not checked \nX-full and checked \nO-empty checked");
            System.out.println("Game Over! Final battlefield:");
            for (int i = 0; i < battleshipMap.length; i++) {
                for (int j = 0; j < battleshipMap[i].length; j++) {
                    if (battleshipMap[i][j] == 2) {
                        System.out.print("X ");
                    } else if (battleshipMap[i][j] == 3) {
                        System.out.print("O ");
                    } else {
                        System.out.print(battleshipMap[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }

        System.out.println("Sank Ships-4 lengths:" + c4);
        System.out.println("Sank Ships-3 lengths:" + count3);
        System.out.println("Sank Ships-2 lengths:" + count2);
        System.out.println("Sank Ships-1 lengths:" + count1);

    }
}
