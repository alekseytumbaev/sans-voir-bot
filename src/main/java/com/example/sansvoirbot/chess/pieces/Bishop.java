package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.Spot;

public class Bishop extends Piece {
    public Bishop(boolean white, Spot currentSpot) {
        super(white, currentSpot);
        this.name = "B";
    }
}
