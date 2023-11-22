import java.util.*;
// Abstract class representing a Game
abstract class Game {
    protected String title;
    protected int releaseYear;

    public Game(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public abstract void play();
}

// PlayStationGame class inheriting from Game
class PlayStationGame extends Game {
    private String consoleType;

    public PlayStationGame(String title, int releaseYear, String consoleType) {
        super(title, releaseYear);
        this.consoleType = consoleType;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " on PlayStation " + consoleType);
    }
}

// MultiplayerGame class inheriting from PlayStationGame
class MultiplayerGame extends PlayStationGame {
    private int maxPlayers;

    public MultiplayerGame(String title, int releaseYear, String consoleType, int maxPlayers) {
        super(title, releaseYear, consoleType);
        this.maxPlayers = maxPlayers;
    }

    public void displayMaxPlayers() {
        System.out.println("Max Players: " + maxPlayers);
    }
}

// Final class example
final class FinalGame extends Game {
    public FinalGame(String title, int releaseYear) {
        super(title, releaseYear);
    }

    @Override
    public void play() {
        System.out.println("Playing the final version of " + title);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances and demonstrating functionalities
        Game game1 = new PlayStationGame("God of War", 2018, "PS4");
        game1.play();

        Game game2 = new MultiplayerGame("FIFA 22", 2021, "PS5", 4);
        game2.play();

        Game game3 = new FinalGame("Last of Us Part II", 2020);
        game3.play();
    }
}

