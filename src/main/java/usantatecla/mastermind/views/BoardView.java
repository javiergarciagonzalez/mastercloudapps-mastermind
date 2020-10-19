package usantatecla.mastermind.views;

import java.util.ArrayList;

import usantatecla.mastermind.models.Board;
import usantatecla.mastermind.models.ProposedCombination;

public class BoardView extends ConsoleView {

    private Board board;

    BoardView(Board board) {
        super();
        this.board = board;
        this.secretCombinationView = new SecretCombinationView();
        this.proposedCombinations = new ArrayList<ProposedCombination>();
        this.resultView = new ResultView[Board.MAX_ATTEMPS];

        this.startGame();
    }

    private void startGame() {
        MessageView.TITLE.write();
    }

    public void play() {

        this.proposedCombinationsViews[this.attempts] = new ProposedCombinationView();
        this.results[this.attempts] = this.secretCombination.getResult(proposedCombination);
        this.board.play();
    }

    public void writeln() {
        this.console.writeln();
        Message.ATTEMPTS.writeln(this.board.attempts);
        this.secretCombinationView.writeln();

        for (int i = 0; i < this.attempts; i++) {
            this.proposedCombinationsView().write(i)
          this.proposedCombinations[i].write();
          this.results[i].writeln();
        }
      }

}
