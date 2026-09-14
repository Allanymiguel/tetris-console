package model;

import java.util.HashMap;
import java.util.Map;

public class Shapes {
    // quadrado, barra, T, L_direito, L_esquedo, cobra_direita, cobra_esquerda
    
    private int[][] shape_1 = {
        {1, 1},
        {1, 1}
    };

    private int[][] shape_2 = {
        {1, 1, 1, 1}
    };

    private int[][] shape_3 = {
        {1, 1, 1},
        {0, 1, 0}
    };
    
    private int[][] shape_4 = {
        {1},
        {1},
        {1},
        {1, 1}
    };

    private int[][] shape_5 = {
        {0, 1},
        {0, 1},
        {0, 1},
        {1, 1}
    };

    private int[][] shape_6 = {
        {0, 1, 1},
        {1, 1}
    };

    private int[][] shape_7 = {
        {1, 1, 0},
        {0, 1, 1}
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

    public void printShape(Map<Integer, int[][]> map, Integer key) {
        int[][] s = map.get(key);
        for(int i = 0; i < s.length; i++) {
            for(int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + 0);
            }
            System.out.println();
        }
    }

}
