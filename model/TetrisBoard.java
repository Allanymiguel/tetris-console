package model;

public class TetrisBoard {

    private static final int ROWS = 20;
    private static final int COLUMNS = 10;
    private static int[][] grid = new int[ROWS][COLUMNS];

    public TetrisBoard() {
        init();
    }

    private static void init() {
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLUMNS; j++) {
                grid[i][j] = 0;
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
