package nl.novi.bke;

public class Game {

    private Field[] fields;

    public Game() {
        fields = new Field[9];
        for (int i = 0; i < 9; i++) {
            fields[i] = new Field(i);
        }
    }

    public Field[] getFields() {
        return fields;
    }

    public boolean hasWon() {
        return false;
    }
}
