import greenfoot.*;

/**
 * RadioactiveContainer - dangerous waste pods drifting through space.
 * Touching one costs the player a life.
 * Unlike debris, these bounce off screen edges instead of wrapping.
 * They also pulse between two images to look like they're glowing.
 */
public class RadioactiveContainer extends Actor {

    private int spd;
    private int pulseCount;   // timer for the glow animation
    private boolean glowing;  // which image is currently showing

    public RadioactiveContainer() {
        spd        = Greenfoot.getRandomNumber(2) + 1;
        pulseCount = 0;
        glowing    = false;

        setRotation(Greenfoot.getRandomNumber(360));
        setImage("radioactive1.png");
    }

    public void act() {
        move(spd);
        bounceEdges();
        pulseGlow();
    }

    // bounce off the edges - different behaviour from junk
    private void bounceEdges() {
        int x   = getX();
        int y   = getY();
        int w   = getWorld().getWidth();
        int h   = getWorld().getHeight();
        int rot = getRotation();

        if (x <= 4 || x >= w - 4) {
            setRotation(180 - rot);
        }
        if (y <= 4 || y >= h - 4) {
            setRotation(360 - rot);
        }
    }

    // switch between two images to create a pulsing glow effect
    private void pulseGlow() {
        pulseCount++;
        if (pulseCount >= 25) {
            pulseCount = 0;
            glowing = !glowing;

            if (glowing) {
                setImage("radioactive2.png");
            } else {
                setImage("radioactive1.png");
            }
        }
    }
}
