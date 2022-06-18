package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public class Pawn extends Piece {

    public Pawn(boolean white, Spot currentSpot) {
        super(white, currentSpot);
        this.type = PieceTypes.PAWN;
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        return false;
    }

}
