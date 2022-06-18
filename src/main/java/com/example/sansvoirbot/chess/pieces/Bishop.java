package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public class Bishop extends Piece {
    public Bishop(boolean white, Spot currentSpot) {
        super(white, currentSpot);
        this.type = PieceTypes.BISHOP;
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        return false;
    }
}
