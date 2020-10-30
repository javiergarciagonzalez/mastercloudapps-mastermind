package usantatecla.mastermind.models;

import java.util.List;
import java.util.ArrayList;

public class GameMemento {

    int attempts;
    List<Result> results;
    List<ProposedCombination> proposedCombinations;

    GameMemento(int attempts, List<Result> results, List<ProposedCombination> proposedCombinations) {
        this.attempts = attempts;
        this.results = new ArrayList<>(results);
        this.proposedCombinations = new ArrayList<>(proposedCombinations);
    }

    List<Result> getResults() {
        return this.results;
    }

    List<ProposedCombination> getProposedCombinations() {
        return this.proposedCombinations;
    }

    int getAttempts() {
        return this.attempts;
    }

}
