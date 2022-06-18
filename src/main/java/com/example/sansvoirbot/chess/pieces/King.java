package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public class King extends  Piece {
    public King(boolean white, Spot currentSpot) {
        super(white, currentSpot);
        this.type = PieceTypes.KING;
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        return false;
    }
}
