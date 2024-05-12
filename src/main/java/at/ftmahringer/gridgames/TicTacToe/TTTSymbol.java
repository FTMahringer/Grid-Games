package at.ftmahringer.gridgames.TicTacToe;

import at.ftmahringer.gridgames.TicTacToe.Symbols.TTTCircle;
import at.ftmahringer.gridgames.TicTacToe.Symbols.TTTCross;
import javafx.scene.Node;

public enum TTTSymbol {
    CROSS, CIRCLE, EMPTY;

    @Override
    public String toString() {
        return switch (this) {
            case CROSS -> "X";
            case CIRCLE -> "O";
            case EMPTY -> " ";
        };
    }


    public Node getSymbol() {
        return switch (this) {
            case CROSS -> new TTTCross();
            case CIRCLE -> new TTTCircle();
            case EMPTY -> null;
        };
    }
}
