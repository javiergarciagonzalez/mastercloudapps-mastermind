package usantatecla.mastermind.controllers.implementation;

import java.util.List;

import usantatecla.mastermind.controllers.ActionController;
import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.RedoController;
import usantatecla.mastermind.controllers.UndoController;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class ProposalControllerImplementation extends ProposalController {

    private ActionController actionController;
    private UndoController undoController;
    private RedoController redoController;

    ProposalControllerImplementation(Session session) {
        super(session);
        this.actionController = new ActionController(this.session);
        this.undoController = new UndoController(this.session);
        this.redoController = new RedoController(this.session);
    }


    public Error addProposedCombination(List<Color> colors) {
        return this.actionController.addProposedCombination(colors);
    }

    public boolean isWinner() {
        return this.actionController.isWinner();
    }

    public boolean isLoser() {
        return this.actionController.isLoser();
    }

    public int getAttempts() {
        return this.actionController.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.actionController.getColors(position);
    }

    public int getBlacks(int position) {
        return this.actionController.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.actionController.getWhites(position);
    }

    public void undo() {
        this.undoController.undo();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean isUndoable() {
        return this.undoController.isUndoable();
    }

    public boolean isRedoable() {
        return this.redoController.isRedoable();
    }
}
