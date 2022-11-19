package main;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Ventana extends JFrame {
    private Container cont;
    private PanelPrincipal dp;
    public Expendedor e;

    //private JLabel JL = new JLabel();
    public Ventana() {
     
        this.setLayout(new BorderLayout());
        dp = new PanelPrincipal();

        this.add(dp);
        dp.getBoton().ActivateActionListener();////////////////////////////////777
        dp.setLayout(null);
        dp.addButtonsCoordinate();

        //Agrega coordenadas a los botones
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//activar cierre en la X 
        this.add(dp);

        dp.addBotonestoPanel(dp);
        
        //Añade los botones al panel Principal
        this.setSize(1250, 800); //Tamaño de la ventana
  
        this.setVisible(true);  //para que se abra y sea visible 
        setLocationRelativeTo(null);
    }

}
