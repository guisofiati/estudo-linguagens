package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}
	
	// posicao 0, 4 vai ser e8
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	// convertar uma posicao na matriz para posicao no xadrez
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	@Override
	public String toString() {
		// forcar a converter para string (a1, g5, c7...)
		return "" + column + row;
	}
}