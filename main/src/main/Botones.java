package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

class Botones extends JButton implements ActionListener {

    public JButton Rb1, Rb2, Rb3;
    public JButton R;
    public JButton Jc1, Jc2, Jc3, Jc4;

    public Botones() {  //Creacion de botones (Instancias)
        //Botones para La seleccion de Bebida
        Rb1 = new JButton("Fanta");
        Rb2 = new JButton("Sprite");
        Rb3 = new JButton("Coca Cola");
        R = new JButton("Insertar Moneda");
        //Botones para el Dinero
        Jc1 = new JButton("100");
        Jc2 = new JButton("500");
        Jc3 = new JButton("1000");
        Jc4 = new JButton("1500");
    }

    public void ActivateActionListener() {  //Activar accion de listener del Boton Comprar
        R.addActionListener(this);
        Rb1.addActionListener(this);
        Rb2.addActionListener(this);
        Rb3.addActionListener(this);

    }
//JOptionPane.       es una funcion que habre cuadros de dialogo, usarlo en caso de dinero insuficiente o no marcar casillas

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if (Rb1 == source) {
            JOptionPane.showMessageDialog(this, "haz seleccionado la Fanta");
        } else if (Rb2 == source) {
            JOptionPane.showMessageDialog(this, "Haz seleccionado la Sprite");
        } else if (Rb3 == source) {
            JOptionPane.showMessageDialog(this, "Haz seleccionado la Coca Cola");
        } else if (!(Rb1.isSelected() && Rb2.isSelected() && Rb3.isSelected())) {   //En caso de no haber elegido ningun tipo de Bebida
            JOptionPane.showMessageDialog(this, "No has seleccionado ninguna Bebida");
        }
    }
}
