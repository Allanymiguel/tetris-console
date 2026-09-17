package controller;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import model.Shapes;
import model.TetrisBoard;

public class Game {

    private TetrisBoard board;
    private Shapes shapes;

    private int currentPieceId;
    private int currentRow;
    private int currentCol;
    private int[][] currentPiece;

    private boolean gameOver;

    private Scanner scan = new Scanner(System.in);

    public Game() {
        this.board = new TetrisBoard();
        this.shapes = new Shapes();
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

            while(!spawnPiece() || !isPiecePlaced()) {

                String move = scan.nextLine();

                if(move.equals("w")) rotate();
                if(move.equals("s")) moveDown();
                if(move.equals("a")) moveLeft();
                if(move.equals("d")) moveRight();
                else continue;

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

    private boolean spawnPiece() {
        currentPiece = shapes.getPiece(currentPieceId);

        if(!board.putPiece(currentPieceId, currentRow, currentCol)) {
            gameOver = false;
            return false;
        }
        render();
        return true;
    }

    private boolean tryMove(int newRow, int newCol) {
        board.clearPiece(currentPiece, currentRow, currentCol);

        if(board.putPiece(currentPiece, newRow, newCol)) {
            currentRow = newRow;
            currentCol = newCol;
            render();
            return true;
        }

        board.putPiece(currentPiece, currentRow, currentCol);
        return false;
    }

    public void moveDown() {
        tryMove(currentRow + 1, currentCol);
    }

    public void moveLeft() {
        tryMove(currentRow, currentCol - 1);
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
