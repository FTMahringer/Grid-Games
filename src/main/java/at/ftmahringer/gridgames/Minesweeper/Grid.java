package at.ftmahringer.gridgames.Minesweeper;

import at.ftmahringer.gridgames.utils.GridUtils.IGrid;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Grid extends GridPane implements IGrid {
    Cell[][] cells;
    private final ArrayList<Cell> bombs = new ArrayList<>();
    private final ArrayList<Cell> openCells = new ArrayList<>();

    public Grid(int width, int height, int bombsPercent) {
        cells = new Cell[width][height];

        for (int x = 0; x < cells.length; x++) {
            for (int y = 0; y < cells[x].length; y++) {
                if (Math.random() * 100 < bombsPercent) {
                    cells[x][y] = new Cell(x, y, true);
                    bombs.add(cells[x][y]);
                } else {
                    cells[x][y] = new Cell(x, y, false);
                }
                cells[x][y].setColor(Color.GRAY);
                this.add(cells[x][y], x, y);
            }
        }
        for (Cell bomb : bombs) {
            addNeighbours(bomb);
        }
    }

    private void addNeighbours(Cell cell) {
        for (int x = cell.getX() - 1; x <= cell.getX() + 1; x++) {
            for (int y = cell.getY() - 1; y <= cell.getY() + 1; y++) {
                if (x >= 0 && x < cells.length && y >= 0 && y < cells[x].length) {
                    if (!cells[x][y].isBomb()) {
                        cells[x][y].setBombsAround(cells[x][y].getBombsAround() + 1);
                    }
                    cell.setBombsAround(0);
                }
            }
        }
    }

    @Override
    public Cell getCell(int x, int y) {
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

    public int getBombsAmount() {
        return bombs.size();
    }


    public void openAroundOpenCell(Cell cell) {
        // open only the cells around the opened cell
        int x = cell.getX();
        int y = cell.getY();

        System.out.println("Open around cell: " + x + " " + y);

        // only open the 8 cells around
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < cells.length && j >= 0 && j < cells[i].length) {
                    if (!cells[i][j].isOpen()) {
                        if (cells[i][j].isBomb()) {
                            if (cells[i][j].isFlagged()) {
                                cells[i][j].setColor(Color.RED);
                            } else {
                                cells[i][j].setColor(Color.BLACK);
                                Controller.gameOver();
                            }
                        } else {
                            if (cells[i][j].getBombsAround() == 0) {
                                cells[i][j].setColor(Color.LIGHTGRAY);
                                cells[i][j].setOpen(true);
                                openCells.add(cells[i][j]);
                                openCell(cells[i][j]);
                            } else  {
                                cells[i][j].setText(cells[i][j].getBombsAround() + "");
                                cells[i][j].setColor(Color.DARKGRAY);
                                cells[i][j].setOpen(true);
                                openCells.add(cells[i][j]);
                            }
                        }
                    }
                }
            }
        }
    }

    public void openCell(Cell cell) {
        // open all cells around
        int x = cell.getX();
        int y = cell.getY();

        if (cell.getBombsAround() == 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (i >= 0 && i < cells.length && j >= 0 && j < cells[i].length) {
                        if (!cells[i][j].isOpen()) {
                            if (cells[i][j].isBomb()) {
                                cells[i][j].setColor(Color.BLACK);
                            } else {
                                if (!cells[i][j].isFlagged()) {
                                    if (cells[i][j].getBombsAround() == 0) {
                                        cells[i][j].setColor(Color.LIGHTGRAY);
                                        cells[i][j].setOpen(true);
                                        openCells.add(cells[i][j]);
                                        openCell(cells[i][j]);
                                    } else {
                                        cells[i][j].setText(cells[i][j].getBombsAround() + "");
                                        cells[i][j].setColor(Color.DARKGRAY);
                                        cells[i][j].setOpen(true);
                                        openCells.add(cells[i][j]);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cells[x][y].setOpen(true);
            cell.setText(cell.getBombsAround() + "");
            cell.setColor(Color.DARKGRAY);
        }
    }

    public List<Cell> getOpenCells() {
        return openCells;
    }
}
