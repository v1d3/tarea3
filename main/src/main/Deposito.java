package main;

import java.awt.Graphics;
import java.util.ArrayList;

public class Deposito {

    public ArrayList<Bebida> Bebidas;
    private int x;
    
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
        int y = 535;
        x = 100;
        for (int i = 0; i < Bebidas.size(); i++) {   //For de cantidad de bebidas a pintar
            if ( i!=0 && i % 8 == 0) {
                y = 535;
                x =  x + 60;
            }
            Bebidas.get(i).setXY(x, y);
            Bebidas.get(i).paint(g);
            y -=60;
        }
    }
}
