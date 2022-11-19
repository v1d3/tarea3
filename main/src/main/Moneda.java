package main;

import java.awt.Color;
import java.awt.Graphics;

abstract class Moneda {

    private int serie,x,y;
    public static final int tam = 22;
    protected int numSerie;
    protected Color colorMoneda;

    public Moneda(int serie){
        this.serie=serie;
        this.x=x;
        this.y=y;
               
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor(); // la clase es abstracta por eso

    public void paint(Graphics g) {
        g.setColor(colorMoneda);
        g.fillOval(x, y, tam, tam);
        g.setColor(Color.black);
        String serie = String.valueOf(numSerie);////////////////////////////
        g.drawString(serie, x + 1, y + 15);
    }
}

class Moneda100 extends Moneda {

    public Moneda100(int serie) {
        super(serie);
        colorMoneda = Color.yellow;
    }

    public int getValor() {
        return 100;
    }
}

class Moneda500 extends Moneda {

    public Moneda500(int serie) {

        super(serie);
        colorMoneda = Color.orange;
    }

    public int getValor() {
        return 500;
    }
}

class Moneda1000 extends Moneda {

    public Moneda1000(int serie) {
        super(serie);
        colorMoneda = Color.pink;
    }

    public int getValor() {
        return 1000;
    }
}

class Moneda1500 extends Moneda {

    public Moneda1500(int serie) {
        super(serie);
        colorMoneda = Color.red;

    }

    public int getValor() {
        return 1500;
    }
}
