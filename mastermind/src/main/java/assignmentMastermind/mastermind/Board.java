package assignmentMastermind.mastermind;

import java.util.ArrayList;

import assignmentMastermind.utils.Logger;
import assignmentMastermind.utils.Messages;
import assignmentMastermind.utils.Console;

public class Board {
    private final int MAX_ATTEMPS = 10;
    private int attemps;
    private ArrayList<GuessCode> guessCodes;
    private SecretCode secretCode;

    public Board() {
        this.attemps = 0;
        this.secretCode = new SecretCode();
        this.guessCodes = new ArrayList<GuessCode>(MAX_ATTEMPS);
    }

    public void playRound() {
        String proposedCode = "";

        do {
            Logger.write(Integer.toString(this.attemps) + Messages.ATTEMPS.text);
            this.attemps++;
            proposedCode = this.getProposedCode();
        } while(!Code.isValidCode(proposedCode));

        GuessCode guessCode = new GuessCode(proposedCode);
        this.guessCodes.add(guessCode);
        this.secretCode.checkCode(guessCode);
    }

    public String getProposedCode() {
        Logger.writeMessage(Messages.PROPOSE_COMBINATION);
        Logger.writeMessage(Messages.COMBINATION_TIPS);
        
        String inputCodeString = Console.instance().readString();
        return inputCodeString;
    }

    public boolean isGameFinished() {
        boolean isWinner = this.secretCode.isSecretCode(this.guessCodes.get(this.attemps - 1));

        if (isWinner) {
            Logger.writeMessage(Messages.WINNER);
        }

        return isWinner || this.attemps == MAX_ATTEMPS;
    }


}
