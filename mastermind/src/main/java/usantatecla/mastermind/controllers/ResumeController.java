package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.views.ResumeView;

public class ResumeController extends Controller {

    public ResumeController(Session session) {
        super(session);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.session.newGame();
        } else {
            this.session.next();
        }
    }

    @Override
    public void control() {
        this.resume(new ResumeView().read());
    }

}
