module at.ftmahringer.gridgames {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.ftmahringer.gridgames to javafx.fxml;
    exports at.ftmahringer.gridgames;

    opens at.ftmahringer.gridgames.utils to javafx.fxml;
    exports at.ftmahringer.gridgames.utils;

    opens at.ftmahringer.gridgames.utils.GridUtils to javafx.fxml;
    exports at.ftmahringer.gridgames.utils.GridUtils;

    opens at.ftmahringer.gridgames.utils.PlayerUtils to javafx.fxml;
    exports at.ftmahringer.gridgames.utils.PlayerUtils;



    opens at.ftmahringer.gridgames.TicTacToe to javafx.fxml;
    exports at.ftmahringer.gridgames.TicTacToe;
    opens at.ftmahringer.gridgames.Minesweeper to javafx.fxml;
    exports at.ftmahringer.gridgames.Minesweeper;
    opens at.ftmahringer.gridgames.utils.GridUtils.Cell to javafx.fxml;
    exports at.ftmahringer.gridgames.utils.GridUtils.Cell;
    opens at.ftmahringer.gridgames.Chess to javafx.fxml;
    exports at.ftmahringer.gridgames.Chess;
    opens at.ftmahringer.gridgames.Chess.Grid to javafx.fxml;
    exports at.ftmahringer.gridgames.Chess.Grid;
    opens at.ftmahringer.gridgames.Chess.Pieces to javafx.fxml;
    exports at.ftmahringer.gridgames.Chess.Pieces;
    exports at.ftmahringer.gridgames.Chess.Pieces.Types;
    opens at.ftmahringer.gridgames.Chess.Pieces.Types to javafx.fxml;


}