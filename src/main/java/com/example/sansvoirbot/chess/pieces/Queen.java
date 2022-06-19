package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public class Queen extends Piece {
    public Queen(boolean white) {
        super(white, PieceTypes.QUEEN);
    }

    @Override
    public boolean canMove(Board board, Spot spot) {
        if (!this.generalMoveValidation(board,spot))
            return false;

        return false;
    }
}
