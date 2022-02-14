package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
		//se nao atribuir nada para essa position  por padrao java joga valor nulo
	}

	protected Board getBoard() {
		return board;
	}
}
