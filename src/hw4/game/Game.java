package hw4.game;

import hw4.maze.Cell;
import hw4.maze.CellComponents;
import hw4.maze.Grid;
import hw4.maze.Row;
import hw4.player.Movement;
import hw4.player.Player;

	public class Game {

		private Grid grid;

		/** Creates a grid with the given i parameter, making sure that this variable is
		 * in between 3 and 7 (maximum bounds of the grid).
		 * 
		 * @param i		int variable representing grid size
		 */
		public Game(int i) {
			if(i < 3 || i > 7) {
				this.grid = null;
			} else {
				this.grid = createRandomGrid(i); // Creates a random grid of ixi size
			}
		}

		/**
		 * 
		 * @param grid
		 */
		public Game(Grid grid) {
			this.grid = grid;
		}

		/**
		 * 
		 * @return
		 */
		public Grid getGrid() {
			return this.grid;
		}

		/**
		 * 
		 * @param movement
		 * @param player
		 * @return
		 */
		public boolean play(Movement movement, Player player) {
			int rowIndex = grid.getRows().indexOf(player.getCurrentRow());
			int colIndex = player.getCurrentRow().getCells().indexOf(player.getCurrentCell());
			CellComponents direction;
			
			if((grid == null) || (movement == null) || (player == null)) {
				return false;
			} else if(movement == Movement.UP) {
				rowIndex--;
				direction = player.getCurrentCell().getUp();
			} else if(movement == Movement.DOWN) {
				rowIndex++;
				direction = player.getCurrentCell().getDown();
			} else if(movement == Movement.LEFT) {
				colIndex--;
				direction = player.getCurrentCell().getLeft();
			} else if(movement == Movement.RIGHT) {
				colIndex++;
				direction = player.getCurrentCell().getRight();
			} else {
				return false;
			}
			
			// checking to see if the row index and column index are outside the ixi square,
			// or if a wall was hit
			if((rowIndex < 0) || (rowIndex > grid.getRows().size()+1)) {
				return false;
			} 
			if((colIndex < 0) || (colIndex > grid.getRows().get(0).getCells().size()+1)) {
				return false;
			}
			if(direction == CellComponents.WALL) {
				return false; 
			}
			
			Row row = grid.getRows().get(rowIndex);
			Cell cell = row.getCells().get(colIndex);
			player.setCurrentCell(cell);
			player.setCurrentRow(row);
			
			// checks to see if this cell has aperture or not
			return (direction == CellComponents.APERTURE) ? true : false;
		}

		/**
		 * 
		 * @param grid
		 */
		public void setGrid(Grid grid) {
			this.grid = grid;
		}

		/**
		 * 
		 * @param i
		 * @return
		 */
		public Grid createRandomGrid(int i) {
			// TODO Auto-generated method stub
			return null;
		}

	}