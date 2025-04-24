package hw4.maze;

import java.util.ArrayList;

public class Cell {

	private CellComponents up;
	private CellComponents down;
	private CellComponents left;
	private CellComponents right;
	
	/** Creates a Cell composed of CellComponents on each side of the cell.
	 * 
	 * @param up		CellComponent for the cell on top
	 * @param down		CellComponent for the cell on bottom
	 * @param left		CellComponent for the cell on the left
	 * @param right		CellComponent for the cell on the right
	 */
	public Cell(CellComponents left, CellComponents right, CellComponents up, CellComponents down) {
		this.up = (up != null) ? up : CellComponents.WALL;
        this.down = (down != null) ? down : CellComponents.WALL;
        this.left = (left != null) ? left : CellComponents.WALL;
        this.right = (right != null) ? right : CellComponents.WALL;
		
	}

	/** Returns the CellComponent on the right
	 * 
	 * @return		right CellComponent
	 */
	public CellComponents getRight() {
		return right;
	}

	/** Returns the CellComponent on the left
	 * 
	 * @return		left CellComponent
	 */
	public CellComponents getLeft() {
		return left;
	}

	/**	Returns the CellComponent on the bottom
	 * 
	 * @return		down Cellcomponent
	 */
	public CellComponents getDown() {
		return down;
	}

	/** Returns the upper CellComponent
	 * 
	 * @return		up CellComponent
	 */
	public CellComponents getUp() {
		return up;
	}

	/**	Sets this up CellComponent with the given up parameter. Wall is defaulted if the given
	 * parameter is null.
	 * 
	 * @param up	new up CellComponent to be assigned to this CellComponent
	 */
	public void setUp(CellComponents up) {
		this.up = (up != null) ? up : CellComponents.WALL;
	}

	/**	Sets this down CellComponent with the given down parameter. Wall is defaulted if the given
	 * parameter is null.
	 * 
	 * @param down	new DOWN CellComponent to be assigned to this CellComponent
	 */
	public void setDown(CellComponents down) {
		this.down = (down != null) ? down : CellComponents.WALL;
	}

	/** Sets this left CellComponent with the given left parameter. Wall is defaulted if the given
	 * parameter is null.
	 * 
	 * @param left	new left CellComponent to be assigned to this CellComponent
	 */
	public void setLeft(CellComponents left) {
		this.left = (left != null) ? left : CellComponents.WALL;
	}

	/** Sets this right CellComponent with the given right parameter. Wall is defaulted if the given
	 * parameter is null.
	 * 
	 * @param right	new right CellComponent to be assigned to this CellComponent
	 */
	public void setRight(CellComponents right) {
		this.right = (right != null) ? right : CellComponents.WALL;
	}

	/** Generates a new toString when this Cell is called, representing each CellComponent in 
	 * String format
	 * 
	 * @return	String representing each cell and it's CellComponent
	 */
	@Override
    public String toString() {
        return "Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]";
    }
}
