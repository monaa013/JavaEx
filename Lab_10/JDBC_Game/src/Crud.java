import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Crud {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/priya";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "blackpanda";

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    private static Scanner scanner = new Scanner(System.in);

    public static void connect() throws SQLException {
        connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    public static void createPlayersTable() throws SQLException {
        statement = connection.createStatement();
        String createTableQuery = "CREATE TABLE IF NOT EXISTS players (id INT AUTO_INCREMENT PRIMARY KEY, "
                + "player_name VARCHAR(255))";
        statement.executeUpdate(createTableQuery);
    }

    public static void insertPlayerRecord() throws SQLException {
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();

        String insertQuery = "INSERT INTO players (player_name) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, playerName);
            preparedStatement.executeUpdate();
        }
    }

    public static void readPlayerRecords() throws SQLException {
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM players");

        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id") +
                    ", Player Name: " + resultSet.getString("player_name"));
        }
    }

    public static void updatePlayerRecord() throws SQLException {
        System.out.println("Enter the ID of the player you want to update:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("Enter the new player name:");
        String newPlayerName = scanner.nextLine();

        String updateQuery = "UPDATE players SET player_name = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, newPlayerName);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        }
    }

    public static void deletePlayerRecord() throws SQLException {
        System.out.println("Enter the ID of the player you want to delete:");
        int id = scanner.nextInt();

        String deleteQuery = "DELETE FROM players WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
    }

    public static void close() throws SQLException {
        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (connection != null) connection.close();
        scanner.close();
    }

    public static void main(String[] args) {
        try {
            connect();
            createPlayersTable();

            int choice;
            do {
                System.out.println("\nSelect an operation:");
                System.out.println("1. Add Player Record");
                System.out.println("2. View Player Records");
                System.out.println("3. Update Player Record");
                System.out.println("4. Delete Player Record");
                System.out.println("0. Exit");

                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        insertPlayerRecord();
                        break;
                    case 2:
                        readPlayerRecords();
                        break;
                    case 3:
                        updatePlayerRecord();
                        break;
                    case 4:
                        deletePlayerRecord();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 0);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
