package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class UndoController extends InGameController {

    UndoController(Session session) {
        super(session);
    }

    boolean isUndoable() {
        return this.session.isUndoable();
    }

    @Override
    public void inGameControl() {
        this.session.undo();
    }
}
