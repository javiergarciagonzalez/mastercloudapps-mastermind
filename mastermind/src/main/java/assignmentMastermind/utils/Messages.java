package assignmentMastermind.utils;

public enum Messages {
    ATTEMPS(" attemp(s):"),
    PROPOSE_COMBINATION("Propose a combination:"),
    COMBINATION_TIPS("Colors: Orange(o), Blue(b), RED(r), YELLOW(y) and green(g)."),
    WRONG_COLOR("Please, use only allowed colors."),
    WRITE_4_LETTERS_CODE("Please, write a code of 4 letters."),
    WRONG_CODE("Wrong color"),
    WINNER("CONGRATULATIONS!");

    public String text;

    Messages(String text) {
        this.text = text;
    }
}
