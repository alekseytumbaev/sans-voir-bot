package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public abstract class  Piece {

    protected PieceTypes type;
    private boolean killed = false;
    private final boolean white;
    private Spot currentSpot;

    public Piece(boolean white, Spot currentSpot) {
        this.white = white;
        this.currentSpot = currentSpot;
    }

    public abstract boolean canMove(Board board, int x, int y);

    public boolean isKilled() {
        return killed;
    }

    public boolean isWhite() {
        return white;
    }

    public Spot getCurrentSpot() {
        return currentSpot;
    }

    public PieceTypes getType() {
        return type;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public void setCurrentSpot(Spot currentSpot) {
        this.currentSpot = currentSpot;
    }
}
