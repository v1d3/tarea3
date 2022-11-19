package main;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


class Botones extends JButton implements ActionListener {

    public JButton Rb1, Rb2, Rb3;
    public JButton R, R1;
    public JButton Jc1, Jc2, Jc3, Jc4;
    public Expendedor ex;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public Botones(Expendedor ex) {  //Creacion de botones (Instancias)
        
        this.ex = ex;
        //Botones para La seleccion de Bebida
        Rb1 = new JButton("Fanta");
        Rb2 = new JButton("Sprite");
        Rb3 = new JButton("Coca Cola");
        R = new JButton("Insertar Moneda");
        R1 = new JButton("Rellenar");

        //Botones para el Dinero
        Jc1 = new JButton("100");
        Jc2 = new JButton("500");
        Jc3 = new JButton("1000");
        Jc4 = new JButton("1500");
    }

    public void ActivateActionListener() {  //Activar accion de listener del Boton Comprar
        R.addActionListener(this);
        R1.addActionListener(this);
        Rb1.addActionListener(this);
        Rb2.addActionListener(this);
        Rb3.addActionListener(this);

    }
//JOptionPane.       es una funcion que habre cuadros de dialogo, usarlo en caso de dinero insuficiente o no marcar casillas

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (Rb1 == source) { //Elige Fanta
            d = true;
        } else if (Rb2 == source) { //Elige Sprite
            c = true;
        } else if (Rb3 == source) { //Elige CocaCola
            b = true;
        } else if (R1 == source) {   //Rellenar
            a = true;
        } 
    }
    public void paint(Graphics g){
        if(a == true ){
            ex.paintBebidastoExpendedor(g);
        }
    }
}
