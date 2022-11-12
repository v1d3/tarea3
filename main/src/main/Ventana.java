package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Ventana extends JFrame {
    private PanelPrincipal dp;
    private PanelesPerifericos PP;
    Ventana() {
        this.setLayout(new BorderLayout());
        dp = new PanelPrincipal();
        PP = new PanelesPerifericos();
        dp.setLayout(null);
        
        PP.getBoton().ButtonGroup();
        PP.getBoton().Rb1.setBounds(250, 650, 80, 80); //Fanta
        PP.getBoton().Rb2.setBounds(170, 650, 80, 80); //Sprite
        PP.getBoton().Rb3.setBounds(100, 650, 80, 80); //Coca
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//activar cierre en la X 
        this.add(dp);
        PP.addBotonestoPanel(dp);
        this.setSize(1000, 800); //se pueden pasar como parámetros del constructor
        this.setVisible(true);  //para que se abra y sea visible 
        setLocationRelativeTo(null);
    }

}

class PanelPrincipal extends JPanel {

    public PanelPrincipal() {
        this.setBackground(Color.blue);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(0, 0, 500, 800); //Rectangulo y dimensiones
    }
}

class PanelesPerifericos extends JPanel {
    Botones bo;
    public PanelesPerifericos() {
        bo = new Botones();
    }
    public Botones getBoton(){
        return bo;
    }
    public void addBotonestoPanel(PanelPrincipal pp){
        pp.add(getBoton().Rb1);
        pp.add(getBoton().Rb2);
        pp.add(getBoton().Rb3);

    }
}

class Botones extends JButton {

    JRadioButton Rb1;
    JRadioButton Rb2;
    JRadioButton Rb3;
    ButtonGroup Bg1;

    public Botones() {
        Rb1 = new JRadioButton("Fanta");
        Rb2 = new JRadioButton("Sprite");
        Rb3 = new JRadioButton("Coca");
    }

    public void ButtonGroup() {
        Bg1 = new ButtonGroup();
        Bg1.add(Rb1);
        Bg1.add(Rb2);
        Bg1.add(Rb3);
    }
}
    
