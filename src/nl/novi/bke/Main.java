package nl.novi.bke;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        for(Field f : game.getFields()) {
            System.out.println("Token: " + f.getToken());
        }

    }
}
