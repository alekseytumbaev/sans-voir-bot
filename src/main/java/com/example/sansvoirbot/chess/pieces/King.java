package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public class King extends  Piece {
    public King(boolean white) {
        super(white, PieceTypes.KING);
    }

    @Override
    public boolean canMove(Board board, Spot spot) {
        if (!this.generalMoveValidation(board,spot))
            return false;

        return false;
    }
}
