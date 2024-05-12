package at.ftmahringer.gridgames.utils.PlayerUtils;

public interface IPlayer {
    int getId();
    String getName();
    int getScore();
    void setScore(int score);
    void addScore(int score);
    void resetScore();
    void setName(String name);
    void setId(int id);
}
