package model;


public class TetrisBoard {

    Shapes s = new Shapes();

    private static final int ROWS = 20;
    private static final int COLUMNS = 10;
    private int[][] grid = new int[ROWS][COLUMNS];



    public void putPiece(int idPiece) {
        int[][] piece = s.getPiece(idPiece);
        if(piece == null) {
            System.out.println("Piece does not exist.");
            return;
        }

        int[][] gridTemp = grid;

        for (int i = 0; i < piece.length; i++) {
            for (int j = 0; j < piece[i].length; j++) {
                    if(gridTemp[i][j] != 0) return;
                    gridTemp[i][j] = piece[i][j];
            }
        }
        grid = gridTemp;
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
