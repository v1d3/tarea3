package main;

import java.awt.Color;
import java.awt.Graphics;

abstract class Bebida {

    private int serie;
    private int x, y;
    protected Color colorBebida, colorSerie;

    public Bebida(int numSerie) {
        this.serie = numSerie;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber();

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void paint(Graphics g) {
          g.setColor(colorBebida);
          g.fillRoundRect(x, y, 35, 58, 20, 20);
          g.setColor(colorSerie);
          String nserie = String.valueOf(serie);
          g.drawString(nserie, x+4, y+13);
    }
}

class CocaCola extends Bebida {

    public CocaCola(int serie) {
        super(serie);
        
        colorBebida = Color.red;
        colorSerie = Color.white;
    }

    public String beber() {
        return "CocaCola";
    }
    
}

class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
        colorBebida = Color.green;
        colorSerie = Color.black;
    }

    public String beber() {
        return "Sprite";
    }
}

class Fanta extends Bebida {

    public Fanta(int serie) {
        super(serie);
        colorBebida = Color.orange;
        colorSerie = Color.black;
    }

    public String beber() {
        return "Fanta";
    }
}
