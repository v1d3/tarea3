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
        Jc1.addActionListener(this);
        Jc2.addActionListener(this);
        Jc3.addActionListener(this);
        Jc4.addActionListener(this);

    }
//JOptionPane.       es una funcion que habre cuadros de dialogo, usarlo en caso de dinero insuficiente o no marcar casillas

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Rb1) { //Elige Fanta
            d = true;
        }
        if (e.getSource() == Rb2) { //Elige Sprite
            c = true;
        }
        if (e.getSource() == Rb3) { //Elige CocaCola
            b = true;
        }
        if (e.getSource() == R1) {   //Rellenar
            a = true;
            System.out.println("rellenar");
        }
        if (e.getSource() == R) {   //insertar
            System.out.println("insertar moneda");
        }
        if (e.getSource() == Jc1) {
            System.out.println("100");
        }
        if (e.getSource() == Jc2) {
            System.out.println("500");
        }
        if (e.getSource() == Jc3) {
            System.out.println("1000");
        }
        if (e.getSource() == Jc4) {
            System.out.println("1500");
        }
    }

    public void paint(Graphics g) {
        if (c == true) {
            ex.paintBebidastoExpendedor(g);
        }
    }
}
