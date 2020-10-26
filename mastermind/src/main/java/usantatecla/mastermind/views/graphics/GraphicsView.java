package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.RedoController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.controllers.UndoController;
import usantatecla.mastermind.views.View;

public class GraphicsView extends View {

    private GameView gameView;

    public GraphicsView() {
        this.gameView = new GameView();
    }

    
    public void visit(StartController startController) {
        this.gameView.interact(startController);
    }

    
    public void visit(ProposalController proposalController) {
        this.gameView.interact(proposalController);
    }

    public void visit(ResumeController resumeController) {
        ResumeDialog resumeDialog = new ResumeDialog();
        resumeController.resume(resumeDialog.isNewGame());
        if (resumeDialog.isNewGame()) {
            this.gameView = new GameView();
        } else {
            this.gameView.setVisible(false);
            System.exit(0);
        }
    }

    public void visit(UndoController undoController) {
        this.gameView.interact(undoController);
    }

    public void visit(RedoController redoController) {
        this.gameView.interact(redoController);
    }

}
