package at.ftmahringer.gridgames.utils.GridUtils.Cell;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public abstract class ACellButton extends Button implements ICell {

    private final int x;
    private final int y;
    private int value;

    public ACellButton(int x, int y) {
        this.x = x;
        this.y = y;
        this.value = 0;
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
    }

    @Override
    public int getValue() {
        return value;
    }


    public void setTextMessage(String text) {
        this.setText(text);
    }

    public String getTextMessage() {
        return this.getText();
    }


    public void setColor(Color color) {
        this.setStyle("-fx-background-color: " + color.toString().replace("0x", "#") + ";");
    }
}
