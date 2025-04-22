package hw4.player;

import hw4.maze.Cell;
import hw4.maze.Row;

public class Player {
	
	private Row currentRow;
	private Cell currentCell;

	/**
	 * 
	 * @param row
	 * @param cell
	 */
	public Player(Row row, Cell cell) {
		setCurrentRow(row);
		setCurrentCell(cell);
	}

	/**
	 * 
	 * @return
	 */
	public Row getCurrentRow() {
		return currentRow;
	}

	/**
	 * 
	 * @return
	 */
	public Cell getCurrentCell() {
		return currentCell;
	}
	
	/**
	 * 
	 * @param row
	 */
	public void setCurrentRow(Row row) {
		this.currentRow = row;
	}
	
	/**
	 * 
	 * @param cell
	 */
	public void setCurrentCell(Cell cell) {
		this.currentCell = cell;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
	    return "Player [currentCell=" + currentCell + ", currentRow=" + currentRow + "]";
	}

}
