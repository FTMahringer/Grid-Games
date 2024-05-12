package at.ftmahringer.gridgames.TicTacToe.Symbols;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class TTTCircle extends Group {

    public TTTCircle() {
        Circle circle = new Circle(25, 25, 25);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.TRANSPARENT);

        this.getChildren().add(circle);
    }
}
