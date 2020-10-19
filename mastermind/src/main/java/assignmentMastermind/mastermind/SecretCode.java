package assignmentMastermind.mastermind;

import assignmentMastermind.utils.Logger;

class SecretCode extends Code {

    Code secretCode;

    SecretCode() {
        super();

        this.generateRandomCode();
    }

    private void generateRandomCode() {
        for(int i = 0; i < Code.CODE_LENGTH; i++) {
            this.colors.add(Color.getRandomColor());
        }
    }

    public boolean isSecretCode(GuessCode guessCode) {
        return this.getBlacks(guessCode) == Code.CODE_LENGTH;
    }

    private Color colorAt(int index) {
        return this.colors.get(index);
    }

    public void checkCode(GuessCode guessCode) {
        int blacks = this.getBlacks(guessCode);
        int whites = this.getWhites(guessCode);

        Logger.write(guessCode.toString() + " --> " + blacks + " blacks and " + whites + " whites");
    }

    private int getBlacks(GuessCode guessCode) {
        int blacks = 0;
        for (int i = 0; i < Code.CODE_LENGTH; i++) {
            if (guessCode.isColorInCode(this.colorAt(i))
            && !guessCode.isColorAtExactPosition(this.colorAt(i), i)) {
                blacks++;
            }
        }

        return blacks;
    }

    private int getWhites(GuessCode guessCode) {
        int whites = 0;
        for (int i = 0; i < Code.CODE_LENGTH; i++) {
            if (guessCode.isColorAtExactPosition(this.colorAt(i), i)) {
                whites++;
            }
        }

        return whites;
    }
}
