package main;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class Botones extends JButton {

    public JRadioButton Rb1,Rb2,Rb3;
    public JButton R;
    public ButtonGroup Bg1;
    public JCheckBox Jc1,Jc2,Jc3,Jc4;

    public Botones() {  //Creacion de botones (Instancias)
        //Botones para La seleccion de Bebida
        Rb1 = new JRadioButton("Fanta");
        Rb2 = new JRadioButton("Sprite");
        Rb3 = new JRadioButton("Coca Cola");
        R = new JButton("InsertarMoneda");
        //Botones para el Dinero
        Jc1 = new JCheckBox("100");
        Jc2 = new JCheckBox("500");
        Jc3 = new JCheckBox("1000");
        Jc4 = new JCheckBox("1500");

    }

    public void ButtonGroup() { //Adicion de botones a grupo
        Bg1 = new ButtonGroup();
        Bg1.add(Rb1);
        Bg1.add(Rb2);
        Bg1.add(Rb3);
    }

    public void ActivateActionListener() {  //Activar accion de listener del Boton Comprar
        R.addActionListener(actionListener);
        
    }
//JOptionPane.    <----   es una funcion que habre cuadros de dialogo, usarlo en caso de dinero insuficiente o no marcar casillas
    public void addBotonestoPanel(PanelPrincipal pp) {
        pp.add(Rb1);
        pp.add(Rb2);
        pp.add(Rb3);
        pp.add(R);
        
        
        pp.add(Jc1);
        pp.add(Jc2);
        pp.add(Jc3);
        pp.add(Jc4);
    }

    public void addButtonsCoordinate() {
        R.setBounds(820, 110, 100, 50); //Boton de Compra
       
        Rb1.setBounds(340, 650, 80, 50); //Fanta ************
        Rb2.setBounds(265, 650, 75, 50); //Sprite ***********
        Rb3.setBounds(185, 650, 85, 50); //Coca ***************

        Jc1.setBounds(600, 300, 80, 50); //100
        Jc2.setBounds(690, 300, 80, 50); //500
        Jc3.setBounds(780, 300, 80, 50); //1000
        Jc4.setBounds(870, 300, 80, 50); //1500 

    }
}
