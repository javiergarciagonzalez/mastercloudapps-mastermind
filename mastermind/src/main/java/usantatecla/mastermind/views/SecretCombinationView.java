package usantatecla.mastermind.views;

import usantatecla.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    void writeln(int width) {
        for (int i = 0; i < width; i++) {
            this.console.write(MessageView.SECRET.getMessage());
        }
        this.console.writeln();
    }

}
