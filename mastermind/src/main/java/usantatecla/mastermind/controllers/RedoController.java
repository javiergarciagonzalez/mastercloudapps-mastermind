package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class RedoController extends InGameController {

    RedoController(Session session) {
        super(session);
    }

    boolean isRedoable() {
        return this.session.isRedoable();
    }

    @Override
    public void inGameControl() {
        this.session.redo();
    }
}

