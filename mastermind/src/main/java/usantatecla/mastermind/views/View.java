package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.ControllersVisitor;
import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;

public class View implements ControllersVisitor {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public View() {
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }

    public void interact(AcceptorController controller) {
        controller.accept(this);
    }

    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    public void visit(ProposalController proposalController) {
        this.proposalView.interact(proposalController);
    }

    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }


}
