package com.example.sansvoirbot.chess;

import com.example.sansvoirbot.chess.players.Player;

import java.util.List;

public class Game {

    private Player player1;
    private Player player2;
    private Board board;
    private Player currentTurn;
    private List<Move> movesPlayed;
    private String fen;

    Game(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;

        if (player1.isWhiteSide())
            this.currentTurn = player1;
        else
            this.currentTurn = player2;
    }
}
