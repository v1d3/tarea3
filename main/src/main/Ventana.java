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
import javax.swing.JCheckBox;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

        PP.getBoton().ActivateActionListener();
        PP.getBoton().ButtonGroup();    //Activa el boton comprame
        PP.getBoton().R.setBounds(820, 110, 100, 50); //Boton de Compra
        PP.getBoton().Rb1.setBounds(250, 650, 80, 50); //Fanta
        PP.getBoton().Rb2.setBounds(170, 650, 80, 50); //Sprite
        PP.getBoton().Rb3.setBounds(90, 650, 80, 50); //Coca

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
        g.fillRect(50, 50, 500, 650); //Rectangulo y dimensiones
        g.setColor(Color.gray);
        g.fillRect(80, 80, 440, 550); //Rectangulo y dimensiones
        g.setColor(Color.black);
        g.fillRect(380, 550, 170, 150);
        g.setColor(Color.white);
        g.fillRect(600, 30, 190, 200);

        g.setColor(Color.black);
        g.setFont(new Font("Cooper Black", Font.PLAIN, 18));
        g.drawString("PRECIOS", 660, 50);
        g.setFont(new Font("Serif", Font.BOLD, 14));
        g.drawString("Coca Cola   $2000", 670, 100);
        g.drawString("Sprite   $1500", 670, 150);
        g.drawString("Fanta   $1000", 670, 200);
        g.setFont(new Font("Lucida Fax", Font.BOLD, 18));
        g.drawString("Forma de pago", 700, 270);

    }
}

class PanelesPerifericos extends JPanel {

    Botones bo;

    public PanelesPerifericos() {
        bo = new Botones();
    }

    public Botones getBoton() {
        return bo;
    }

    public void addBotonestoPanel(PanelPrincipal pp) {
        pp.add(getBoton().Rb1);
        pp.add(getBoton().Rb2);
        pp.add(getBoton().Rb3);
        pp.add(getBoton().R);

    }

}

class Botones extends JButton implements ActionListener {

    JRadioButton Rb1;
    JRadioButton Rb2;
    JRadioButton Rb3;
    JButton R;
    ButtonGroup Bg1;
    ButtonGroup Bg2;
    JCheckBox Jc1;
    JCheckBox Jc2;
    JCheckBox Jc3;
    JCheckBox Jc4;

    public Botones() {  //Creacion de botones (Instancias)
        //Botones para La seleccion de Bebida
        Rb1 = new JRadioButton("Fanta");
        Rb2 = new JRadioButton("Sprite");
        Rb3 = new JRadioButton("Coca Cola");
        Rb3 = new JRadioButton("Coca");
        R = new JButton("Comprar");
        //Botones para el Dinero
        Jc1 = new JCheckBox();
        Jc2 = new JCheckBox();
        Jc3 = new JCheckBox();
        Jc4 = new JCheckBox();
    }

    public void ButtonGroup() { //Adicion de botones a grupo
        Bg1 = new ButtonGroup();
        Bg2 = new ButtonGroup();
        Bg1.add(Rb1);
        Bg1.add(Rb2);
        Bg1.add(Rb3);
        Bg2.add(Jc1);
        Bg2.add(Jc2);
        Bg2.add(Jc3);
    }

    public void ActivateActionListener() {  //Activar accion de listener del Boton Comprar
        R.addActionListener(this);
    }
//JOptionPane.       es una funcion que habre cuadros de dialogo, usarlo en caso de dinero insuficiente o no marcar casillas

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Asi que te gusta la fanta eh?.");
        } else if (Rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Asi que te gusta el Sprite eh?.");
        } else if (Rb3.isSelected()) {
            JOptionPane.showMessageDialog(this, "wacala");
        } else if (!(Rb1.isSelected() && Rb2.isSelected() && Rb3.isSelected())) {   //En caso de no haber elegido ningun tipo de Bebida
            JOptionPane.showMessageDialog(this, "No has seleccionado ninguna Bebida");
        }
    }
}
