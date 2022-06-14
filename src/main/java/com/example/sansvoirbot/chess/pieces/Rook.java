package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.Spot;

public class Rook extends Piece {
    public Rook(boolean white, Spot currentSpot) {
        super(white, currentSpot);
        this.name = "R";
    }
}
