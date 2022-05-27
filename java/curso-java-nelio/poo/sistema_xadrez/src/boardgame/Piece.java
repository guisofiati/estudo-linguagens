package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	// Uma peca nova nao vai ter posicao inicialmente, pois ainda nao foi colocada no tabuleiro
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
}