package com.example.sansvoirbot.chess;

import com.example.sansvoirbot.chess.pieces.Piece;
import com.example.sansvoirbot.chess.players.Player;

public class Move {
    private Player player;
    private Spot start;
    private Spot end;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private Piece piecePromotedInto;
    private boolean castling = false;
    private boolean regular = true;
    private boolean promotion = false;

    public Move(Player player, String move) {
        this.player = player;
    }


}
