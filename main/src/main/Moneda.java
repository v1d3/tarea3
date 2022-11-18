package main;

import java.awt.Graphics;
import java.awt.Color;

abstract class Moneda {

    private int x, y;
    private int serie;
    protected Color colorSerie;
    
    public abstract int getValor(); // la clase es abstracta por eso

    public Moneda() {

    }

    public Moneda getSerie() {
        return this;
    }

    public void setXY(int x, int y) {   //Poner coordenadas de Monedas
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) { //Dibujar Bebidas
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 50, 50);
        g.setColor(colorSerie);
        colorSerie = Color.BLACK;
        String nserie = String.valueOf(serie);
        g.drawString(nserie, x + 4, y + 13);
    }
}

class Moneda100 extends Moneda {

    public Moneda100() {
        super();
    }

    public int getValor() {
        return 100;
    }
}

class Moneda500 extends Moneda {

    public Moneda500() {
        super();
    }

    public int getValor() {
        return 500;
    }
}

class Moneda1000 extends Moneda {

    public Moneda1000() {
        super();
    }

    public int getValor() {
        return 1000;
    }
}

class Moneda1500 extends Moneda {

    public Moneda1500() {
        super();
    }

    public int getValor() {
        return 1500;
    }
}
