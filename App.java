package tictactoe;

import cs15.prj.ticTacToeSupport.CS15TicTacToeBoard;
import cs15.prj.ticTacToeSupport.CS15TicTacToeController;
import cs15.prj.ticTacToeSupport.CS15TicTacToeFrame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        CS15TicTacToeFrame frame = new CS15TicTacToeFrame(stage);
        TicTacToeLogic game = new TicTacToeLogic();
        frame.addGame(game);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
