package at.ftmahringer.gridgames.TicTacToe;

import javafx.application.Application;
import javafx.scene.Scene;

public class TTTStarter extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    TTTGameController tttGameController;
    @Override
    public void start(javafx.stage.Stage primaryStage) {
        primaryStage.setTitle("Tic Tac Toe");
        tttGameController = new TTTGameController();
        primaryStage.setScene(new Scene(tttGameController));
        primaryStage.show();
    }
}
