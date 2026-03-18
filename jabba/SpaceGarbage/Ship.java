import greenfoot.*;

/**
 * Ship - the player's spacecraft.
 * Move with W A S D keys.
 * Collect space junk for points, avoid radioactive containers.
 */
public class Ship extends Actor {

    private int speed;
    private int frameCount;   // used for image animation
    private boolean useImg2;  // toggles between ship1 and ship2

    public Ship() {
        speed      = 3;
        frameCount = 0;
        useImg2    = false;
        setImage("ship1.png");
    }

    public void act() {
        move();
        wrapEdges();
        checkForJunk();
        checkForContainers();
        animateThrusters();
    }

    // handles WASD movement - each key sets direction then moves
    private void move() {
        if (Greenfoot.isKeyDown("w")) {
            setRotation(270);
            move(speed);
        }
        if (Greenfoot.isKeyDown("s")) {
            setRotation(90);
            move(speed);
        }
        if (Greenfoot.isKeyDown("a")) {
            setRotation(180);
            move(speed);
        }
        if (Greenfoot.isKeyDown("d")) {
            setRotation(0);
            move(speed);
        }
    }

    // when ship goes off one edge it appears on the other side
    private void wrapEdges() {
        int x = getX();
        int y = getY();
        int w = getWorld().getWidth();
        int h = getWorld().getHeight();

        if (x < 0)  setLocation(w, y);
        if (x > w)  setLocation(0, y);
        if (y < 0)  setLocation(x, h);
        if (y > h)  setLocation(x, 0);
    }

    private void checkForJunk() {
        Actor j = getOneIntersectingObject(Junk.class);
        if (j != null) {
            getWorld().removeObject(j);
            Greenfoot.playSound("collect.wav");
            ((SpaceWorld) getWorld()).addScore(1);
        }
    }

    private void checkForContainers() {
        Actor c = getOneIntersectingObject(RadioactiveContainer.class);
        if (c != null) {
            getWorld().removeObject(c);
            ((SpaceWorld) getWorld()).loseLife();
        }
    }

    // alternate ship images to simulate thruster flame flickering
    private void animateThrusters() {
        frameCount++;
        if (frameCount >= 15) {
            frameCount = 0;
            if (useImg2) {
                setImage("ship1.png");
            } else {
                setImage("ship2.png");
            }
            useImg2 = !useImg2;
        }
    }
}
