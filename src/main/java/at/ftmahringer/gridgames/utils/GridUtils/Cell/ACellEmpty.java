package at.ftmahringer.gridgames.utils.GridUtils.Cell;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class ACellEmpty extends Group implements ICell {
    private final int x;
    private final int y;
    private int value;
    private final Rectangle rect;

    public ACellEmpty(int x, int y) {
        this.x = x;
        this.y = y;
        this.value = 0;
        rect = new Rectangle(50, 50);
        rect.setFill(Color.GRAY);
        rect.setStroke(Color.BLACK);

        getChildren().add(rect);
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
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    public void setRectColor(Color color) {
        rect.setFill(color);
    }

    protected Object getRectColor() {
        return rect.getFill();
    }
}
