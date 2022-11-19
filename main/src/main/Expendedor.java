package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Expendedor {

    private Deposito Dep;
    private DepMonedas dm;
    public int x;
    public int y;
    public Moneda m, m1, m2;///////////////////////////////////////////
    private Botones bo;

    public Expendedor(int numBebidas) {

        dm = new DepMonedas();
        Dep = new Deposito();
        m = new Moneda1000();//////////////////////////////////////////////////
        m1 = new Moneda1500();
        m2 = new Moneda500();
        for (int i = 0; i < numBebidas; i++) {
            if (i < 16) {
                Dep.addBebida(new Fanta(100 + i));
            } else if (i > 15 && i < 32) {
                Dep.addBebida(new Sprite(200 + i));
            } else if (i > 30) {
                Dep.addBebida(new CocaCola(300 + i));
            }
        }
        for (int i = 0; i < 40; i++) {
            if (i < 16) {
                dm.addMoneda(m);
            } else if (i > 15 && i < 32) {
                dm.addMoneda(m1);
            } else if( i > 30) {
                dm.addMoneda(m2);
            }
        }
    }

    public void paintBebidastoExpendedor(Graphics g) {
        Dep.paint(g);
        dm.paint(g);

    }

    public void ComprarBebida() {

    }

    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(50, 50, 500, 600); //Rectangulo y dimensiones 

        g.setColor(Color.gray);
        g.fillRect(80, 80, 440, 550); //Rectangulo y dimensiones

        g.setColor(Color.BLACK);
        g.fillRect(90, 90, 420, 530);

        g.setColor(Color.LIGHT_GRAY);     //Rectangulo donde se situara el dinero
        g.fillRect(600, 550, 300, 150);

        g.setColor(Color.white);
        g.fillRect(600, 530, 300, 20);

    }
}
