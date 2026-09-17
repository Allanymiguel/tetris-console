package controller;

import java.util.concurrent.TimeUnit;

import model.Shapes;
import model.TetrisBoard;

public class Game {

    private TetrisBoard board;
    private Shapes shapes;

    private int currentPieceId;
    private int currentRow;
    private int currentCol;

    private boolean gameOver;

    public Game() {
    }

    public void start() {

        System.out.println("The game starts now!\n\n");

        render();

        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        while (!isGameOver()) {
            spawnPiece();

            while(!isPiecePlaced()) {

            }
        }
        
        System.out.println("\n\n\nThanks for playing!");
    }

    public boolean isPiecePlaced() {
        int[][] grid = board.getGrid();
        for(int  i = currentCol; i <= grid[currentRow].length; i++) {
            if(grid[currentRow + 1][i] != 1)
                return true;
        }

        return false;
    }

    private void spawnPiece() {
        board.putPiece(currentPieceId, currentRow, currentCol);
        while()
    }

    public void moveDown() {
    }

    public void moveLeft() {
    }

    public void moveRight() {
    }

    public void rotate() {
    }

    public boolean isGameOver() {
        return gameOver;
    }

    private void render() {
        System.out.println(board.getGrid());
    }

}
