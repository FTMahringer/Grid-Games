package at.ftmahringer.gridgames.Chess.Grid;

import at.ftmahringer.gridgames.utils.GridUtils.Cell.ICell;
import at.ftmahringer.gridgames.utils.GridUtils.IGrid;
import javafx.scene.layout.GridPane;

public class Ch_Grid extends GridPane implements IGrid {
    Ch_Cell[][] cells;

    public Ch_Grid(int width, int height) {
        cells = new Ch_Cell[width][height];
        // Chess
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Ch_Cell cell = new Ch_Cell(x, y);
                cell.setWhite((x + y) % 2 == 0);
                cells[x][y] = cell;
                add(cell, x, y);
            }
        }
    }

    @Override
    public ICell getCell(int x, int y) {
        return cells[x][y];
    }

    @Override
    public void clearGrid() {
        for (int x = 0; x < cells.length; x++) {
            for (int y = 0; y < cells[x].length; y++) {
                cells[x][y].setValue(0);
            }
        }
    }

    @Override
    public void setGap(int i) {
        setHgap(i);
        setVgap(i);
    }
}
