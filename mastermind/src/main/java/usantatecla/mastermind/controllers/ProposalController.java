package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class ProposalController extends Controller implements AcceptorController {

    private ActionController actionController;
    private UndoController undoController;
    private RedoController redoController;

    public ProposalController(Session session) {
        super(session);
        this.actionController = new ActionController(session);
        this.undoController = new UndoController(session);
        this.redoController = new RedoController(session);
    }

    public Error addProposedCombination(List<Color> colors) {
        return this.actionController.addProposedCombination(colors);
    }

    public boolean isWinner() {
        return this.actionController.isWinner();
    }

    public boolean isLooser() {
        return this.actionController.isLooser();
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

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
