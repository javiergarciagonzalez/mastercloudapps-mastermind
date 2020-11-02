package usantatecla.mastermind.distributed;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.types.StateValue;
import usantatecla.mastermind.distributed.dispatchers.TCPIP;

public class LogicProxy extends Logic {

    private TCPIP tcpip;

    public LogicProxy() {
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);
        this.acceptorControllers.put(StateValue.INITIAL, new StartControllerProxy(this.session,this.tcpip));
        this.acceptorControllers.put(StateValue.IN_GAME, new ProposalControllerProxy(this.session,this.tcpip));
        this.acceptorControllers.put(StateValue.RESUME, new ResumeControllerProxy(this.session,this.tcpip));
        this.acceptorControllers.put(StateValue.EXIT, null);
    }

    public void close() {
        this.tcpip.close();
    }

}
