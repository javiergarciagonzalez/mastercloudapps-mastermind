package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.ProposalController;

public class BlacksDispatcher extends Dispatcher {

    public BlacksDispatcher(ProposalController proposalController) {
        super(proposalController);
    }

    @Override
    public void dispatch() {
        int blacks = this.tcpip.receiveInt();
        this.tcpip.send(((ProposalController) this.acceptorController).getBlacks(blacks));
    }

}
