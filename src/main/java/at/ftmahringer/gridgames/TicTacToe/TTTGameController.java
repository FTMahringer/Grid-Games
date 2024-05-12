package at.ftmahringer.gridgames.TicTacToe;

import at.ftmahringer.gridgames.utils.PlayerUtils.Player;
import javafx.scene.Parent;

public class TTTGameController extends Parent {
    private Player currentPlayer;
    private TTTSymbol currentPlayerSymbol;

    private TTTGrid gridField;
    private Player[] players;
    private TTTSymbol[][] symbolGrid;

    public TTTGameController() {
        startGame();
    }

    private void startGame() {
        createPlayers();
        gridField = new TTTGrid(3, 3);
        this.getChildren().add(gridField);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                int finalX = x;
                int finalY = y;
                gridField.cells[x][y].setOnMouseClicked(event -> clickedCell(gridField.cells[finalX][finalY]));
            }
        }
        symbolGrid = new TTTSymbol[3][3];
    }

    private void createPlayers() {
        players = new Player[2];
        players[0] = new Player(0, TTTSymbol.CROSS, "Player 1");
        players[1] = new Player(1, TTTSymbol.CIRCLE, "Player 2");
        currentPlayer = players[0];
        currentPlayerSymbol = (TTTSymbol) currentPlayer.getType();
    }

    public void clickedCell(TTTCell tttCell) {
        tttCell.setSymbol(currentPlayerSymbol);
        symbolGrid[tttCell.getX()][tttCell.getY()] = currentPlayerSymbol;
        checkForWinner(tttCell);
        switchPlayer();
    }

    private void checkForWinner(TTTCell tttCell) {
        if (checkRow(tttCell) || checkColumn(tttCell) || checkDiagonal(tttCell)) {
            announceWinner(currentPlayer);
            resetGrid();
        }
    }

    private boolean checkRow(TTTCell tttCell) {
        int row = tttCell.getX();
        return symbolGrid[row][0] == currentPlayerSymbol &&
                symbolGrid[row][1] == currentPlayerSymbol &&
                symbolGrid[row][2] == currentPlayerSymbol;
    }

    private boolean checkColumn(TTTCell tttCell) {
        int col = tttCell.getY();
        return symbolGrid[0][col] == currentPlayerSymbol &&
                symbolGrid[1][col] == currentPlayerSymbol &&
                symbolGrid[2][col] == currentPlayerSymbol;
    }

    private boolean checkDiagonal(TTTCell tttCell) {
        int x = tttCell.getX();
        int y = tttCell.getY();
        return (x == y && symbolGrid[0][0] == currentPlayerSymbol &&
                symbolGrid[1][1] == currentPlayerSymbol &&
                symbolGrid[2][2] == currentPlayerSymbol) ||
                (x + y == 2 && symbolGrid[0][2] == currentPlayerSymbol &&
                        symbolGrid[1][1] == currentPlayerSymbol &&
                        symbolGrid[2][0] == currentPlayerSymbol);
    }

    private void announceWinner(Player winner) {
        winner.addScore(1);
        System.out.println("Winner: " + winner.getName());
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == players[0])? players[1] : players[0];
        currentPlayerSymbol = (TTTSymbol) currentPlayer.getType();
    }

    private void resetGrid() {
        startGame();
    }
}
