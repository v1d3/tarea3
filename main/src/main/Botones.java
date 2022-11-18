
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


class Botones extends JButton implements ActionListener {

    JRadioButton Rb1;
    JRadioButton Rb2;
    JRadioButton Rb3;
    JButton R;
    ButtonGroup Bg1;
    JCheckBox Jc1;
    JCheckBox Jc2;
    JCheckBox Jc3;
    JCheckBox Jc4;
      

    public Botones() {  //Creacion de botones (Instancias)
        //Botones para La seleccion de Bebida
        Rb1 = new JRadioButton("Fanta");
        Rb2 = new JRadioButton("Sprite");
        Rb3 = new JRadioButton("Coca Cola");
        R = new JButton("Insertar Moneda");
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
//JOptionPane.       es una funcion que habre cuadros de dialogo, usarlo en caso de dinero insuficiente o no marcar casillas

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "haz seleccionado la Fanta");
        } else if (Rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Haz seleccionado la Sprite");
        } else if (Rb3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Haz seleccionado la Coca Cola");
        } else if (!(Rb1.isSelected() && Rb2.isSelected() && Rb3.isSelected())) {   //En caso de no haber elegido ningun tipo de Bebida
            JOptionPane.showMessageDialog(this, "No has seleccionado ninguna Bebida");
        }
    }
}
