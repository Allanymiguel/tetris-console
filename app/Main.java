package app;


import model.TetrisBoard;

public class Main {
    public static void main(String[] args) {
        TetrisBoard tb = new TetrisBoard();

        tb.putPiece(6);
        tb.printBoard();

    }
}