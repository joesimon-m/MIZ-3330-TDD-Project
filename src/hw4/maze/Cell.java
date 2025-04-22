package hw4.maze;

import java.util.ArrayList;

public class Cell {

	private CellComponents up;
	private CellComponents down;
	private CellComponents left;
	private CellComponents right;
	
	/**
	 * 
	 * @param up
	 * @param down
	 * @param left
	 * @param right
	 */
	public Cell(CellComponents left, CellComponents right, CellComponents up, CellComponents down) {
		this.up = (up != null) ? up : CellComponents.WALL;
        this.down = (down != null) ? down : CellComponents.WALL;
        this.left = (left != null) ? left : CellComponents.WALL;
        this.right = (right != null) ? right : CellComponents.WALL;
		
	}

	/**
	 * 
	 * @return
	 */
	public CellComponents getRight() {
		return right;
	}

	/**
	 * 
	 * @return
	 */
	public CellComponents getLeft() {
		return left;
	}

	/**
	 * 
	 * @return
	 */
	public CellComponents getDown() {
		return down;
	}

	/**
	 * 
	 * @return
	 */
	public CellComponents getUp() {
		return up;
	}

	/**
	 * 
	 * @param up
	 */
	public void setUp(CellComponents up) {
		this.up = (up != null) ? up : CellComponents.WALL;
	}

	/**
	 * 
	 * @param down
	 */
	public void setDown(CellComponents down) {
		this.down = (down != null) ? down : CellComponents.WALL;
	}

	/**
	 * 
	 * @param left
	 */
	public void setLeft(CellComponents left) {
		this.left = (left != null) ? left : CellComponents.WALL;
	}

	/**
	 * 
	 * @param right
	 */
	public void setRight(CellComponents right) {
		this.right = (right != null) ? right : CellComponents.WALL;
	}

	/**
	 * 
	 */
	@Override
    public String toString() {
        return "Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]";
    }
}
