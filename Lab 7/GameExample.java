import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Character {
    void performAction();
}

class Player {
    private List<Character> characters;

    public Player() {
        characters = new ArrayList<>();
    }

    public void addAction(Character character) {
        characters.add(character);
    }

    public void performActions() {
        characters.forEach(Character::performAction);
    }
}

public class GameExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("Enter actions for the player (e.g., Jump, Attack, Run). Enter 'exit' to finish.");
        String action = scanner.nextLine();

        while (!action.equalsIgnoreCase("exit")) {
            final String finalAction = action; // Capture action in a final variable
            player.addAction(() -> System.out.println("Player is " + finalAction.toLowerCase() + "."));
            action = scanner.nextLine();
        }

        System.out.println("Performing actions:");
        player.performActions();

        scanner.close();
    }
}
