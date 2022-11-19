package main;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Bebida {

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

    public void setXY(int x, int y) {   //Poner coordenadas de Bebida
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g) { //Dibujar Bebidas
        g.setColor(colorBebida);
        g.fillRoundRect(x, y, 35, 58, 20, 20);
        g.setColor(colorSerie);
        String nserie = String.valueOf(serie);
        g.drawString(nserie, x + 4, y + 13);
    }
}
