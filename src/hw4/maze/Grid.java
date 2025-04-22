package hw4.maze;

import java.util.ArrayList;

public class Grid {

	private ArrayList<Row> rows;
	
	/**
	 * 
	 * @param rows
	 */
	public Grid(ArrayList<Row> rows) {
		this.rows = rows;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Row> getRows() {
		return rows;
	}

	/**
	 * 
	 * @param rows
	 */
	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}

	/**
	 * 
	 */
	@Override
    public String toString() {
        return "Grid [rows=" + rows + "]";
    }
}
