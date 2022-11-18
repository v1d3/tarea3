package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Expendedor {

    private Deposito Dep;
    private Deposito Moneda;
    private ArrayList<Moneda> DepositoMonedas; //Para generar el vuelto
    public int x;
    public int y;
    public Moneda m;///////////////////////////////////////////
    
    

    public Expendedor(int numBebidas) {
        DepositoMonedas = new ArrayList();
        Dep = new Deposito();
        m= new Moneda100();//////////////////////////////////////////////////
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
        m.paint(g);///////////////////////////////////////////
      
    }

    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(50, 50, 500, 660); //Rectangulo y dimensiones 

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
