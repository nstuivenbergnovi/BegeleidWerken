package nl.novi.bke;

public class Field {

    private char token;

    public Field(int fieldNumber) {
        fieldNumber++;
        this.token = (char) (fieldNumber + '0');
    }

    public char getToken() {
        return token;
    }

    public void setToken(char token) {
        this.token = token;
    }
}
