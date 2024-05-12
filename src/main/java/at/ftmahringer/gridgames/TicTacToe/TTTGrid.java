package at.ftmahringer.gridgames.TicTacToe;

import at.ftmahringer.gridgames.utils.GridUtils.Cell.ICell;
import at.ftmahringer.gridgames.utils.GridUtils.IGrid;
import javafx.scene.layout.GridPane;

public class TTTGrid extends GridPane implements IGrid {
    TTTCell[][] cells;

    public TTTGrid(int width, int height) {
        cells = new TTTCell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells[x][y] = new TTTCell(x, y);
                this.add(cells[x][y], x, y);
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
