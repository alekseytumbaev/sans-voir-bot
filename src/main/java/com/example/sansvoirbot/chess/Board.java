package com.example.sansvoirbot.chess;

import com.example.sansvoirbot.chess.pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Spot[][] spots = new Spot[8][8];
    public List<Piece> whitePieces;
    public List<Piece> blackPieces;

    public Board() {
        whitePieces = new ArrayList<>(16);
        blackPieces = new ArrayList<>(16);

        initializeEmptyBoard();

        //white
        putPieceOnBoard(new Rook(true,null),0,0);
        putPieceOnBoard(new Knight(true,null),0,1);
        putPieceOnBoard(new Bishop(true,null),0,2);
        putPieceOnBoard(new Queen(true,null),0,3);
        putPieceOnBoard(new King(true,null),0,4);
        putPieceOnBoard(new Rook(true,null),0,5);
        putPieceOnBoard(new Knight(true,null),0,6);
        putPieceOnBoard(new Bishop(true,null),0,7);

        //black
        putPieceOnBoard(new Rook(false,null),7,0);
        putPieceOnBoard(new Knight(false,null),7,1);
        putPieceOnBoard(new Bishop(false,null),7,2);
        putPieceOnBoard(new Queen(false,null),7,3);
        putPieceOnBoard(new King(false,null),7,4);
        putPieceOnBoard(new Rook(false,null),7,5);
        putPieceOnBoard(new Knight(false,null),7,6);
        putPieceOnBoard(new Bishop(false,null),7,7);

        //pawns
        for (int i = 0; i < 8; i++) {
            putPieceOnBoard(new Pawn(true,null),1, i);
            putPieceOnBoard(new Pawn(false,null),6, i);
        }
    }

    private void initializeEmptyBoard() {
        char c;
        for (int i = 0; i < 8; i++){
            c = 'a';
            for (int j = 0; j < 8; j++) {
                spots[i][j] = new Spot(i, j, Character.toString(c++) + (i+1), null);
            }
        }
    }

    private void putPieceOnBoard(Piece p, int x, int y) {
        spots[x][y].setPiece(p);
        p.setCurrentSpot(spots[x][y]);
        if (p.isWhite())
            whitePieces.add(p);
        else
            blackPieces.add(p);
    }
}
