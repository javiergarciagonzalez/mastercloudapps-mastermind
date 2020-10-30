package usantatecla.mastermind.views.console;

import usantatecla.utils.WithConsoleView;
import usantatecla.mastermind.views.MessageView;

class StartView extends WithConsoleView {

	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}
