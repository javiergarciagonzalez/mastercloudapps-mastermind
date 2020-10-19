package assignmentMastermind.mastermind;

/**
 * Mastermind game
 *
 */
public class Mastermind {
    private Board board;

    public void play() {
        this.board = new Board();
        
        do {
            this.board.playRound();
        } while(!this.board.isGameFinished());

    }

    public static void main( String[] args )
    {
        
        new Mastermind().play();
    }
}
