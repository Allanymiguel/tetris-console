package model;

import java.util.Map;

public class TetrisBoard {

    Shapes s = new Shapes();
    Map<Integer, int[][]> shapes = s.getMap();

    private static final int ROWS = 20;
    private static final int COLUMNS = 10;
    private int[][] grid = new int[ROWS][COLUMNS];



    public void putPiece(int idPiece) {
        int[][] piece = s.getPiece(idPiece);
        if(piece == null) {
            System.out.println("Piece does not exist.");
            return;
        }

        int height = piece.length;
        int width = piece[0].length;
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if(i < height) {
                    grid[i][j] = piece
                }
            }
        }

    }


    public void reset() {
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLUMNS; j++) {
                this.grid[i][j] = 0;
            }
        }
    }

    public void printBoard() {
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLUMNS; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    
}
