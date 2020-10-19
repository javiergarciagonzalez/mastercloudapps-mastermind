package assignmentMastermind.mastermind;

import java.util.ArrayList;

import assignmentMastermind.utils.Logger;
import assignmentMastermind.utils.Messages;

public abstract class Code {

    public static int CODE_LENGTH = 4;
    protected ArrayList<Color> colors;

    Code() {
        this.colors =  new ArrayList<Color>(CODE_LENGTH);
    }
    
    Code(String code) {
        if (!Code.isValidCode(code)) {
            return;
        }

        this.colors = new ArrayList<Color>(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            this.colors.add(Color.getInstance(code.charAt(i)));
        }
    }

    private static boolean isValidLength(String code) {
        return code.length() == CODE_LENGTH;
    }

    public static boolean isValidCode(String code) {
        if (!Code.isValidLength(code)) {
            Logger.writeMessage(Messages.WRITE_4_LETTERS_CODE);
            return false;
        };

        int colorsCount = 0;
            do {
                char color = code.charAt(colorsCount);
                 if (!Color.isValidColor(color)) {
                     Logger.writeMessage(Messages.WRONG_COLOR);
                     break;
                 }
                colorsCount++;
            } while(colorsCount < CODE_LENGTH);

        return colorsCount == CODE_LENGTH;
    }
}