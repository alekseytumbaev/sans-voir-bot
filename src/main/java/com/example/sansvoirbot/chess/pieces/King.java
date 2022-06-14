package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.Spot;

public class King extends  Piece {
    public King(boolean white, Spot currentSpot) {
        super(white, currentSpot);
        this.name = "K";
    }
}
