package arkanoid.logic.sprites;

import arkanoid.logic.sprites.drawing.ImageCreator;
import arkanoid.logic.sprites.drawing.MonochromeRectangleCreator;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.IllegalFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jasper on 21/12/2014.
 */
public class Block extends Sprite {
    private String color;

    public Block(int x, int y, int width, int height, String color)
    {
        super(x, y, width, height);
        this.color = color;
    }

    @Override
    protected ImageCreator createImageCreator() {
        ImageCreator imageCreator = new MonochromeRectangleCreator(getWidth(), getHeight(), color);
        return imageCreator;
    }
}
