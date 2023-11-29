// Define the Playable interface
interface Playable {
    void play();
}

// Implement the Playable interface in the Game class
class Game implements Playable {
    private String title;

    // Constructor
    public Game(String title) {
        this.title = title;
    }

    // Implementation of the play method from the Playable interface
    @Override
    public void play() {
        System.out.println("Playing Game: " + title);
        // Add any game-specific logic here
    }
}

// Implement the Playable interface in the Movie class
class Movie implements Playable {
    private String title;

    // Constructor
    public Movie(String title) {
        this.title = title;
    }

    // Implementation of the play method from the Playable interface
    @Override
    public void play() {
        System.out.println("Playing Movie: " + title);
        // Add any movie-specific logic here
    }
}

// Implement the Playable interface in the Music class
class Music implements Playable {
    private String title;
    private String artist;

    // Constructor
    public Music(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Implementation of the play method from the Playable interface
    @Override
    public void play() {
        System.out.println("Playing Music: " + title + " by " + artist);
        // Add any music-specific logic here
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        // Create instances of the Game, Movie, and Music classes
        Game myGame = new Game("Awesome Game");
        Movie myMovie = new Movie("Blockbuster Movie");
        Music myMusic = new Music("Hit Song", "Famous Artist");

        // Call the play method on each entertainment type
        myGame.play();
        myMovie.play();
        myMusic.play();
    }
}