package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class Expendedor {

    private Deposito Dep;
    private Deposito Moneda;
    private ArrayList<Moneda> DepositoMonedas; //Para generar el vuelto
    public int x, y;
    public boolean a = false;
    public JButton j1;

    public Expendedor(int numBebidas) {
        
        DepositoMonedas = new ArrayList();
        Dep = new Deposito();
        for (int i = 0; i < numBebidas; i++) {
            if (i < 16) {
                Dep.addBebida(new Fanta(100 + i));
            } else if (i > 15 && i < 32) {
                Dep.addBebida(new Sprite(200 + i));
            } else if (i > 30) {
                Dep.addBebida(new CocaCola(300 + i));
            }
        }
    }

    public void paintBebidastoExpendedor(Graphics g) {
            Dep.paint(g);
    }

    public void ComprarBebida() {
        Dep.getBebida();
    }

    public void paint(Graphics g) {
        
        g.setColor(Color.red);
        g.fillRect(50, 50, 500, 660); //Rectangulo y dimensiones   ******************
        g.setColor(Color.gray);
        g.fillRect(80, 80, 440, 550); //Rectangulo y dimensiones
        g.setColor(Color.BLACK);
        g.fillRect(90, 90, 420, 530);
        g.setColor(Color.LIGHT_GRAY);     //Rectangulo donde se situara el dinero***********************
        g.fillRect(620, 550, 300, 150);

    }
}
