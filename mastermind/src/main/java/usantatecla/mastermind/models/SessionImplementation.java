package usantatecla.mastermind.models;

import java.util.List;

import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.StateValue;

public class SessionImplementation implements Session {

    private Game game;
    private GameRegistry registry;
    private State state;

    public SessionImplementation() {
        this.game = new Game();
        this.state = new State();
        this.registry = new GameRegistry(this.game);
    }

    public void addProposedCombination(List<Color> colors) {
       this.game.addProposedCombination(colors);
       this.registry.register();
    }

    public int getWidth() {
        return this.game.getWidth();
    }

    public void reset() {
        this.state.reset();
    }

    public void next() {
        this.state.next();
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public boolean isLoser() {
        return this.game.isLoser();
    }

    public int getAttempts() {
        return this.game.getAttempts();
    }

    public List<Color> getColors(int position) {
        return this.game.getColors(position);
    }

    public int getBlacks(int position) {
        return this.game.getBlacks(position);
    }

    public int getWhites(int position) {
        return this.game.getWhites(position);
    }
    public StateValue getValueState() {
        return this.state.getValueState();
    }

    public void undo() {
        this.registry.undo();
    }

    public boolean isUndoable() {
        return this.registry.isUndoable();
    }

    public void redo() {
        this.registry.redo();
    }

    public boolean isRedoable() {
        return this.registry.isRedoable();
    }

}
