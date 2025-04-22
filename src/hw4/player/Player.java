package hw4.player;

import hw4.maze.Cell;
import hw4.maze.Row;

public class Player {
	
	private Row currentRow;
	private Cell currentCell;

	public Player(Row row, Cell cell) {
		setCurrentRow(row);
		setCurrentCell(cell);
	}

	public Row getCurrentRow() {
		return currentRow;
	}

	public Cell getCurrentCell() {
		return currentCell;
	}
	
	public void setCurrentRow(Row row) {
		this.currentRow = row;
	}
	
	public void setCurrentCell(Cell cell) {
		this.currentCell = cell;
	}

}
