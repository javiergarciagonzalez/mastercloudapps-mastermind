package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.ProposalController;

public class StateDispatcher extends Dispatcher {

    public StateDispatcher(ProposalController ProposalController) {
        super(ProposalController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(this.acceptorController.getValueState().ordinal());
    }

}
