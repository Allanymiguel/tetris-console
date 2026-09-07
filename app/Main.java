package app;

import java.util.Map;

import model.Shapes;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();

        Map map = s.getShapes();
        s.printShape(map, 1);
    }
}