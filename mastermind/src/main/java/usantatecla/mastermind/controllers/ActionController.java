package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Error;
import usantatecla.mastermind.types.Color;

public class ActionController extends Controller {

    ActionController(Session session) {
        super(session);
    }


    public Error addProposedCombination(List<Color> colors) {
        return this.session.addProposedCombination(colors);
    }

    public void start() {

    }

    public int getWidth() {
        return this.session.getWidth();
    }

    public boolean isWinner() {
        return this.session.isWinner();
    }

    public boolean isLooser() {
        return this.session.isLooser();
    }

    public int getAttempts() {
        return this.session.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.session.getColors(position);
    }

    public int getBlacks(int position) {
        return this.session.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.session.getWhites(position);
    }
}
