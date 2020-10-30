package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.utils.Menu;

public class PlayMenu extends Menu {

  PlayMenu(ProposalController proposalController) {
      this.addCommand(new ProposalCommand(proposalController));
      this.addCommand(new UndoCommand(proposalController));
      this.addCommand(new RedoCommand(proposalController));
    }

}
