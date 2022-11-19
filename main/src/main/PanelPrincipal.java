package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

class PanelPrincipal extends JPanel {

    
    public Expendedor exp;
    private Comprador com;
    public Botones bo;
    
    public PanelPrincipal() {
        
        exp = new Expendedor(48); //<------- Cantidad de Bebidas
        bo = new Botones(exp);
        this.setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        exp.paint(g); //Expendedor
        exp.paintBebidastoExpendedor(g);
        

        g.setColor(Color.white);

        g.fillRect(600, 30, 190, 215);// precio bebidas

        g.setColor(Color.black);
        g.setFont(new Font("Cooper Black", Font.PLAIN, 18));
        g.drawString("PRECIOS", 660, 60);// letra de precios 

        g.setFont(new Font("Serif", Font.BOLD, 14));// precios de  bebidas 
        g.drawString("Coca Cola   $1000", 660, 100);
        g.drawString("Sprite   $1000", 660, 160);
        g.drawString("Fanta   $1000", 660, 220);

        g.setFont(new Font("Lucida Fax", Font.BOLD, 18));
        g.drawString("Tipo de moneda de pago", 650, 270);
        g.fillRect(940, 550, 250, 150);//vuelto

        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.setColor(Color.red);
        g.fillRoundRect(620, 70, 27, 48, 20, 20);

        g.setColor(Color.green);
        g.fillRoundRect(620, 130, 27, 48, 20, 20);

        g.setColor(Color.orange);
        g.fillRoundRect(620, 190, 27, 48, 20, 20);

        g.setColor(Color.gray);
        g.fillRect(940, 530, 250, 20);// vuelto

        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.setColor(Color.white);
        g.drawString("$$$$$$$$$$  VUELTO  $$$$$$$$$$", 950, 545); // letra de vuelto
        g.drawString("xxx", 622, 85);
        g.setColor(Color.black);
        g.drawString("$$$$$  Deposito de Monedas  $$$$$", 625, 545);
         
        g.drawString("xxx", 622, 145);// numero de serie de bebidad de precios 
        g.drawString("xxx", 622, 205);

    }
    public Botones getBoton() {
        return bo;
    }

    public void addBotonestoPanel(PanelPrincipal pp) {
        pp.add(getBoton().Rb1);
        pp.add(getBoton().Rb2);
        pp.add(getBoton().Rb3);
        pp.add(getBoton().R);
        pp.add(getBoton().R1);
        
        pp.add(getBoton().Jc1);
        pp.add(getBoton().Jc2);
        pp.add(getBoton().Jc3);
        pp.add(getBoton().Jc4);
    }

    public void addButtonsCoordinate() {
        getBoton().R.setBounds(820, 110, 130, 50); //Boton de Compra
        getBoton().R1.setBounds(420, 650, 130, 50);
        getBoton().Rb1.setBounds(340, 650, 80, 50); //Fanta ************
        getBoton().Rb2.setBounds(265, 650, 75, 50); //Sprite ***********
        getBoton().Rb3.setBounds(180, 650, 85, 50); //Coca ***************

        getBoton().Jc1.setBounds(600, 300, 80, 50); //100
        getBoton().Jc2.setBounds(690, 300, 80, 50); //500
        getBoton().Jc3.setBounds(780, 300, 80, 50); //1000
        getBoton().Jc4.setBounds(870, 300, 80, 50); //1500 

    }

}
