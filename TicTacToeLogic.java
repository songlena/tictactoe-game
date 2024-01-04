package tictactoe;

import cs15.prj.ticTacToeSupport.*;
import javafx.scene.paint.Color;

public class TicTacToeLogic implements CS15TicTacToeGame {
    private CS15TicTacToeBoard board;
    private CS15TicTacToeController controller;
    private Player playerO;
    private Player playerX;

    public TicTacToeLogic() {
        this.board = new CS15TicTacToeBoard();
        this.controller = new CS15TicTacToeController();

        this.playerO = new Player("O", this.board, this.controller);
        this.playerX = new Player("X", this.board, this.controller);

        this.controller.setControllerMessage("Select a square to start playing!");
        this.controller.addPlayer(this.playerO);
        this.controller.addPlayer(this.playerX);
    }
    public void invalidSquareChosen(int row, int col) {
        this.controller.setControllerMessage("Square chosen has already been taken! Try again.");
        CS15TicTacToeSquare square = this.board.squareAt(row, col);
        square.flashColor(Color.RED);
    }
    public void noWinner() {
        this.controller.setControllerMessage("It's a tie!");
    }

    public void playerWins() {
        Player player = this.controller.getWinningPlayer();
        this.controller.setControllerMessage("Player " + player.getID() + " wins!");
        this.board.highlightWinningSquares(Color.GREEN);
    }

    public void restartGame() {
        this.controller.playAgain();
        this.controller.setControllerMessage("Select a square to start playing!");
        this.board.clearHighlights();
        this.board.clearSymbols();
    }
}
