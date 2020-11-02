package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public abstract class ProposalController extends AcceptorController {

    public ProposalController(Session session) {
        super(session);
    }

    public abstract Error addProposedCombination(List<Color> colors);

    public abstract boolean isWinner();

    public abstract boolean isLoser();

    public abstract int getAttempts();

    public abstract List<Color> getColors(int position);

    public abstract int getBlacks(int position);

    public abstract int getWhites(int position);

    public abstract void undo();

    public abstract void redo();

    public abstract boolean isUndoable();

    public abstract boolean isRedoable();

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
