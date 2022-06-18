package com.example.sansvoirbot.chess.pieces;

import com.example.sansvoirbot.chess.board.Board;
import com.example.sansvoirbot.chess.board.Spot;

public class Knight extends  Piece {

    public Knight(boolean white, Spot currentSpot) {
        super(white, currentSpot);
        this.type = PieceTypes.KNIGHT;
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        return false;
    }
}