package usantatecla.mastermind.models;

import java.util.List;

import usantatecla.mastermind.types.Color;
import usantatecla.mastermind.types.Error;

public class Session {

    private Game game;
    private GameRegistry registry;
    private State state;

    public Session() {
        this.game = new Game();
        this.state = new State();
    }

    public Error addProposedCombination(List<Color> colors) {
        Error error = null;
        if (colors.size() != Combination.getWidth()) {
            error = Error.WRONG_LENGTH;
        } else {
            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i) == null) {
                    error = Error.WRONG_CHARACTERS;
                } else {
                    for (int j = i+1; j < colors.size(); j++) {
                        if (colors.get(i) == colors.get(j)) {
                            error = Error.DUPLICATED;
                        }
                    }
                }
            }
        }
        if (error == null){
            this.registry = new GameRegistry(this.game);
            this.game.addProposedCombination(colors);
            if (this.game.isWinner() || this.game.isLooser()) {
                this.state.next();
            }
        }
        return error;
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

    public boolean isLooser() {
        return this.game.isLooser();
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
