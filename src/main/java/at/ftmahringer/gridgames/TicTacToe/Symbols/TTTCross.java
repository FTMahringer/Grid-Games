package at.ftmahringer.gridgames.TicTacToe.Symbols;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class TTTCross extends Group {
    public TTTCross() {
        Line line1 = new Line(0, 0, 50, 50);
        line1.setStroke(Color.BLACK);
        Line line2 = new Line(50, 0, 0, 50);
        line2.setStroke(Color.BLACK);

        this.getChildren().addAll(line1, line2);
    }
}
