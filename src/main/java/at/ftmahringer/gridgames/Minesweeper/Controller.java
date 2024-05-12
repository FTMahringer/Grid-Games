package at.ftmahringer.gridgames.Minesweeper;

import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.List;

public class Controller extends Parent {
    static Grid grid;
    static List<Cell> openCells;
    static List<Cell> flaggedCells;

    public Controller(int width, int height, int bombsPercent) {
        startGame(width, height, bombsPercent);
    }

    public static void gameOver() {
        endGame(WonState.LOSS);
    }

    private void startGame(int width, int height, int bombsPercent) {
        grid = new Grid(width, height, bombsPercent);
        openCells = grid.getOpenCells();
        this.getChildren().add(grid);
        grid.setGap(5);

        for (int i = 0; i < grid.cells.length; i++) {
            for (int j = 0; j < grid.cells[i].length; j++) {
                Cell cell = grid.cells[i][j];
                cell.setOnMouseClicked(e -> {
                    clickedCell(e, cell);
                });
            }
        }
    }

    private static void endGame(WonState state) {

        if (state == WonState.WON) {
            for (Cell cell : openCells) {
                if (cell.isBomb()) {
                    cell.setColor(Color.GREEN);
                }
            }
            System.out.println("You won!");
        } else {
            for (int i = 0; i < grid.cells.length; i++) {
                for (int j = 0; j < grid.cells[i].length; j++) {
                    Cell cell = grid.cells[i][j];
                    if (cell.isBomb()) {
                        cell.setColor(Color.YELLOW);
                    }
                }
            }
            System.out.println("Game Over");
        }

    }

    private void clickedCell(MouseEvent e, Cell cell) {

        if (e.getButton() == javafx.scene.input.MouseButton.SECONDARY) {
            cell.toggleFlag();
            return;
        }

        if (cell.isFlagged()) {
            return;
        }
        if (cell.isOpen()) {
            grid.openAroundOpenCell(cell);
            return;
        }

        if (e.getButton() == javafx.scene.input.MouseButton.PRIMARY) {
            if (cell.isBomb()) {
                endGame(WonState.LOSS);
            } else {
                grid.openCell(cell);
            }
        }
        checkWin();
    }

    private void checkWin() {
        int bombs = grid.getBombsAmount();
        openCells = grid.getOpenCells();

        if (openCells.size() == (grid.cells.length * grid.cells[0].length) - bombs) {
            System.out.println("You won!");
            endGame(WonState.WON);
        }
    }
}

enum WonState {
    WON, LOSS
}


