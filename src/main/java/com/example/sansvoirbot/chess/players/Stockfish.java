package com.example.sansvoirbot.chess.players;

public class Stockfish extends Player {
    public Stockfish(boolean whiteSide) {
        super(whiteSide);
        this.human = false;
    }
}
