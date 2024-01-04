package game;

import entities.Character;

public class GameStart {
    public static void main(String[] args) {
        Character player = new Character();
        player.display();
        player.move();
    }
}
