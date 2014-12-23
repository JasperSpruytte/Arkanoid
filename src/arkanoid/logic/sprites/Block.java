package arkanoid.logic.sprites;

import arkanoid.logic.sprites.drawing.ImageCreator;
import arkanoid.logic.sprites.drawing.MonochromeRectangleCreator;
import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * Created by Jasper on 21/12/2014.
 */
@Immutable
public final class Block extends Sprite {
    private final String color;

    public Block(int x, int y, int width, int height, String color)
    {
        super(x, y, width, height);
        this.color = color;
    }

    @Override
    protected ImageCreator createImageCreator() {
        ImageCreator imageCreator = new MonochromeRectangleCreator(width(), height(), color);
        return imageCreator;
    }
}
