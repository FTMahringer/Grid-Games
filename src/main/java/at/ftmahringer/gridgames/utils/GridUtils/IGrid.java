package at.ftmahringer.gridgames.utils.GridUtils;

import at.ftmahringer.gridgames.utils.GridUtils.Cell.ICell;

public interface IGrid {
    ICell getCell(int x, int y);
    void clearGrid();

    void setGap(int i);
}
