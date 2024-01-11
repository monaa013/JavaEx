import java.util.*;

// Interface representing a playable character in the game
interface Playable {
    void play();
}

// Class representing a GameCharacter implementing the Playable interface
class GameCharacter implements Playable {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing!");
    }

    @Override
    public String toString() {
        return name;
    }
}

// Class representing a GameWorld that contains a list of playable characters
class GameWorld {
    private List<Playable> characters;

    public GameWorld() {
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Playable character) {
        characters.add(character);
    }

    public void playGame() {
        System.out.println("Game is starting!");
        for (Playable character : characters) {
            character.play();
        }
    }
}

// Class representing a GameScoreboard that uses a HashMap to store scores
class GameScoreboard {
    private Map<String, Integer> scores;

    public GameScoreboard() {
        this.scores = new HashMap<>();
    }

    public void updateScore(String playerName, int points) {
        scores.put(playerName, scores.getOrDefault(playerName, 0) + points);
    }

    public void displayScores() {
        System.out.println("Game Scores:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " points");
        }
    }
}

// Class representing a set of favorite games using a HashSet
class FavoriteGames {
    private Set<String> games;

    public FavoriteGames() {
        this.games = new HashSet<>();
    }

    public void addGame(String game) {
        games.add(game);
    }

    public void displayFavoriteGames() {
        System.out.println("Favorite Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}

public class GameAndEntertainmentExample {
    public static void main(String[] args) {
        try {
            // Create game characters
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Player 1 name: ");
            String player1Name = scanner.nextLine();
            GameCharacter player1 = new GameCharacter(player1Name);

            System.out.print("Enter Player 2 name: ");
            String player2Name = scanner.nextLine();
            GameCharacter player2 = new GameCharacter(player2Name);

            // Create game world
            GameWorld gameWorld = new GameWorld();
            gameWorld.addCharacter(player1);
            gameWorld.addCharacter(player2);

            // Play the game
            gameWorld.playGame();

            // Update game scores
            GameScoreboard scoreboard = new GameScoreboard();

            System.out.print("Enter points for " + player1Name + ": ");
            int pointsPlayer1 = scanner.nextInt();
            scoreboard.updateScore(player1Name, pointsPlayer1);

            System.out.print("Enter points for " + player2Name + ": ");
            int pointsPlayer2 = scanner.nextInt();
            scoreboard.updateScore(player2Name, pointsPlayer2);

            // Display game scores
            scoreboard.displayScores();

            // Set favorite games
            FavoriteGames favoriteGames = new FavoriteGames();

            System.out.print("Enter favorite game for " + player1Name + ": ");
            scanner.nextLine(); // Consume newline left by nextInt()
            String favoriteGamePlayer1 = scanner.nextLine();
            favoriteGames.addGame(favoriteGamePlayer1);

            System.out.print("Enter favorite game for " + player2Name + ": ");
            String favoriteGamePlayer2 = scanner.nextLine();
            favoriteGames.addGame(favoriteGamePlayer2);

            // Display favorite games
            favoriteGames.displayFavoriteGames();

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
