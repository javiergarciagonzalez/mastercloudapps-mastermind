package assignmentMastermind.mastermind;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Color {

    RED('r'),
    BLUE('b'),
    ORANGE('o'),
    YELLOW('y'),
    GREEN('g'),
    NULL_COLOR;

    public final char initial;
    private final char NULL = ' ';
    private static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    private Color() {
        this.initial = this.NULL;
    }

    private Color(char initial) {
        this.initial = initial;
    }

    public static Color getInstance(char character) {
        for(int i = 0; i < Color.SIZE; i++) {
            if (Color.get(i).initial == character) {
                return Color.get(i);
            }
        }
        return Color.NULL_COLOR;
    }

    public static Color get(int index){
        return Color.values()[index];
    };
    
    public static Color getRandomColor() {
        return VALUES.get(RANDOM.nextInt(SIZE - 1));
    }

    public char getRandomInitial() {
        return VALUES.get(RANDOM.nextInt(SIZE)).initial;
    }

    public static boolean isValidColor(char color) {
        return Arrays.asList(Color.values()).contains(Color.getInstance(color))
                && Color.getInstance(color) != Color.NULL_COLOR;
    }



}
