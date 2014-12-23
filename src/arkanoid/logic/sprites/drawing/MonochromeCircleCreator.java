package arkanoid.logic.sprites.drawing;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

/**
 * Created by Jasper on 22/12/2014.
 */
public class MonochromeCircleCreator implements ImageCreator {
    private int diameter;
    private String color;

    public MonochromeCircleCreator(int diameter, String color) {
        this.diameter = diameter;
        setColor(color);
    }

    @Override
    public Image createImage() {
        //ARGB zodat afbeelding transparente achtergrond heeft
        BufferedImage image = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.setColor(Color.decode(color));
        Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, diameter, diameter);
        graphics2D.fill(circle);
        return image;
    }

    private void setColor(String color)
    {
        if (!ColorValidation.checkIfValidColorHex(color))
            throw new IllegalArgumentException("The color must be of the format #ffffff.");
        this.color = color;
    }
}
