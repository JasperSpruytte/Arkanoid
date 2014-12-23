package arkanoid.logic.sprites.drawing;

import java.util.regex.Pattern;

/**
 * Created by Jasper on 22/12/2014.
 */
public final class ColorValidation {

    private ColorValidation() {}

    public static boolean checkIfValidColorHex(String color)
    {
        String regex = "^#[0-9a-f]{6}$";
        return Pattern.matches(regex, color);
    }
}
