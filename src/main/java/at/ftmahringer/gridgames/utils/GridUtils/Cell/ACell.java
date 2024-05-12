package at.ftmahringer.gridgames.utils.GridUtils.Cell;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class ACell extends Group implements ICell {
    private final int x;
    private final int y;
    private int value;
    private final Rectangle rect;
    private final Text text;

    public ACell(int x, int y) {
        this.x = x;
        this.y = y;
        this.value = 0;
        rect = new Rectangle(50, 50);
        rect.setArcWidth(10);
        rect.setArcHeight(10);
        rect.setFill(Color.GRAY);
        rect.setStroke(Color.BLACK);

        text = new Text(25, 35, String.valueOf(value));
        text.setFont(Font.font("Arial", 24));
        text.setFill(Color.WHITE);

        getChildren().addAll(rect, text);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
        // Update the text node with the new value
        text.setText(String.valueOf(value));
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setRectColor(Color color) {
        rect.setFill(color);
    }

    protected Object getRectColor() {
        return rect.getFill();
    }
}
