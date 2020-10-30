package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Result;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {

	private Result result;

	ResultView(Result result) {
		this.result = result;
	}

	void writeln() {
		MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}

}
