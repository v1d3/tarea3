package main;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class Botones extends JButton implements ActionListener {

    JRadioButton Rb1, Rb2, Rb3;
    JButton R;
    ButtonGroup Bg1;
    JCheckBox Jc1, Jc2, Jc3, Jc4;
    public int a, b, c;
    public Expendedor ex;

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
        R.addActionListener(this);
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
    @Override
    public void actionPerformed(ActionEvent e) {
        if (Rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "haz seleccionado la Fanta");
            repaint();
        } else if (Rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Haz seleccionado la Sprite");
            repaint();
        } else if (Rb3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Haz seleccionado la Coca Cola");
        } else if (!(Rb1.isSelected() && Rb2.isSelected() && Rb3.isSelected())) {   //En caso de no haber elegido ningun tipo de Bebida
            JOptionPane.showMessageDialog(this, "No has seleccionado ninguna Bebida");
            repaint();
        }
    }
}
