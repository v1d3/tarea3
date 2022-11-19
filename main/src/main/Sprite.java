
package main;

import java.awt.Color;


public class Sprite extends Bebida{

    public Sprite(int serie) {
        super(serie);
        colorBebida = Color.green;
        colorSerie = Color.black;
    }

    public String beber() {
        return "Sprite";
    }
    
}
