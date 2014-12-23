package arkanoid.logic.sprites;

import arkanoid.logic.sprites.drawing.ImageCreator;
import jdk.nashorn.internal.ir.annotations.Immutable;

import java.awt.*;

/**
 * Created by Jasper on 21/12/2014.
 */
@Immutable
public abstract class Sprite {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Sprite(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        checkConstLimits();
    }

    public Image createImage()
    {
        ImageCreator imageCreator = createImageCreator();
        return imageCreator.createImage();
    }

    private void checkConstLimits()
    {   if (x < 0)
            throw new IllegalArgumentException("X has to be positive.");
        if (y < 0)
            throw new IllegalArgumentException("Y has to be positive.");
        if (width < 1)
            throw new IllegalArgumentException("The width must be at least 1.");
        if (height < 1)
            throw new IllegalArgumentException("The height has to be at least 1.");
    }

    protected abstract ImageCreator createImageCreator();

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }


}
