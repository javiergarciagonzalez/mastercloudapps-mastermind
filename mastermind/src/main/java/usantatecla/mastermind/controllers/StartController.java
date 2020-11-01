package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public abstract class StartController extends AcceptorController {

    public StartController(Session session) {
        super(session);
    }

    public abstract void start();

    public abstract int getWidth();

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
