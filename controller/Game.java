package controller;

import java.util.Random;
import java.util.Scanner;

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

    Random random = new Random();

    public Game() {
        this.board = new TetrisBoard();
        this.shapes = new Shapes();
    }

    public void start() {

        System.out.println("The game starts now!\n\n");

        sleep();
        render();
        sleep();

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
        currentPieceId = random.nextInt(1, 8);
        currentRow = 0;
        currentCol = 0;
        currentPiece = shapes.getPiece(currentPieceId);

        if(!board.putPiece(currentPiece, currentRow, currentCol)) {
            gameOver = true;
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
        tryMove(currentRow, currentCol + 1);
    }

    private int[][] rotateMatrix(int[][] piece) {
        int rows = piece.length;
        int cols = piece[0].length;

        int[][] rotated = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rotated[j][rows - 1 - i] = piece[i][j];
            }
        }

        return rotated;
    }

    public void rotate() {
        int[][] rotated = rotateMatrix(currentPiece);

        board.clearPiece(currentPiece, currentRow, currentCol);

        if(board.putPiece(rotated, currentRow, currentCol)) {
            currentPiece = rotated;
            render();
            return;
        }

        board.putPiece(currentPiece, currentRow, currentCol);
    }

    public boolean isGameOver() {
        return gameOver;
    }

    private void render() {
        board.printBoard();
        System.out.println();
    }

    private void sleep() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}
