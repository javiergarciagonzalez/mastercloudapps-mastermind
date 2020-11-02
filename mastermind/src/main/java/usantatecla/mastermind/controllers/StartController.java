package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.StartView;

public class StartController extends Controller {

    public StartController(Session session) {
        super(session);
    }

    public void start() {
        this.session.next();
    }

    public int getWidth() {
        return this.session.getWidth();
    }

    @Override
    public void control() {
        this.session.next();
        new StartView().write();
    }

}
