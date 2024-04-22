package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
<<<<<<< HEAD
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
=======
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8){
			throw new ChessException("Erro instantianting ChessPosition. Valid values are from a1 to h8");
>>>>>>> 28d8d8444fbda283be04f7546ca168148d8336e7
		}
		this.column = column;
		this.row = row;
	}
<<<<<<< HEAD

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
=======
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 -row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
>>>>>>> 28d8d8444fbda283be04f7546ca168148d8336e7
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD
=======


>>>>>>> 28d8d8444fbda283be04f7546ca168148d8336e7
}
