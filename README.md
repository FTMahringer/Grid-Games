
# Grid - Games "Framework"

#### An awesome "Framework" for easier grid-based games start.



## Lessons Learned

What did you learn while building this project? What challenges did you face and how did you overcome them?

- Practical application of abstract classes.
- Practical application of Interfaces.
- Practical application of multi-code use. **(Cells and Grid)**
# Code information

How to use and create your own grid-games.

**Grid:**
- Made it, so the grid is optimized and cells are generated using double for-loops, for easier "cell-finding".
- Grids can be easily managed and expanded.

**Cells:**
- Made it, so that new cell classes can be easily made with the interface ICell:
```
public interface ICell {
    int getX();
    int getY();
    void setValue(int value);
    int getValue();
}
```
- Or can be just extended from ACell, or ACellButton.
    - They are practically the same, the ACell, just extends from a Group and has a Rectangle and a Text as children.
    - The ACellButton just extends the Button class and each cell acts just as a Button 
        - *Has been made for Minesweeper*
        - But can be used for many other things.

## Tech Stack

**Used:** Java, JavaFX


## Authors

- [@ftmahringer](https://github.com/FTMahringer)

