package model;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private int wins;

    public Player(String name) {
        this.name = name;
        this.wins = 0;
    }

    public String getName() { return name; }
    public int getWins() { return wins; }
    public void addWin() { wins++; }
}
