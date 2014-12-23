package arkanoid.logic.sprites.drawing;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Jasper on 22/12/2014.
 */
public class MonochromeRectangleCreator implements ImageCreator {
    private int width;
    private int height;
    private String color;


    public MonochromeRectangleCreator(int width, int height, String color)
    {
        this.width = width;
        this.height = height;
        setColor(color);
    }

    @Override
    public Image createImage() {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.setColor(Color.decode(color));
        graphics2D.fillRect(0, 0, width, height);
        return image;
    }

    private void setColor(String color)
    {
        if (!ColorValidation.checkIfValidColorHex(color))
            throw new IllegalArgumentException("The color must be of the format #ffffff.");
        this.color = color;
    }
}
