package usantatecla.mastermind.views;

import java.util.List;

import usantatecla.mastermind.models.Combination;
import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.types.Color;

public class GameView {

    public void writeSeparator() {
        MessageView.SEPARATOR.writeln();
    }

    public void writeAttempts(int attempts) {
        MessageView.ATTEMPTS.writeln(attempts);
    }

    public void writeProposedCombination(List<Color> colors) {
        new ProposedCombinationView().write(colors);
    }

    public void writeSecretCombination(Combination combination) {
        int secretCombinationSize = combination.getColors().size();
        new SecretCombinationView().writeln(secretCombinationSize);
    }

    public void writeWinner() {
        MessageView.WINNER.write();
    }

    public void writeLoser() {
        MessageView.LOSER.write();
        MessageView.LOSER.write();
    }

    public void writeResult(Result result) {
        new ResultView().writeln(result);
    }
}
