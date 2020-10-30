package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.console.View;

class ConsoleMastermind extends Mastermind {

    @Override
    protected View createView(Game game) {
        return new View(game);
    }

    public static void main(String[] args) {
        new ConsoleMastermind().play();
    }
}
