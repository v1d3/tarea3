
package main;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class Expendedor {

    private Deposito Dep;
    private Deposito Moneda;
    private ArrayList<Moneda> DepositoMonedas; //Para generar el vuelto
    private int numBebidas;
    public int x;
    public int y;

    public Expendedor(int n) {
        DepositoMonedas = new ArrayList();
        Dep = new Deposito();
        
        numBebidas = n;
    }
    public void paintBebidastoExpendedor(Graphics g){
        for(int i = 0; i < numBebidas; i ++){
            Dep.addBebida(new Fanta(100 + i));
        } 
        for ( int i = 0; i < numBebidas; i ++){
            Dep.addBebida(new Sprite(200 + i));
        }
        for ( int i = 0; i < numBebidas; i ++) {
            Dep.addBebida(new CocaCola(300 + i));
        }
        Dep.paint(g);
        
    }
    public void paint(Graphics g){
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
