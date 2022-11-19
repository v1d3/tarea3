
package main;

import java.awt.Color;

public class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
        colorBebida = Color.orange;
        colorSerie = Color.black;
    }

    public String beber() {
        return "Fanta";
    }
    
}
