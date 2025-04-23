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

public class Main {

    private static Game game;

    public static void main(String[] args) {
        int gridSize = 3;  // You can randomize this if needed
        game = new Game(gridSize);

        int agentRow = getRandomPosition(gridSize);
        int agentCol = getRandomPosition(gridSize);

        while (game.getGrid().getRows().get(agentRow).getCells().get(agentCol).getLeft() == CellComponents.WALL ||
               (agentRow == 0 && agentCol == 0)) {
            agentRow = getRandomPosition(gridSize);
            agentCol = getRandomPosition(gridSize);
        }

        Player player = new Player(
                game.getGrid().getRows().get(agentRow),
                game.getGrid().getRows().get(agentRow).getCells().get(agentCol)
        );


        displayGrid(player);}


    private static void displayGrid(Player player) {
        System.out.println("Current Grid State:");
        ArrayList<Row> rows = game.getGrid().getRows();
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < rows.get(i).getCells().size(); j++) {
                if (i == 0 && j == 0) {
                    System.out.print("E ");
                } else if (i == rows.indexOf(player.getCurrentRow()) &&
                           j == rows.get(i).getCells().indexOf(player.getCurrentCell())) {
                    System.out.print("A ");
                } else {
                    System.out.print("S ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int getRandomPosition(int gridSize) {
        Random rand = new Random();
        return rand.nextInt(gridSize);
    }

}