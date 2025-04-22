package hw4.maze;

import java.util.ArrayList;

public class Row {

	private ArrayList<Cell> cells;
	
	/**
	 * 
	 * @param cells
	 */
	public Row(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Cell> getCells() {
		return cells;
	}

	/**
	 * 
	 * @param cellList
	 */
	public void setCells(ArrayList<Cell> cellList) {
		this.cells = cellList;
	}

	/**
	 * 
	 */
	@Override
    public String toString() {
        return "Row [cells=" + cells + "]";
    }
}
