package boardgame;

import chess.ChessPiece;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	// retorna uma peca do tabuleiro
	public Piece pieces(int row, int column) {
		return pieces[row][column];
	}
	
	// retorna uma posicao da peca do tabuleiro
	public Piece pieces(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	// colocar uma peca x na posicao x
	public void placePiece(ChessPiece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
}