package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

	@Override
	protected View createView(Game game) {
		return new View(game);
	}

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}
}
