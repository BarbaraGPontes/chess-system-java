package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
		// se nao atribuir nada para essa position por padrao java joga valor nulo
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	// metodo que faz gancho com a subclasse
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	// implementacao padrao concreta que depende de um metodo abstrato
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++){
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
