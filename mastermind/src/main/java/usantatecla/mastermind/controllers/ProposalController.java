package usantatecla.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import usantatecla.mastermind.models.Session;

import usantatecla.mastermind.views.ActionCommand;

import usantatecla.mastermind.views.RedoCommand;
import usantatecla.mastermind.views.UndoCommand;
import usantatecla.utils.Command;
import usantatecla.utils.Menu;

public class ProposalController extends Controller {

    private Map<Command, Controller> controllers;

    private ActionController actionController;
    private ActionCommand actionCommand;
    private UndoController undoController;
    private UndoCommand undoCommand;
    private RedoController redoController;
    private RedoCommand redoCommand;

    private Menu menu;


    public ProposalController(Session session) {
        super(session);
        this.controllers = new HashMap<Command, Controller>();
        this.actionController = new ActionController(this.session);
        this.actionCommand = new ActionCommand();
        this.controllers.put(this.actionCommand, this.actionController);
        this.undoCommand = new UndoCommand();
        this.undoController = new UndoController(this.session);
        this.controllers.put(this.undoCommand, this.undoController);
        this.redoCommand = new RedoCommand();
        this.redoController = new RedoController(this.session);
        this.controllers.put(this.redoCommand, this.redoController);
        this.menu = new Menu(this.controllers.keySet());
    }

    @Override
    public void control() {
        this.actionCommand.setActive(true);
        this.undoCommand.setActive(this.undoController.isUndoable());
        this.redoCommand.setActive(this.redoController.isRedoable());
        this.controllers.get(this.menu.execute()).control();
    }

}
