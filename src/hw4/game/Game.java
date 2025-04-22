package hw4.game;

import java.util.ArrayList;
import java.util.Random;

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
			this.grid = createRandomGrid(i); // Creates a random grid of ixi size
		}

		/** Game constructor that sets the given grid parameter into this object's grid variable
		 * 
		 * @param grid
		 */
		public Game(Grid grid) {
			setGrid(grid);
		}

		/** Returns the grid object 
		 * 
		 * @return		grid object
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
			if((grid == null) || (movement == null) || (player == null)) {
				return false;
			} 
			
			int rowIndex = grid.getRows().indexOf(player.getCurrentRow());
			int colIndex = player.getCurrentRow().getCells().indexOf(player.getCurrentCell());
			CellComponents direction;
			
			if(movement == Movement.UP) {
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
			
			// updates the current row and cell
			Row row = grid.getRows().get(rowIndex);
			Cell cell = row.getCells().get(colIndex);
			player.setCurrentCell(cell);
			player.setCurrentRow(row);
			
			// checks to see if this cell has an aperture or not
			return (direction == CellComponents.APERTURE) ? true : false;
		}

		/** Sets the grid for this Game object to the given parameter grid
		 * 
		 * @param grid		grid to be assigned to this.grid
		 */
		public void setGrid(Grid grid) {
			this.grid = grid;
		}

		/**
		 * 
		 * @param size
		 * @return
		 */
		public Grid createRandomGrid(int size) {
			if((size < 3) || (size > 7)) return null;

		    ArrayList<Row> rows = new ArrayList<>();
		    Random rand = new Random();

		    // Creates each cell for each row
		    for(int i = 0; i < size; i++) {
		        ArrayList<Cell> cells = new ArrayList<>();
		        for(int j = 0; j < size; j++) {
		            CellComponents up = randomComponent(rand);
		            CellComponents down = randomComponent(rand);
		            CellComponents left = randomComponent(rand);
		            CellComponents right = randomComponent(rand);

		            // Making sure there is one opening (APERTURE) contained in each cell
		            if((up != CellComponents.APERTURE) && (down != CellComponents.APERTURE) && (left != CellComponents.APERTURE) && (right != CellComponents.APERTURE)) {
		                left = CellComponents.APERTURE; 
		            }

		            cells.add(new Cell(up, down, left, right));
		        }
		        rows.add(new Row(cells));
		    }

		    // Places an (EXIT) on the top-left cell
		    Cell exitCell = rows.get(0).getCells().get(0);
		    exitCell.setLeft(CellComponents.EXIT); 

		    return new Grid(rows);
		}

		/**
		 * 
		 * @param rand
		 * @return
		 */
		private CellComponents randomComponent(Random rand) {
		    int pick = rand.nextInt(2); // (WALL) or (APERTURE)
		    return (pick == 0) ? CellComponents.WALL : CellComponents.APERTURE;
		}
		
		/**
		 * 
		 */
		@Override
		public String toString() {
		    return "Game [grid=" + grid + "]";
		}

	}