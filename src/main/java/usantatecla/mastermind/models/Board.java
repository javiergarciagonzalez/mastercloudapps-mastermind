package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private static final int MAX_ATTEMPS = 10;
    private SecretCombination secretCombination;
    private List<ProposedCombination> proposedCombinations;
    private List<Result> results;
  
    private int attempts;

    Board() {
      this.secretCombination = new SecretCombination();
      this.proposedCombinations = new ArrayList<ProposedCombination>();
      this.results = new ArrayList<Result>();
      this.attempts = 0;
  
    }

    public void play(ProposedCombination proposedCombination) {
      this.proposedCombinations.add(proposedCombination);
      this.results.add(this.secretCombination.getResult(proposedCombination));
      this.attempts++;
    }

    public boolean isFinished() {
      return this.isWinner() || this.isLooser();
    }

    public boolean isWinner() {
      return this.results[this.attempts-1].isWinner();
    }

    private boolean isLooser() {
      return this.attempts == Board.MAX_ATTEMPS;
    }

    public int getAttempts() {
      return this.attempts;
    }

  }