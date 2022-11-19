package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Expendedor {

    private Deposito Dep;
    public int x;
    public int y;
    private Deposito100 m100;
    private Deposito500 m500;
    private Deposito1000 m1000;
    private Deposito1500 m1500;

    public Expendedor(int numBebidas, int x, int y) {
        
        Dep = new Deposito();
        m100 = new Deposito100(this.x, this.y);
        m500 = new Deposito500(this.x, this.y);
        m1000 = new Deposito1000(this.x, this.y);
        m1500 = new Deposito1500(this.x, this.y);
        //Añadir Bebidas inicialmente
        for (int i = 0; i < numBebidas; i++) {
            if (i < 16) {
                Dep.addBebida(new Fanta(100 + i));
            } else if (i > 15 && i < 32) {
                Dep.addBebida(new Sprite(200 + i));
            } else if (i > 30) {
                Dep.addBebida(new CocaCola(300 + i));
            }
        }
        //Añadir Monedas
        for (int i = 0; i < 12; i++) {
            Moneda m = new Moneda100(100 + i);
            m100.addMoneda(m);
        }
        for (int i = 0; i < 12; i++) {
            Moneda m = new Moneda500(500 + i);
            m500.addMoneda(m);
        }
        for (int i = 0; i < 12; i++) {
            Moneda m = new Moneda1000(1000 + i);
            m1000.addMoneda(m);
        }
        for (int i = 0; i < 12; i++) {
            Moneda m = new Moneda1500(1500 + i);
            m1500.addMoneda(m);
        }

    }
    public void comprarBebida(Moneda mon){
        
    }

    public void paintBebidastoExpendedor(Graphics g) {
        Dep.paint(g);
        m100.paint(g);
        m500.paint(g);
        m1000.paint(g);
        m1500.paint(g);

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

        g.fillRect(50, 650, 130, 50);

        g.setColor(Color.LIGHT_GRAY);     //Rectangulo donde se situara el dinero
        g.fillRect(600, 550, 300, 150);

        g.setColor(Color.white);
        g.fillRect(600, 530, 300, 20);

    }
}
