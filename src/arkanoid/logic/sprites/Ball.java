package arkanoid.logic.sprites;

import arkanoid.logic.sprites.drawing.ImageCreator;
import arkanoid.logic.sprites.drawing.MonochromeCircleCreator;

/**
 * Created by Jasper on 22/12/2014.
 */
public class Ball extends Sprite {
    private int horizontalSpeed;
    private int verticalSpeed;
    private final String COLOR = "#000000";

    public Ball(int x, int y, int diameter, int horizontalSpeed, int verticalSpeed) {
        super(x, y, diameter, diameter);
        this.verticalSpeed = verticalSpeed;
        this.horizontalSpeed = horizontalSpeed;
    }

    @Override
    protected ImageCreator createImageCreator() {
        return new MonochromeCircleCreator(width(), COLOR);
    }

    public Ball move() {
        int newX = x() + horizontalSpeed;
        int newY = y() + verticalSpeed;
        return new Ball(newX, newY, width(), horizontalSpeed, verticalSpeed);
    }
}
