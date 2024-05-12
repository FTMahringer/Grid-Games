package at.ftmahringer.gridgames.TicTacToe;

public class TTTCellEventHandler {
    private final TTTGameController gameController;

    public TTTCellEventHandler(TTTGameController gameController) {
        this.gameController = gameController;
    }

    public void handleMouseClicked(TTTCell cell) {
        gameController.clickedCell(cell);
    }
}
