package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.GameView;

public abstract class InGameController extends Controller {

    private GameView gameView;

    InGameController(Session session) {
        super(session);
        this.gameView = new GameView();
    }

    @Override
    public void control() {
        this.inGameControl();
        this.addProposedCombination();
        if (this.session.isWinner()) {
            this.gameView.writeWinner();
        } else if (this.session.isLoser()) {
            this.gameView.writeLoser();
        }
    }

    private void addProposedCombination() {
        this.gameView.writeAttempts(this.session.getAttempts());
        for (int i = 0; i < this.session.getAttempts(); i++) {
            this.gameView.writeProposedCombination(this.session.getColors(i));
            this.gameView.writeResult(this.session.getResult(i));
        }
    }

    protected abstract void inGameControl();

}
