package arkanoid.logic.sprites;

import arkanoid.logic.sprites.drawing.ImageCreator;
import arkanoid.logic.sprites.drawing.MonochromeCircleCreator;
import arkanoid.logic.sprites.drawing.MonochromeRectangleCreator;

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
        return new MonochromeCircleCreator(getWidth(), COLOR);
    }

    public void move() {
        setX(getX() + horizontalSpeed);
        setY(getY() + verticalSpeed);
    }
}
