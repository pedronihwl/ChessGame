package chess;

import boardgame.Board;
import boardgame.Position;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] m = new ChessPiece[board.getLinhas()][board.getColunas()];
        for(int i=0;i<board.getLinhas();i++){
            for(int j=0;j<board.getColunas();j++){
                m[i][j] = (ChessPiece) board.piece(i,j); // Retorna a matriz pieces na posição i e j
            }
        }
        return m;
    }
    private void initialSetup(){
        board.placePiece(new Rook(board,Color.WHITE),new Position(2,1));
        board.placePiece(new King(board,Color.BLACK),new Position(2,1));
        board.placePiece(new King(board,Color.BLACK),new Position(9,4));
    }
}