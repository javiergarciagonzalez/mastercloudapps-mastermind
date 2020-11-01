package usantatecla.mastermind.views;

import usantatecla.mastermind.types.Color;
import usantatecla.utils.WithConsoleView;

public class ColorView extends WithConsoleView {

    public static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

    protected Color color;

    public ColorView(Color color) {
        super();
        this.color = color;
    }

    static String allInitials() {
        String result = "";
        for(char character: ColorView.INITIALS) {
            result += character;
        }
        return result;
    }

    public char getInitial() {
        return ColorView.INITIALS[this.color.ordinal()];
    }

    public static Color getInstance(char character) {
        for (int i = 0; i < ColorView.INITIALS.length; i++) {
            if (ColorView.INITIALS[i] == character) {
                return Color.values()[i];
            }
        }
        return null;
    }

    void write() {
        this.console.write(ColorView.INITIALS[this.color.ordinal()]);
    }

}
