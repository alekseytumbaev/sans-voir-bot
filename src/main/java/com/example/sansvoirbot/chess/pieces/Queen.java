package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.Spot;

public class Queen extends Piece {
    public Queen(boolean white, Spot currentSpot) {
        super(white, currentSpot);
        this.name = "Q";
    }
}
