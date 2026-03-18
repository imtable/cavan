import greenfoot.*;

/**
 * Junk - broken satellite parts floating through space.
 * These are what the player needs to collect.
 * Each piece drifts slowly in a random direction and rotates as it goes.
 */
public class Junk extends Actor {

    private int spd;
    private int spinRate;  // how fast this piece rotates

    public Junk() {
        // each piece gets slightly different speed
        spd      = Greenfoot.getRandomNumber(2) + 1;
        spinRate = Greenfoot.getRandomNumber(4) + 1;

        // random starting direction so they drift all over the place
        setRotation(Greenfoot.getRandomNumber(360));
        setImage("debris.png");
    }

    public void act() {
        move(spd);
        turn(spinRate);
        wrapEdges();
    }

    // junk wraps around screen edges just like the ship does
    private void wrapEdges() {
        int x = getX();
        int y = getY();
        int w = getWorld().getWidth();
        int h = getWorld().getHeight();

        if (x < 0)       setLocation(w - 1, y);
        else if (x >= w) setLocation(0, y);

        if (y < 0)       setLocation(x, h - 1);
        else if (y >= h) setLocation(x, 0);
    }
}
