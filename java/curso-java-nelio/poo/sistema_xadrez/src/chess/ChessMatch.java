package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	// quem sabe o tamanho do tabuleiro e a partida de xadrez
	public ChessMatch() {
		board = new Board(8, 8);
	}

	// matriz de pecas de xadrez correspondentes a partida
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				// Board so conhece obj do tipo Piece e nao ChessPiece, entao e necessario
				// um downcasting, ja que e uma estrutura em camadas
				mat[i][j] = (ChessPiece) board.pieces(i, j);
			}
		}
		
		return mat;
	}
}