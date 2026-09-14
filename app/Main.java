package app;

import java.util.Map;

import model.Shapes;
import model.TetrisBoard;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();

        Map map = s.getShapes();
        s.printShape(1);

        TetrisBoard tb = new TetrisBoard();
        tb.printBoard();
    }
}