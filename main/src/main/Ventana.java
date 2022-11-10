package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel ;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Ventana extends JFrame {
    private PanelPrincipal dp;

    Ventana() {
        this.setLayout(new BorderLayout());
        dp = new PanelPrincipal();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//activar cierre en la X 
        this.add(dp,BorderLayout.CENTER);
        this.setSize(1000, 800); //se pueden pasar como parámetros del constructor
        this.setVisible(true);  //para que se abra y sea visible 
        setLocationRelativeTo(null);
    }
    
}
class PanelPrincipal extends JPanel{
    public PanelPrincipal(){
        this.setBackground(Color.blue);
    }
    public void paint (Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(0,0,250,400); //Rectangulo y dimensiones
    } 
}
