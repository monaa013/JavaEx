class Player implements Runnable {
    private volatile boolean running = true;
    private int xPosition = 0;

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            // Update player position
            // Example: Move the player to the right
            xPosition += 1;

            // Display player position
            System.out.println("Player position: " + xPosition);

            // Simulate some delay for movement
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Enemy implements Runnable {
    private volatile boolean running = true;
    private int xPosition = 100;

    public void stop() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            // Update enemy position
            // Example: Move the enemy towards the player
            xPosition -= 1;

            // Display enemy position
            System.out.println("Enemy position: " + xPosition);

            // Simulate some delay for movement
            try {
                Thread.sleep(70);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class GameMain {
    public static void main(String[] args) {
        Player player = new Player();
        Enemy enemy = new Enemy();

        Thread playerThread = new Thread(player);
        Thread enemyThread = new Thread(enemy);

        playerThread.start();
        enemyThread.start();

        // Let the game run for a while
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop threads and end the game
        player.stop();
        enemy.stop();
    }
}
