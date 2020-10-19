package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Board;

public class View {

    private BoardView boardView;

    public View(Board board) {
        this.boardView = new BoardView(board);
        this.play();
    }
    
    public void play() {
        this.boardView.play();
    }
}
