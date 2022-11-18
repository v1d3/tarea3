
package main;

import java.awt.Color;

public class CocaCola extends Bebida{

     public CocaCola(int serie) {
        super(serie);

        colorBebida = Color.red;
        colorSerie = Color.white;
    }

    public String beber() {
        return "CocaCola";
    }
    
}
