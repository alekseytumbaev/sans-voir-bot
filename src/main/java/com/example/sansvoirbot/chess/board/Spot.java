package com.example.sansvoirbot.chess.board;

import com.example.sansvoirbot.chess.pieces.Piece;

public class Spot {

    private final int x;
    private final int y;
    public final String coordinatesName;
    private Piece piece;

    public Spot(int x, int y, String coordinatesName, Piece piece) {
        //if x and y are out of range
        if (x < 0 || x > 7 || y < 0 || y > 7)
            throw new ArrayIndexOutOfBoundsException("Invalid spot coordinates.");

        this.x = x;
        this.y = y;
        this.coordinatesName = coordinatesName;
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
