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

        spawnPiece();
    }

    private void spawnPiece() {
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
