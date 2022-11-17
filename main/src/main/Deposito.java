package main;

import java.awt.Graphics;
import java.util.ArrayList;

public class Deposito {

    private ArrayList<Bebida> Bebidas;
    private int y;
    public Deposito() {
        Bebidas = new ArrayList();
    }

    public void addBebida(Bebida b) {
        Bebidas.add(b);
    }

    public Bebida getBebida() {
        if (Bebidas.size() <= 0) {
            return null;
        } else {
            Bebida b = Bebidas.remove(0);
            return b;
        }
    }

    public void paint(Graphics g) {
        int x = 100;
        y = 100;
        for (int i = 0; i < Bebidas.size(); i++) {   //For de cantidad de bebidas a pintar
            if ( i!=0 && i % 8 == 0) {
                x = 100;
                y =  y + 63;
            }
            Bebidas.get(i).setXY(x, y);
            Bebidas.get(i).paint(g);
            x +=50;
        }
    }
}
