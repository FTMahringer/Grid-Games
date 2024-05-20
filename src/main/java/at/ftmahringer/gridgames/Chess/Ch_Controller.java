package at.ftmahringer.gridgames.Chess;

import at.ftmahringer.gridgames.Chess.Grid.Ch_Grid;
import javafx.scene.Parent;

public class Ch_Controller extends Parent {

    public Ch_Controller() {
        Ch_Grid grid = new Ch_Grid(8, 8);
        getChildren().add(grid);
    }
}
