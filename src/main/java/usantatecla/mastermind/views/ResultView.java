package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Result;

public class ResultView extends ConsoleView {
    
    private Result result;

    ResultView(Result result) {
        this.result = result;
    }

    void writeln() {
        MessageView.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
    }
}
