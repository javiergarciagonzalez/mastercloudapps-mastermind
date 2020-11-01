package usantatecla.mastermind.controllers.implementation;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.models.SessionImplementation;
import usantatecla.mastermind.types.StateValue;

public class LogicImplementation extends Logic {

    protected StartControllerImplementation startControllerImplementation;
    protected ProposalControllerImplementation proposalControllerImplementation;
    protected ResumeControllerImplementation resumeControllerImplementation;

    public LogicImplementation() {
        this.session = new SessionImplementation();
        this.startControllerImplementation = new StartControllerImplementation(this.session);
		this.proposalControllerImplementation = new ProposalControllerImplementation(this.session);
		this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
        this.acceptorControllers.put(StateValue.INITIAL, new StartControllerImplementation(this.session));
        this.acceptorControllers.put(StateValue.IN_GAME, new ProposalControllerImplementation(this.session));
        this.acceptorControllers.put(StateValue.FINAL, new ResumeControllerImplementation(this.session));
        this.acceptorControllers.put(StateValue.EXIT, null);
    }
}
