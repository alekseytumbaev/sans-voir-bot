package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public class Knight extends  Piece {

    public Knight(boolean white) {
        super(white, PieceTypes.KNIGHT);
    }

    @Override
    public boolean canMove(Board board, Spot spot) {
        if (!this.generalMoveValidation(board,spot))
            return false;

        return true;
    }
}