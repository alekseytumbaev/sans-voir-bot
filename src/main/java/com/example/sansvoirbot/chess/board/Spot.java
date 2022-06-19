package com.example.sansvoirbot.chess.board;

import com.example.sansvoirbot.chess.pieces.Piece;

public class Spot {
    private final SpotCoordinates coordinates;
    private Piece piece;

    Spot(SpotCoordinates coordinates) {
        this.coordinates = coordinates;
        this.piece = null;
    }

    public SpotCoordinates getCoordinates() {
        return coordinates;
    }

    public Piece getPiece() {
        return piece;
    }

    void setPiece(Piece piece) {
        this.piece = piece;
    }
}
