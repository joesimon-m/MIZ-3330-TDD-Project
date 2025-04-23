package hw4;

import hw4.game.Game;
import hw4.maze.Cell;
import hw4.maze.CellComponents;
import hw4.maze.Row;
import hw4.player.Movement;
import hw4.player.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * Simulates the maze program.
 */
public class Main {

    private static Game game;

    public static void main(String[] args) {
    	// initialize game with grid size which can be changed
        int gridSize = 3;
        game = new Game(gridSize);
        //choose random starting position for agent
        int agentRow = getRandomPosition(gridSize);
        int agentCol = getRandomPosition(gridSize);
        //ensure starting cell isn't exit or blocked by wall
        while (game.getGrid().getRows().get(agentRow).getCells().get(agentCol).getLeft() == CellComponents.WALL ||
               (agentRow == 0 && agentCol == 0)) {
            agentRow = getRandomPosition(gridSize);
            agentCol = getRandomPosition(gridSize);
        }
        //create agent at chosen starting position
        Player player = new Player(
                game.getGrid().getRows().get(agentRow),
                game.getGrid().getRows().get(agentRow).getCells().get(agentCol)
        );

       
        boolean hasEscaped = false;
        
        
        try (Scanner scanner = new Scanner(System.in)){ 
        	//display initial grid
        	displayGrid(player);
        	//loop until agent exits the maze
        	while (!hasEscaped) {
                System.out.println("Enter a move: (UP, DOWN, LEFT, RIGHT): ");
                String move = scanner.nextLine().toUpperCase();
                //make sure user input is valid
                if (!isValidMove(move)) {
                    System.out.println("Invalid move. Please enter UP, DOWN, LEFT, or RIGHT.");
                    continue;
                }
                
                Movement movement = Movement.valueOf(move);
                Cell currentCell = player.getCurrentCell();

                //get current row and column
                int currentRowIndex = game.getGrid().getRows().indexOf(player.getCurrentRow());
                int currentColIndex = player.getCurrentRow().getCells().indexOf(currentCell);
                //check if player is on exit cell and trying to move into exit
                boolean isOnExitCell = (currentRowIndex == 0 && currentColIndex == 0);
                boolean isMovingIntoExit = (movement == Movement.LEFT && currentCell.getLeft() == CellComponents.EXIT);
                //escapes if player moves left off exit
                if (isOnExitCell && isMovingIntoExit) {
                    hasEscaped = true;
                    System.out.println("Agent has exited the maze.");
                    break;
                }
                //attempt to move player in given direction
                boolean moved = game.play(movement, player);
                if (!moved) {
                    System.out.println("Move blocked by wall or invalid direction.");
                }
                //display grid after move	
                displayGrid(player);
        }
        }
    }
    /**
     * Displays the grid at every instance.
     * @param player used to display current position of player
     */
    private static void displayGrid(Player player) {
        System.out.println("Current Grid:");
        ArrayList<Row> rows = game.getGrid().getRows();
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < rows.get(i).getCells().size(); j++) {
                if (i == 0 && j == 0) {
                    System.out.print("E "); //denotes exit
                } else if (i == rows.indexOf(player.getCurrentRow()) &&
                           j == rows.get(i).getCells().indexOf(player.getCurrentCell())) {
                    System.out.print("A "); //denotes agent position
                } else {
                    System.out.print("S "); //denotes space
                }
            }
            System.out.println();
        }
        System.out.println();
    }
  /**
   * Used to generate a random starting position for the agent
   * @param gridSize used to make sure position is within the grid
   * @return returns the position within the grid
   */
    private static int getRandomPosition(int gridSize) {
        Random rand = new Random();
        return rand.nextInt(gridSize);
    }
    /**
     * checks if the user's input move is one of the valid directions:
     * @param move the move entered by the user
     * @return true if move is valid, false if not
     */
    private static boolean isValidMove(String move) {
        return move.equals("UP") || move.equals("DOWN") || move.equals("LEFT") || move.equals("RIGHT");
    }
}