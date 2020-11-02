package usantatecla.mastermind.controllers;


import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.StateValue;

public abstract class Controller {

    protected Session session;

    Controller(Session session) {
        this.session = session;
    }

    public StateValue getValueState() {
        return this.session.getValueState();
    }

    public int getWidth() {
        return this.session.getWidth();
    }
}
