package lesson20.Game2048;

public class Tile {
    private int value;

    public Tile() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == 0;
    }

    public void merge(Tile other) {
        if (this.value == other.value) {
            this.value *= 2;
            other.setValue(0);
        }
    }
}
