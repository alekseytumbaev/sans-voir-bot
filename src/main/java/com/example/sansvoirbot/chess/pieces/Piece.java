package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.Spot;

public abstract class  Piece {

    protected String name;
    private boolean killed = false;
    private final boolean white;
    private Spot currentSpot;

    public Piece(boolean white, Spot currentSpot) {
        this.white = white;
        this.currentSpot = currentSpot;
    }

    public boolean isKilled() {
        return killed;
    }

    public boolean isWhite() {
        return white;
    }

    public Spot getCurrentSpot() {
        return currentSpot;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public void setCurrentSpot(Spot currentSpot) {
        this.currentSpot = currentSpot;
    }
}
