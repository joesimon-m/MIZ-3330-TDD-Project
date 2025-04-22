package hw4.maze;

import java.util.ArrayList;

public class Cell {

	private CellComponents left;
	private CellComponents right;
	private CellComponents up;
	private CellComponents down;
	
	//CellComponents exit, CellComponents aperture, CellComponents wall, CellComponents aperture2
	public Cell(CellComponents left, CellComponents right, CellComponents up, CellComponents down) {
		this.left = (left != null) ? left : CellComponents.WALL;
        this.right = (right != null) ? right : CellComponents.WALL;
        this.up = (up != null) ? up : CellComponents.WALL;
        this.down = (down != null) ? down : CellComponents.WALL;
		
	}

	public CellComponents getRight() {
		return right;
	}

	public CellComponents getLeft() {
		return left;
	}

	public CellComponents getDown() {
		return down;
	}

	public CellComponents getUp() {
		return up;
	}

	public void setUp(CellComponents up) {
		this.up = up;
	}

	public void setDown(CellComponents down) {
		this.down = down;
	}

	public void setLeft(CellComponents left) {
		this.left = left;
	}

	public void setRight(CellComponents right) {
		this.right = right;
	}

}
