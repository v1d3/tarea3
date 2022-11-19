package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

class Deposito1000 {

    private ArrayList<Moneda> al;
    private Moneda m;
    private int x, y;

    public Deposito1000(int x, int y) {
        this.x = x + 610;
        this.y = y + 620;
        al = new ArrayList<Moneda>();
    }

    public void paint(Graphics g) {
        for (int i = al.size() - 1; i >= 0; i--) {
            Moneda aux = al.get(i);
            aux.paint(g);

        }
    }

    public void addMoneda(Moneda m) {
        if (m != null) {
            al.add(m);
        }
        for (int i = 0; i < al.size(); i++) {
            Moneda aux = al.get(i);
            aux.setXY(x+23*i,y);
        }
    }

    public Moneda getMoneda() {
        Moneda moneda;

        if (al.size() > 0) {
            moneda = al.remove(0);
            return moneda;
        } else {
            return null;
        }
    }

}
