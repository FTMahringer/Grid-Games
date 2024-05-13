# Cell-Template

*I know its nothing much, but thats just a empty cell, you need to implement everything else yourself.*
```
public class Cell {
    public Cell(int x, int y, boolean isBomb) {
        this.setPrefWidth(50);
        this.setPrefHeight(50);
    }
}
```
#

**Used for Minesweeper**
```
public class Cell extends ACellButton {
    private final boolean isBomb;
    private boolean isFlagged;
    private boolean isOpen;
    private int bombsAround;

    public Cell(int x, int y, boolean isBomb) {
        super(x, y);
        this.isBomb = isBomb;
        this.isFlagged = false;
        this.isOpen = false;

        this.setPrefWidth(50);
        this.setPrefHeight(50);
    }

    public boolean isBomb() {
        return isBomb;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public int getBombsAround() {
        return bombsAround;
    }

    public void setBombsAround(int bombsAround) {
        this.bombsAround = bombsAround;
        //this.setText(String.valueOf(bombsAround));
    }

    public void toggleFlag() {
        isFlagged = !isFlagged;
        if (isFlagged) {
            //this.setTextMessage("F");
            this.setColor(Color.RED);
        } else {
            //this.setTextMessage(String.valueOf(bombsAround));
            this.setColor(Color.GRAY);
        }
    }
}
```
