package model;

import java.util.HashMap;
import java.util.Map;

public class Shapes {
    // quadrado, barra, T, L_direito, L_esquedo, cobra_direita, cobra_esquerda
    
    private String[][] shape_1 = {
        {"A", "A"},
        {"A", "A"}
    };

    private String[][] shape_2 = {
        {"A", "A", "A", "A"}
    };

    private String[][] shape_3 = {
        {"A", "A", "A"},
        {"", "A", ""}
    };
    
    private String[][] shape_4 = {
        {"A"},
        {"A"},
        {"A"},
        {"A", "A"}
    };

    private String[][] shape_5 = {
        {"", "A"},
        {"", "A"},
        {"", "A"},
        {"A", "A"}
    };

    private String[][] shape_6 = {
        {"", "A", "A"},
        {"A", "A"}
    };

    private String[][] shape_7 = {
        {"A", "A", ""},
        {"", "A", "A"}
    };
    
    Map<Integer, String[][]> shapes = new HashMap<>();

    public Shapes() {
        shapes.put(1, shape_1);
        shapes.put(2, shape_2);
        shapes.put(3, shape_3);
        shapes.put(4, shape_4);
        shapes.put(5, shape_5);
        shapes.put(6, shape_6);
        shapes.put(7, shape_7);
    }

    public Map<Integer, String[][]> getShapes() {
        return this.shapes;
    }

    @Override
    public String toString() {
        return null;
    }

    public void printShape(Map<Integer, String[][]> map, Integer key) {
        String[][] s = map.get(key);
        for(int i = 0; i < s.length; i++) {
            for(int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + "");
            }
            System.out.println();
        }
    }

}
