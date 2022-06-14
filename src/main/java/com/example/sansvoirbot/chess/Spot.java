package com.example.sansvoirbot.chess;

import com.example.sansvoirbot.chess.pieces.Piece;

public class Spot {

    private final int x;
    private final int y;
    private final String name;
    private Piece piece;

    public Spot(int x, int y, String name, Piece piece) {
        this.x = x;
        this.y = y;
        this.name = name;
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
