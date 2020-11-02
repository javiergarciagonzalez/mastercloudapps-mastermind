package usantatecla.mastermind.distributed.dispatchers;

import java.util.List;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.types.Color;

public class AddProposedCombinationDispatcher extends Dispatcher {

    public AddProposedCombinationDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        List<Color> proposedCombination = this.tcpip.receiveColorList();
        this.tcpip.send(((ProposalController)this.acceptorController).addProposedCombination(proposedCombination));
    }
}

