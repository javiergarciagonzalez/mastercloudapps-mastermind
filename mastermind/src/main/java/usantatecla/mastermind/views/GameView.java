package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.utils.WithConsoleView;

public class GameView extends WithConsoleView {

    public GameView(ProposalController proposalController) {
        this.console.writeln();

        new AttemptsView(proposalController).writeln();

        new SecretCombinationView(proposalController).writeln();

        for (int i = 0; i <  proposalController.getAttempts(); i++) {
            new ProposedCombinationView(proposalController).write(i);
            new ResultView(proposalController).writeln(i);
        }

        if (proposalController.isWinner()) {
            this.console.writeln(MessageView.WINNER.getMessage());
        } else if (proposalController.isLoser()) {
            this.console.writeln(MessageView.LOOSER.getMessage());
        }
    }
}
