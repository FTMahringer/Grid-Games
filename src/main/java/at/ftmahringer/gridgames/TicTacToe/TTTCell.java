package at.ftmahringer.gridgames.TicTacToe;

import at.ftmahringer.gridgames.utils.GridUtils.Cell.ACell;

public class TTTCell extends ACell {
    public TTTCell(int x, int y) {
        super(x, y);
    }

    public void setSymbol(TTTSymbol symbol) {
        if (this.getValue() == 0) {
            this.setValue(symbol.ordinal() + 1);
            this.getChildren().add(symbol.getSymbol());
        }
    }
}
