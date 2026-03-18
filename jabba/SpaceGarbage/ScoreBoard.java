import greenfoot.*;

/**
 * ScoreBoard - displays score, lives and time remaining at the top of the screen.
 * Updated by SpaceWorld via update(). End-of-game message via showMessage().
 */
public class ScoreBoard extends Actor {

    public ScoreBoard(int score, int lives, int time) {
        draw(score, lives, time);
    }

    public void act() {
        // world calls update() directly, nothing needed here
    }

    public void update(int score, int lives, int time) {
        draw(score, lives, time);
    }

    private void draw(int score, int lives, int time) {
        GreenfootImage img = new GreenfootImage(400, 34);

        img.setColor(new Color(0, 0, 0, 170));
        img.fillRect(0, 0, 400, 34);

        img.setColor(Color.WHITE);
        img.setFont(new Font("Monospaced", false, false, 15));
        img.drawString("Score: " + score + " / 10     Lives: " + lives + "     Time: " + time + "s", 10, 23);

        setImage(img);
    }

    // end-of-game message — full width banner
    public void showMessage(String msg) {
        GreenfootImage img = new GreenfootImage(680, 50);
        img.setColor(new Color(0, 0, 0, 210));
        img.fillRect(0, 0, 680, 50);
        img.setColor(Color.YELLOW);
        img.setFont(new Font("Arial", true, false, 17));
        img.drawString(msg, 10, 34);
        setImage(img);
    }
}
