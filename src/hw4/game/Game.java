package hw4.game;

	import hw4.maze.Grid;
	import hw4.player.Movement;
	import hw4.player.Player;

	public class Game {

		private Grid grid;

		public Game(int i) {
			if (i < 3 || i > 7) {
				this.grid = null;
			} else {
				this.grid = createRandomGrid(i); // Creates a random grid of ixi size
			}
		}

		public Game(Grid grid) {
			this.grid = grid;
		}

		public Grid getGrid() {
			// TODO Auto-generated method stub
			return this.grid;
		}

		public boolean play(Movement movement, Player player) {
			if (movement == null || player == null) {
				return false;
			} else {
				return false; // *****still has to be implemented*****
			}
		}

		public void setGrid(Grid grid) {
			this.grid = grid;
		}

		public Grid createRandomGrid(int i) {
			// TODO Auto-generated method stub
			return null;
		}

	}