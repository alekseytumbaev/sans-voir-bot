package com.example.sansvoirbot.chess.board;

import com.example.sansvoirbot.chess.pieces.*;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final Spot[][] spots = new Spot[8][8];
    private List<Piece> whitePieces;
    private List<Piece> blackPieces;

    public Spot[][] getSpots() {
        return spots;
    }

    public List<Piece> getWhitePieces() {
        return whitePieces;
    }

    public List<Piece> getBlackPieces() {
        return blackPieces;
    }


    private Board() {
        SpotCoordinates[] spotCoordinates = SpotCoordinates.values();
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                spots[i][j] = new Spot(spotCoordinates[i*8+j]);
    }

    /**
     * Board with zero size of blackPieces and whitePieces list
     *
     * @return {@link Board}
     */
    public static Board newEmptyBoard() {
        Board board = new Board();

        board.blackPieces = new ArrayList<>();
        board.whitePieces = new ArrayList<>();

        return board;
    }

    /**
     * Board with regular arrangement of pieces
     *
     * @return {@link Board}
     */
    public static Board newDefaultBoard() {
        Board board = newEmptyBoard();

        board.blackPieces = new ArrayList<>(16);
        board.whitePieces = new ArrayList<>(16);

        //white
        board.putNewPieceOnBoard(board.spots[0][0], new Rook(true));
        board.putNewPieceOnBoard(board.spots[0][1], new Knight(true));
        board.putNewPieceOnBoard(board.spots[0][2], new Bishop(true));
        board.putNewPieceOnBoard(board.spots[0][3], new Queen(true));
        board.putNewPieceOnBoard(board.spots[0][4], new King(true));
        board.putNewPieceOnBoard(board.spots[0][5], new Rook(true));
        board.putNewPieceOnBoard(board.spots[0][6], new Knight(true));
        board.putNewPieceOnBoard(board.spots[0][7], new Bishop(true));

        //black
        board.putNewPieceOnBoard(board.spots[7][0], new Rook(false));
        board.putNewPieceOnBoard(board.spots[7][1], new Knight(false));
        board.putNewPieceOnBoard(board.spots[7][2], new Bishop(false));
        board.putNewPieceOnBoard(board.spots[7][3], new Queen(false));
        board.putNewPieceOnBoard(board.spots[7][4], new King(false));
        board.putNewPieceOnBoard(board.spots[7][5], new Rook(false));
        board.putNewPieceOnBoard(board.spots[7][6], new Knight(false));
        board.putNewPieceOnBoard(board.spots[7][7], new Bishop(false));

        //pawns
        for (int i = 0; i < 8; i++) {
            board.putNewPieceOnBoard(board.spots[1][i], new Pawn(true));
            board.putNewPieceOnBoard(board.spots[6][i], new Pawn(false));
        }

        return board;
    }

    public boolean putNewPieceOnBoard(Spot spotOnThisBoard, Piece pieceThatNotOnThisBoardYet) {

        //check if piece is on the board already
        if (pieceThatNotOnThisBoardYet.getCurrentSpot() != null)
            return false;

        if (!this.spotBelongsToBoard(spotOnThisBoard))
            return false;

        spotOnThisBoard.setPiece(pieceThatNotOnThisBoardYet);
        pieceThatNotOnThisBoardYet.setCurrentSpot(spotOnThisBoard);
        if (pieceThatNotOnThisBoardYet.isWhite())
            this.whitePieces.add(pieceThatNotOnThisBoardYet);
        else
            this.blackPieces.add(pieceThatNotOnThisBoardYet);

        return true;
    }

    public boolean spotBelongsToBoard(Spot spot) {
        if (spot == null)
            return false;

        boolean spotBelongsToBoard = false;
        for (int i = 0; i < 8 && !spotBelongsToBoard; i++) {
            for (int j = 0; j < 8 && !spotBelongsToBoard; j++) {
                spotBelongsToBoard = this.spots[i][j] == spot;
            }
        }
        return spotBelongsToBoard;
    }
}
