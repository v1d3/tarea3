package main;

import java.awt.BorderLayout;
import javax.swing.JFrame;
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
        PP.getBoton().ActivateActionListener(); 
        PP.getBoton().ButtonGroup();    //Activa el boton comprame
        
        PP.addButtonsCoordinate();      //Agrega coordenadas a los botones
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//activar cierre en la X 
        this.add(dp);
        
        PP.addBotonestoPanel(dp);   //Añade los botones al panel Principal
        this.setSize(1250, 800); //Tamaño de la ventana
        this.setVisible(true);  //para que se abra y sea visible 
        setLocationRelativeTo(null);
    }

}