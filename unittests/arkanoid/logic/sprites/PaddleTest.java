package arkanoid.logic.sprites;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaddleTest {

    @Test(expected = IllegalArgumentException.class)
    public void paddle_constructor_preventNegativeSpeed()
    {
        int illegalSpeed = -1;
        Paddle paddle = new Paddle(1, 1, 1, 1, illegalSpeed);
    }

    @Test
    public void paddle_move_moveRightIfMoveRightIsTue()
    {
        int initialX = 0;
        int speed = 10;
        Paddle paddle = new Paddle(initialX, 1, 1, 1, speed);
        int expectedNewX = initialX + speed;

        paddle.setMovingRight(true);
        paddle.move();

        Assert.assertEquals(expectedNewX, paddle.getX());
    }

    @Test
    public void paddle_move_moveLeftIfMoveLeftIsTrue()
    {
        int initialX = 10;
        int speed = 10;
        Paddle paddle = new Paddle(initialX, 1, 1, 1, speed);
        int expectedNewX = initialX - speed;

        paddle.setMovingLeft(true);
        paddle.move();

        Assert.assertEquals(expectedNewX, paddle.getX());
    }

}