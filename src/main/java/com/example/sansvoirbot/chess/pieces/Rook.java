package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public class Rook extends Piece {
    public Rook(boolean white, Spot currentSpot) {
        super(white, currentSpot);
        this.type = PieceTypes.ROOK;
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        return false;
    }
}
