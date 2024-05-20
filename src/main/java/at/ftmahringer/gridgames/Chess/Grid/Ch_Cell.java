package at.ftmahringer.gridgames.Chess.Grid;

import at.ftmahringer.gridgames.Chess.Pieces.BasePiece;
import at.ftmahringer.gridgames.utils.GridUtils.Cell.ACellEmpty;
import javafx.scene.paint.Color;

public class Ch_Cell extends ACellEmpty {

    private boolean isWhite;
    private BasePiece piece;

    public Ch_Cell(int x, int y) {
        super(x, y);
    }

    public void setWhite(boolean isWhite) {
        if (isWhite) {
            setRectColor(Color.WHITE);
        } else {
            setRectColor(Color.BLACK);
        }
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setPiece(BasePiece piece) {
        this.piece = piece;
    }

    public BasePiece getPiece() {
        return piece;
    }
}
