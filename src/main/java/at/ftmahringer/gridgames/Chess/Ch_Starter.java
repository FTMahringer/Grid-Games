package at.ftmahringer.gridgames.Chess;

import javafx.application.Application;
import javafx.scene.Scene;

public class Ch_Starter extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    Ch_Controller chController;
    @Override
    public void start(javafx.stage.Stage primaryStage) {
        primaryStage.setTitle("Tic Tac Toe");
        chController = new Ch_Controller();
        primaryStage.setScene(new Scene(chController));
        primaryStage.show();
    }
}
