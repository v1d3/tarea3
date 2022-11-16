package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
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
        PP.getBoton().ButtonGroup();    //Activa el boton comprame
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

class PanelPrincipal extends JPanel {

    public PanelPrincipal() {
        this.setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Color c = new Color(156, 32, 5);        
        //g.setColor(c);
        //g.fillRect(40, 40, 495, 660); //51,51 501, 651
        g.setColor(Color.red);
        g.fillRect(50, 50, 500, 650); //Rectangulo y dimensiones

        g.setColor(Color.gray);
        g.fillRect(80, 80, 440, 550); //Rectangulo y dimensiones
        g.setColor(Color.LIGHT_GRAY);     //Rectangulo donde se situara el dinero
        g.fillRect(380, 550, 170, 150);

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
        
        pp.add(getBoton().Jc1);
        pp.add(getBoton().Jc2);
        pp.add(getBoton().Jc3);
        pp.add(getBoton().Jc4);
    }

    public void addButtonsCoordinate() {
        getBoton().R.setBounds(500, 400, 100, 50); //Boton de Compra
        getBoton().Rb1.setBounds(250, 650, 80, 50); //Fanta
        getBoton().Rb2.setBounds(170, 650, 80, 50); //Sprite
        getBoton().Rb3.setBounds(90, 650, 80, 50); //Coca

        getBoton().Jc1.setBounds(600, 650, 80, 50); //100
        getBoton().Jc2.setBounds(690, 650, 80, 50); //500
        getBoton().Jc3.setBounds(780, 650, 80, 50); //1000
        getBoton().Jc4.setBounds(870, 650, 80, 50); //1500

    }

}

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
        Rb3 = new JRadioButton("Coca");
        R = new JButton("Comprar");
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
            JOptionPane.showMessageDialog(this, "Asi que te gusta la PIJA eh?.");
        } else if (Rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "GEY?.");
        } else if (Rb3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Te gusta la pija negra");
        } else if (!(Rb1.isSelected() && Rb2.isSelected() && Rb3.isSelected())) {   //En caso de no haber elegido ningun tipo de Bebida
            JOptionPane.showMessageDialog(this, "No has seleccionado ninguna Bebida");
        }
    }
}
