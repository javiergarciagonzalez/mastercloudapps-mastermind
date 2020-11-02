package usantatecla.mastermind.distributed;

import java.util.List;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.distributed.dispatchers.FrameType;
import usantatecla.mastermind.distributed.dispatchers.TCPIP;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class ProposalControllerProxy extends ProposalController {

    private TCPIP tcpip;

    ProposalControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public Error addProposedCombination(List<Color> colors) {
         this.tcpip.send(FrameType.ADD_PROPOSED_COMBINATION.name());
        return this.tcpip.receiveError();
    }

    @Override
    public boolean isWinner() {
        this.tcpip.send(FrameType.WINNER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean isLoser() {
        this.tcpip.send(FrameType.LOSER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public int getAttempts() {
        this.tcpip.send(FrameType.ATTEMPTS.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public List<Color> getColors(int position) {
        this.tcpip.send(FrameType.GET_COLORS.name());
        return this.tcpip.receiveColorList();
    }

    @Override
    public int getBlacks(int position) {
        this.tcpip.send(FrameType.BLACKS.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public int getWhites(int position) {
        this.tcpip.send(FrameType.WHITES.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public void undo() {
        this.tcpip.send(FrameType.UNDO.name());
    }

    @Override
    public void redo() {
        this.tcpip.send(FrameType.REDO.name());
    }

    @Override
    public boolean isUndoable() {
        this.tcpip.send(FrameType.UNDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public boolean isRedoable() {
        this.tcpip.send(FrameType.REDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

}
