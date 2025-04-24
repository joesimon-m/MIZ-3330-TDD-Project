package hw4.player;

import hw4.maze.Cell;
import hw4.maze.Row;

public class Player {
	
	private Row currentRow;
	private Cell currentCell;

	/** Constructor for the Player class with a given row and cell
	 * 
	 * @param row		Row where the player starts
	 * @param cell		Cell where the player starts
	 */
	public Player(Row row, Cell cell) {
		setCurrentRow(row);
		setCurrentCell(cell);
	}

	/** Returns the current row of this Player
	 * 
	 * @return		Row variable of this Player
	 */
	public Row getCurrentRow() {
		return currentRow;
	}

	/** Returns the current cell of this Player
	 * 
	 * @return		Cell variable of this Player
	 */
	public Cell getCurrentCell() {
		return currentCell;
	}
	
	/** Sets this players Row with the given Row parameter
	 * 
	 * @param row	new Row position for the Player to be in
	 */
	public void setCurrentRow(Row row) {
		this.currentRow = row;
	}
	
	/** Sets this players Cell with the given cell parameter
	 * 	
	 * @param cell	new Cell position for the Player to be in
	 */
	public void setCurrentCell(Cell cell) {
		this.currentCell = cell;
	}
	
	/** toString representing where the player is located right now
	 * 
	 * @return String describing where the player is
	 * 
	 */
	@Override
	public String toString() {
	    return "Player [currentCell=" + currentCell + ", currentRow=" + currentRow + "]";
	}

}
