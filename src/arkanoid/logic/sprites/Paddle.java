package arkanoid.logic.sprites;

import arkanoid.logic.sprites.drawing.ImageCreator;
import arkanoid.logic.sprites.drawing.MonochromeRectangleCreator;
import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * Created by Jasper on 22/12/2014.
 */
@Immutable
public final class Paddle extends Sprite {
    private final int speed;
    private final boolean movingRight;
    private final boolean movingLeft;
    private final String COLOR = "#000000";

    public Paddle(int x, int y, int width, int height, int speed, boolean movingLeft, boolean movingRight) {
        super(x, y, width, height);
        this.speed = speed;
        checkSpeed();
        this.movingLeft = movingLeft;
        this.movingRight = movingRight;
    }

    private void checkSpeed()
    {
        if (speed < 0)
            throw new IllegalArgumentException("The speed has to be positive.");
    }

    public Paddle move() {
        int newX = x();
        if (movingRight)
            newX += speed;
        if (movingLeft)
            newX -= speed;
        return new Paddle(newX, y(), width(), height(), speed, movingLeft, movingRight);
    }

    public Paddle startMovingRight()
    {
        boolean newMovingRight = true;
        return new Paddle(x(), y(), width(), height(), speed, movingLeft, newMovingRight);
    }

    public Paddle stopMovingRight()
    {
        boolean newMovingRight = false;
        return new Paddle(x(), y(), width(), height(), speed, movingLeft, newMovingRight);
    }

    public Paddle startMovingLeft()
    {
        boolean newMovingLeft = true;
        return new Paddle(x(), y(), width(), height(), speed, newMovingLeft, movingRight);
    }

    public Paddle stopMovingLeft()
    {
        boolean newMovingLeft = false;
        return new Paddle(x(), y(), width(), height(), speed, true, movingRight);
    }

    @Override
    protected ImageCreator createImageCreator() {
        ImageCreator imageCreator = new MonochromeRectangleCreator(width(), height(), COLOR);
        return imageCreator;
    }
}
