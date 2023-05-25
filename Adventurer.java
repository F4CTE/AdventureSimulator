public class Adventurer {
    // This variable stores the x position of the adventurer
    private int x;
    // This variable stores the y position of the adventurer
    private int y;

    // This method constructs the adventurer at a given x and y position
    public Adventurer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // This method moves the adventurer north by decrementing the y position
    public void moveNorth() {
        y--;
    }

    // This method moves the adventurer south by incrementing the y position
    public void moveSouth() {
        y++;
    }

    // This method moves the adventurer east by incrementing the x position
    public void moveEast() {
        x++;
    }

    // This method moves the adventurer west by decrementing the x position
    public void moveWest() {
        x--;
    }

    // This method returns the x position of the adventurer
    public int getX() {
        return x;
    }

    // This method returns the y position of the adventurer
    public int getY() {
        return y;
    }
}
