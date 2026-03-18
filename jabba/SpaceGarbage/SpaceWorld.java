import greenfoot.*;

/**
 * SpaceWorld - the main world for Space Garbage Collector.
 * Collect 10 pieces of space junk to win. Avoid radioactive containers.
 * Press R to restart at any time.
 */
public class SpaceWorld extends World {

    private int score;
    private int lives;
    private int timer;
    private int actCount;
    private boolean gameOver;

    private ScoreBoard board;

    private static final int WIN_SCORE = 10;

    public SpaceWorld() {
        super(700, 500, 1);

        score    = 0;
        lives    = 3;
        timer    = 60;
        actCount = 0;
        gameOver = false;

        setBackground("space.png");

        Ship ship = new Ship();
        addObject(ship, getWidth() / 2, getHeight() / 2);

        board = new ScoreBoard(score, lives, timer);
        addObject(board, getWidth() / 2, 22);

        spawnJunk(8);
        spawnContainers(3);
    }

    public void act() {
        if (Greenfoot.isKeyDown("r")) {
            Greenfoot.setWorld(new SpaceWorld());
            return;
        }

        if (gameOver) return;

        actCount++;

        // 1 second tick
        if (actCount % 60 == 0) {
            timer--;
            board.update(score, lives, timer);
        }

        // spawn 2 junk pieces every second
        if (actCount % 60 == 0) {
            spawnJunk(2);
        }

        // extra burst every 5 seconds
        if (actCount % 300 == 0) {
            spawnJunk(4);
        }

        // containers spawn every ~4 seconds
        if (actCount % 240 == 0) {
            spawnContainers(1);
        }

        checkGameOver();
    }

    private void checkGameOver() {
        if (score >= WIN_SCORE) {
            gameOver = true;
            board.showMessage("MISSION COMPLETE!  Score: " + score + "  |  Press R to play again");
            Greenfoot.stop();
            return;
        }

        if (lives <= 0) {
            gameOver = true;
            board.showMessage("MISSION FAILED  -  Score: " + score + "  |  Press R to retry");
            Greenfoot.stop();
            return;
        }

        if (timer <= 0) {
            gameOver = true;
            board.showMessage("TIME UP!  Got " + score + "/" + WIN_SCORE + "  |  Press R to retry");
            Greenfoot.stop();
        }
    }

    private void spawnJunk(int amount) {
        for (int i = 0; i < amount; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Junk(), x, y);
        }
    }

    private void spawnContainers(int amount) {
        for (int i = 0; i < amount; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new RadioactiveContainer(), x, y);
        }
    }

    public void addScore(int pts) {
        score = score + pts;
        board.update(score, lives, timer);
    }

    public void loseLife() {
        lives--;
        board.update(score, lives, timer);
        Greenfoot.playSound("hit.wav");
    }
}
