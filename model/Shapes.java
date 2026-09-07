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
    
    Map<Integer, String[][]> map = new HashMap<>();
    

}
