package com.example.sansvoirbot.chess.players;

public abstract class Player {

    protected boolean human;
    private final boolean whiteSide;

    public Player(boolean whiteSide) {
        this.whiteSide = whiteSide;
    }

    public boolean isHuman() {
        return human;
    }

    public boolean isWhiteSide() {
        return whiteSide;
    }


}
