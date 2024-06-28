package lesson20.Game2048;

public class Board {
    private static final int SIZE = 4;
    private Tile[][] tiles;

    public Board() {
        tiles = new Tile[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tiles[i][j] = new Tile();
            }
        }

        tiles[0][0].setValue(2);
        tiles[0][2].setValue(2);
        tiles[0][1].setValue(2);
        tiles[0][3].setValue(2);
        tiles[1][0].setValue(4);
        tiles[2][0].setValue(4);
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tiles[i][j].getValue() + "\t");
            }
            System.out.println();
        }
    }

    public boolean moveLeft() {
        boolean moved = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 1; j < SIZE; j++) {
                if (!tiles[i][j].isEmpty()) {
                    int k = j;
                    while (k > 0 && tiles[i][k - 1].isEmpty()) {
                        tiles[i][k - 1].setValue(tiles[i][k].getValue());
                        tiles[i][k].setValue(0);
                        k--;
                        moved = true;
                    }
                    if (k > 0 && tiles[i][k - 1].getValue() == tiles[i][k].getValue()) {
                        tiles[i][k - 1].merge(tiles[i][k]);
                        moved = true;
                    }
                }
            }
        }
        return moved;
    }

    public boolean moveRight() {
        boolean moved = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = SIZE - 2; j >= 0; j--) {
                if (!tiles[i][j].isEmpty()) {
                    int k = j;
                    while (k < SIZE - 1 && tiles[i][k + 1].isEmpty()) {
                        tiles[i][k + 1].setValue(tiles[i][k].getValue());
                        tiles[i][k].setValue(0);
                        k++;
                        moved = true;
                    }
                    if (k < SIZE - 1 && tiles[i][k + 1].getValue() == tiles[i][k].getValue()) {
                        tiles[i][k + 1].merge(tiles[i][k]);
                        moved = true;
                    }
                }
            }
        }
        return moved;
    }

    public boolean moveUp() {
        boolean moved = false;
        for (int j = 0; j < SIZE; j++) {
            for (int i = 1; i < SIZE; i++) {
                if (!tiles[i][j].isEmpty()) {
                    int k = i;
                    while (k > 0 && tiles[k - 1][j].isEmpty()) {
                        tiles[k - 1][j].setValue(tiles[k][j].getValue());
                        tiles[k][j].setValue(0);
                        k--;
                        moved = true;
                    }
                    if (k > 0 && tiles[k - 1][j].getValue() == tiles[k][j].getValue()) {
                        tiles[k - 1][j].merge(tiles[k][j]);
                        moved = true;
                    }
                }
            }
        }
        return moved;
    }

    public boolean moveDown() {
        boolean moved = false;
        for (int j = 0; j < SIZE; j++) {
            for (int i = SIZE - 2; i >= 0; i--) {
                if (!tiles[i][j].isEmpty()) {
                    int k = i;
                    while (k < SIZE - 1 && tiles[k + 1][j].isEmpty()) {
                        tiles[k + 1][j].setValue(tiles[k][j].getValue());
                        tiles[k][j].setValue(0);
                        k++;
                        moved = true;
                    }
                    if (k < SIZE - 1 && tiles[k + 1][j].getValue() == tiles[k][j].getValue()) {
                        tiles[k + 1][j].merge(tiles[k][j]);
                        moved = true;
                    }
                }
            }
        }
        return moved;
    }
}
