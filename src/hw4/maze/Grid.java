package hw4.maze;

import java.util.ArrayList;

public class Grid {

	private ArrayList<Row> rows;
	
	/** Creates a grid given an ArrayList of rows
	 * 
	 * @param rows		list of Row objects
	 */
	public Grid(ArrayList<Row> rows) {
		this.rows = rows;
	}

	/** Returns the list of rows
	 * 
	 * @return			list of rows
	 */
	public ArrayList<Row> getRows() {
		return rows;
	}

	/** Sets the list of rows with the given rows parameter
	 * 
	 * @param rows		new list of rows to be assigned into this set of rows
	 */
	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}

	/** toString representing the grid in String format
	 * 
	 * @return 	String representing the grid and each indicated row
	 */
	@Override
    public String toString() {
        return "Grid [rows=" + rows + "]";
    }
}
