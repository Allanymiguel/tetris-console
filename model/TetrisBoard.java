package model;


public class TetrisBoard {

    Shapes s = new Shapes();

    private static final int ROWS = 20;
    private static final int COLUMNS = 10;
    private int[][] grid = new int[ROWS][COLUMNS];



    private boolean canPlace(int[][] piece, int row, int col) {
        for (int i = 0; i < piece.length; i++) {
            for (int j = 0; j < piece[i].length; j++) {
                if (piece[i][j] == 0) continue;

                int targetRow = row + i;
                int targetCol = col + j;

                if (targetRow < 0 || targetRow >= ROWS || targetCol < 0 || targetCol >= COLUMNS)
                    return false;

                if (grid[targetRow][targetCol] != 0)
                    return false;
            }
        }

        return true;
    }

    public void putPiece(int idPiece) {
        int[][] piece = s.getPiece(idPiece);
        if(piece == null) {
            System.out.println("Piece does not exist.");
            return;
        }

        int[][] gridTemp = new int[ROWS][COLUMNS];

        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLUMNS; j++) {
                gridTemp[i][j] = grid[i][j];
            }
        }

        for (int i = 0; i < piece.length; i++) {
            for (int j = 0; j < piece[i].length; j++) {
                    if(piece[i][j] != 0 && gridTemp[i][j] != 0) 
                        return;
                    else if(piece[i][j] != 0)
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
