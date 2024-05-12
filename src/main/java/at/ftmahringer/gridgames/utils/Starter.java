package at.ftmahringer.gridgames.utils;

import at.ftmahringer.gridgames.utils.GridUtils.GridField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Grid Games");


        Scene scene = new Scene(new GridField(5,5), 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
