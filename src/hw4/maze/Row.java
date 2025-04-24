package hw4.maze;

import java.util.ArrayList;

public class Row {

	private ArrayList<Cell> cells;
	
	/** Creates a Row with the given Cell ArrayList
	 * 
	 * @param cells		ArrayList of cell objects 
	 */
	public Row(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	/** Returns the Cell ArrayList 
	 * 
	 * @return			ArrayList of Cells
	 */
	public ArrayList<Cell> getCells() {
		return cells;
	}

	/** Sets this Cell ArrayList with the given cellList parameter
	 * 
	 * @param cellList	Cell ArrayList to be assigned in this variable cells
	 */
	public void setCells(ArrayList<Cell> cellList) {
		this.cells = cellList;
	}

	/** toString representing each row 
	 * 
	 * @return 	String representing each row and it's associated cells
	 */
	@Override
    public String toString() {
        return "Row [cells=" + cells + "]";
    }
}
