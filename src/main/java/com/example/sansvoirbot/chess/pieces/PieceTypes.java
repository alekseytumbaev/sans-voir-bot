package com.example.sansvoirbot.chess.pieces;

public enum PieceTypes {
    ROOK("R"),KNIGHT("N"),BISHOP("B"),KING("K"),QUEEN("Q"),PAWN("");

    public final String name;

    PieceTypes(String name) {
        this.name = name;
    }
}
