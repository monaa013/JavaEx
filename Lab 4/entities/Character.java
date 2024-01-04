package entities;

public class Character implements Displayable, Movable {
    @Override
    public void display() {
        System.out.println("Displaying character");
    }

    @Override
    public void move() {
        System.out.println("Moving character");
    }
}
