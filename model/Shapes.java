package model;

import java.util.HashMap;
import java.util.Map;

public class Shapes {

    private int fill = 1;
    private int empty = 0;

    // quadrado, barra, T, L_direito, L_esquedo, cobra_direita, cobra_esquerda
    
    private int[][] shape_1 = {
        {fill, fill},
        {fill, fill}
    };

    private int[][] shape_2 = {
        {fill, fill, fill, fill}
    };

    private int[][] shape_3 = {
        {fill, fill, fill},
        {empty, fill, empty}
    };
    
    private int[][] shape_4 = {
        {fill, empty},
        {fill, empty},
        {fill, empty},
        {fill, fill}
    };

    private int[][] shape_5 = {
        {empty, fill},
        {empty, fill},
        {empty, fill},
        {fill, fill}
    };

    private int[][] shape_6 = {
        {empty, fill, fill},
        {fill, fill, empty}
    };

    private int[][] shape_7 = {
        {fill, fill, empty},
        {empty, fill, fill}
    };
    
    Map<Integer, int[][]> shapes = new HashMap<>();

    public Shapes() {
        shapes.put(1, shape_1);
        shapes.put(2, shape_2);
        shapes.put(3, shape_3);
        shapes.put(4, shape_4);
        shapes.put(5, shape_5);
        shapes.put(6, shape_6);
        shapes.put(7, shape_7);
    }

    public Map<Integer, int[][]> getShapes() {
        return this.shapes;
    }

    public void printShape(Integer key) {
        int[][] s = this.shapes.get(key);
        for(int i = 0; i < s.length; i++) {
            for(int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + 0);
            }
            System.out.println();
        }
    }

    public int[][] getPiece(int idPiece) {
        if(idPiece < 0 || idPiece > shapes.size())
            return null;

        return shapes.get(idPiece);
    }

}
