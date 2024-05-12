package at.ftmahringer.gridgames.utils.PlayerUtils;

import at.ftmahringer.gridgames.TicTacToe.TTTSymbol;

public class Player implements IPlayer {
    private int id;
    private String name;
    private Enum type;
    private int score;

    public Player(int id,Enum type,String name) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.score = 0;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void addScore(int score) {
        this.score += score;
    }

    @Override
    public void resetScore() {
        this.score = 0;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }
}
