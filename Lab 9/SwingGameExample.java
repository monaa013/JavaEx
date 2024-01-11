import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Interface representing a playable character in the game
interface Playable {
    void play();
}

// Class representing a GameCharacter implementing the Playable interface
class GameCharacter implements Playable {
    private String name;
    private int score;
    private int level;

    public GameCharacter(String name, int score, int level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }

    @Override
    public void play() {
        JOptionPane.showMessageDialog(null, name + " is playing!\nScore: " + score + "\nLevel: " + level);
    }

    // Setter for player name
    public void setName(String name) {
        this.name = name;
    }

    // Getters and setters for player details
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getLevel() {
        return level;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Class representing the GameFrame GUI
class GameFrame extends JFrame {
    private JButton playButton;
    private JButton updateDetailsButton;
    private JButton exitButton;

    private GameCharacter player;

    public GameFrame(GameCharacter player) {
        this.player = player;
        initializeComponents();
        setLayout();
        addActionListeners();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void initializeComponents() {
        playButton = new JButton("Play");
        updateDetailsButton = new JButton("Update Details");
        exitButton = new JButton("Exit");
    }

    private void setLayout() {
        setLayout(new FlowLayout());
        add(playButton);
        add(updateDetailsButton);
        add(exitButton);
    }

    private void addActionListeners() {
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.play();
            }
        });

        updateDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatePlayerDetails();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void updatePlayerDetails() {
        String newName = JOptionPane.showInputDialog("Enter new name:");
        if (newName != null && !newName.isEmpty()) {
            player.setName(newName);
        }

        try {
            String newScoreStr = JOptionPane.showInputDialog("Enter new score:");
            if (newScoreStr != null && !newScoreStr.isEmpty()) {
                int newScore = Integer.parseInt(newScoreStr);
                player.setScore(newScore);
            }

            String newLevelStr = JOptionPane.showInputDialog("Enter new level:");
            if (newLevelStr != null && !newLevelStr.isEmpty()) {
                int newLevel = Integer.parseInt(newLevelStr);
                player.setLevel(newLevel);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input for score or level. Please enter valid numbers.");
        }
    }
}

public class SwingGameExample {
    public static void main(String[] args) {
        // Get player details from the user
        String playerName = JOptionPane.showInputDialog("Enter player name:");
        int initialScore = Integer.parseInt(JOptionPane.showInputDialog("Enter initial score:"));
        int initialLevel = Integer.parseInt(JOptionPane.showInputDialog("Enter initial level:"));

        // Create game character
        GameCharacter player = new GameCharacter(playerName, initialScore, initialLevel);

        // Create and display the game frame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFrame(player);
            }
        });
    }
}
