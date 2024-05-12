package at.ftmahringer.gridgames.Minesweeper;

import javafx.application.Application;
import javafx.scene.Scene;

public class Starter extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Controller gameController;
    @Override
    public void start(javafx.stage.Stage primaryStage) {
        primaryStage.setTitle("Tic Tac Toe");
        gameController = new Controller(10, 10, 10);
        primaryStage.setScene(new Scene(gameController));
        primaryStage.show();
    }
}
