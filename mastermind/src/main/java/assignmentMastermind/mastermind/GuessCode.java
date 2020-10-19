package assignmentMastermind.mastermind;

class GuessCode extends Code {
    GuessCode(String proposedCode) {
        super(proposedCode);
    }

    public boolean isColorInCode(Color color) {
        return this.colors.contains(color);
    }

    public boolean isColorAtExactPosition(Color color, int position) {
        return this.colors.get(position) != color;
    }

    public String toString() {
        String code = "";

        for(int i = 0; i < Code.CODE_LENGTH; i++) {
            code = code + this.colors.get(i).initial;
        }

        return code;
    }

}
