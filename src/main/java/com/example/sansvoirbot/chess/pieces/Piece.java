package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public abstract class  Piece {

    private final PieceTypes type;
    private boolean killed = false;
    private final boolean white;
    private Spot currentSpot;

    public Piece(boolean white, PieceTypes type) {
        this.white = white;
        this.type = type;
        this.currentSpot = null;
    }

    public PieceTypes getType() {
        return type;
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


    public abstract boolean canMove(Board board, Spot spot);

    protected  boolean generalMoveValidation(Board board, Spot spot) {
        if (board == null || spot == null)
            return false;

        if (this.isKilled() || this.getCurrentSpot() == null) //piece is killed or not on a board
            return false;

        if (!board.spotBelongsToBoard(this.getCurrentSpot())) //piece's current spot doesn't belong to this board
            return false;

        if (!board.spotBelongsToBoard(spot)) //given spot doesn't belong to this board
            return false;

        //other piece is on given spot and this piece has the same color
        if (spot.getPiece() != null && spot.getPiece().isWhite() == this.isWhite())
            return false;

        return true;
    }
}
