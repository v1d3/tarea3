package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Ventana extends JFrame {

    private PanelPrincipal dp;
    private PanelesPerifericos PP;
    //private JLabel JL = new JLabel();

    Ventana() {
        this.setLayout(new BorderLayout());
        dp = new PanelPrincipal();
        PP = new PanelesPerifericos();
        dp.setLayout(null);
        //JL.setIcon(new ImageIcon("C:\\Users\\ccris\\OneDrive\\Escritorio\\pictures-steam profile\\dispensador.jpg"));
        PP.getBoton().ActivateActionListener();
       ////////////////////// PP.getBoton().ButtonGroup();    //Activa el boton comprame
        
        PP.addButtonsCoordinate();      //Agrega coordenadas a los botones
        //JL.setBounds(150, 50, 1000, 650);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//activar cierre en la X 
        this.add(dp);
        PP.addBotonestoPanel(dp);   //Añade los botones al panel Principal
        //dp.add(JL);
        this.setSize(1000, 800); //Tamaño de la ventana
        this.setVisible(true);  //para que se abra y sea visible 
        setLocationRelativeTo(null);
    }

}