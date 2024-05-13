package at.ftmahringer.gridgames.utils.GridUtils;

import at.ftmahringer.gridgames.utils.GridUtils.Cell.Cell;
import at.ftmahringer.gridgames.utils.GridUtils.Cell.ICell;
import javafx.scene.layout.GridPane;

public class GridField extends GridPane implements IGrid {
    private final Cell[][] cells;

    public GridField(int width, int height) {
        cells = new Cell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells[x][y] = new Cell(x, y);
                add(cells[x][y], x, y);
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
