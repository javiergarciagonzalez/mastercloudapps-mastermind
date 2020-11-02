package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Result;
import usantatecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {

    void writeln(Result result) {
        this.console.writeln(MessageView.RESULT.getMessage()
                .replaceFirst("#blacks", "" + result.getBlacks())
                .replaceFirst("#whites", "" + result.getWhites()));
    }

}
