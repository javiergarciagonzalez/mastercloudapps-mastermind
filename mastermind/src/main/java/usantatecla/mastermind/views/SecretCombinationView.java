package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    private Controller controller;

    SecretCombinationView(Controller controller) {
        super();
        this.controller = controller;
    }

    void writeln() {
        for (int i = 0; i < this.controller.getWidth(); i++) {
            this.console.write(MessageView.SECRET.getMessage());
        }
        this.console.writeln();
    }

}
