package tictactoe;

import cs15.prj.ticTacToeSupport.CS15TicTacToeBoard;
import cs15.prj.ticTacToeSupport.CS15TicTacToeController;
import cs15.prj.ticTacToeSupport.CS15TicTacToePlayer;
import cs15.prj.ticTacToeSupport.CS15TicTacToeSquare;

public class Player implements CS15TicTacToePlayer {

    private String playerID;
    private CS15TicTacToeBoard board;
    private CS15TicTacToeController controller;

    public Player(String id, CS15TicTacToeBoard board, CS15TicTacToeController controller) {
        this.playerID = id;
        this.board = board;
        this.controller = controller;
    }

    public void selectSquare(int row, int col) {
        CS15TicTacToeSquare square = this.board.squareAt(row, col);
        square.markSquare(this.playerID);
        this.controller.setControllerMessage("Player " + this.playerID + " finished their turn!");
        this.controller.finishedTurn();
    }
    public String getID(){
        return this.playerID;
    }
}
