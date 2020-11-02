package usantatecla.mastermind.views;

import usantatecla.utils.Command;

public class ActionCommand extends Command {

    public ActionCommand() {
        super(MessageView.ACTION_COMMAND.getMessage());
    }

    @Override
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
