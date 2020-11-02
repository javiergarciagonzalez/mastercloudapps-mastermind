package usantatecla.mastermind.distributed;

import usantatecla.mastermind.controllers.implementation.LogicImplementation;
import usantatecla.mastermind.distributed.dispatchers.AddProposedCombinationDispatcher;
import usantatecla.mastermind.distributed.dispatchers.AttemptsDispatcher;
import usantatecla.mastermind.distributed.dispatchers.BlacksDispatcher;
import usantatecla.mastermind.distributed.dispatchers.ColorsDispatcher;
import usantatecla.mastermind.distributed.dispatchers.DispatcherPrototype;
import usantatecla.mastermind.distributed.dispatchers.FrameType;
import usantatecla.mastermind.distributed.dispatchers.LoserDispatcher;
import usantatecla.mastermind.distributed.dispatchers.RedoDispatcher;
import usantatecla.mastermind.distributed.dispatchers.StartDispatcher;
import usantatecla.mastermind.distributed.dispatchers.StateDispatcher;
import usantatecla.mastermind.distributed.dispatchers.UndoDispatcher;
import usantatecla.mastermind.distributed.dispatchers.UndoableDispatcher;
import usantatecla.mastermind.distributed.dispatchers.WhitesDispatcher;
import usantatecla.mastermind.distributed.dispatchers.WidthDispatcher;
import usantatecla.mastermind.distributed.dispatchers.WinnerDispatcher;
import usantatecla.mastermind.distributed.dispatchers.RedoableDispatcher;
import usantatecla.mastermind.distributed.dispatchers.ResumeDispatcher;

public class LogicImplementationServer extends LogicImplementation {

    public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImplementation));

        dispatcherPrototype.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.LOSER, new LoserDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.BLACKS, new BlacksDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.WHITES, new WhitesDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.ADD_PROPOSED_COMBINATION, new AddProposedCombinationDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_WIDTH, new WidthDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.GET_COLORS, new ColorsDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.proposalControllerImplementation));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.proposalControllerImplementation));

        dispatcherPrototype.add(FrameType.NEW_GAME, new ResumeDispatcher(this.resumeControllerImplementation));
    }

}
