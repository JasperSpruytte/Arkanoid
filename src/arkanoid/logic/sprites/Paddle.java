package arkanoid.logic.sprites;

import arkanoid.logic.sprites.drawing.ImageCreator;
import arkanoid.logic.sprites.drawing.MonochromeRectangleCreator;

import java.awt.*;

/**
 * Created by Jasper on 22/12/2014.
 */
public class Paddle extends Sprite {
    private int speed;
    private boolean movingRight;
    private boolean movingLeft;
    private final String COLOR = "#000000";

    public Paddle(int x, int y, int width, int height, int speed) {
        super(x, y, width, height);
        setSpeed(speed);
    }

    private void setSpeed(int speed)
    {
        if (speed < 0)
            throw new IllegalArgumentException("The speed has to be positive.");
        this.speed = speed;
    }

    public void move() {
        if (movingRight)
            setX(getX() + speed);
        if (movingLeft)
            setX(getX() - speed);
    }

    public void setMovingRight(boolean movingRight) {
        this.movingRight = movingRight;
    }

    public void setMovingLeft(boolean movingLeft) {
        this.movingLeft = movingLeft;
    }

    @Override
    protected ImageCreator createImageCreator() {
        ImageCreator imageCreator = new MonochromeRectangleCreator(getWidth(), getHeight(), COLOR);
        return imageCreator;
    }
}
