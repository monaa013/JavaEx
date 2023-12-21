import java.util.Scanner;

// Define a generic Player class
class Player<T> {
    private T playerType;

    public Player(T playerType) {
        this.playerType = playerType;
    }

    public T getPlayerType() {
        return playerType;
    }

    public void play() {
        System.out.println("Playing as a " + playerType.toString());
    }
}

// Interface representing a game
interface Game {
    void start();
    void end();
}

// GameRoom class that accepts players of different types
class GameRoom<T extends Game> {
    private T game;

    public GameRoom(T game) {
        this.game = game;
    }

    public void startGame() {
        game.start();
    }

    public void endGame() {
        game.end();
    }
}

// Example game class implementing the Game interface
class ChessGame implements Game {
    @Override
    public void start() {
        System.out.println("Chess game started!");
    }

    @Override
    public void end() {
        System.out.println("Chess game ended!");
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get player types from user input
        System.out.print("Enter the type of game name: ");
        String videoGamePlayerType = scanner.nextLine();
        Player<String> videoGamePlayer = new Player<>(videoGamePlayerType);

        System.out.print("Enter the player ID: ");
        int boardGamePlayerType = scanner.nextInt();
        Player<Integer> boardGamePlayer = new Player<>(boardGamePlayerType);

        // Printing player types
        System.out.println("Game name: " + videoGamePlayer.getPlayerType());
        System.out.println("Player ID: " + boardGamePlayer.getPlayerType());

        // Creating a game room for chess
        ChessGame chess = new ChessGame();
        GameRoom<ChessGame> chessRoom = new GameRoom<>(chess);

        // Ask user if they want to start the game
        System.out.print("Do you want to start the game? (yes/no): ");
        scanner.nextLine(); // Consume newline
        String startGameInput = scanner.nextLine();

        if (startGameInput.equalsIgnoreCase("yes")) {
            // Starting and ending the chess game in the room
            chessRoom.startGame();
            chessRoom.endGame();
        } else {
            System.out.println("Game not started.");
        }

        scanner.close();
    }
}
