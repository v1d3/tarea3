package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

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

        g.setColor(Color.BLACK);
        g.fillRect(90, 90, 420, 530);
        g.setColor(Color.GRAY);     //Rectangulo donde se situara el dinero
        g.fillRect(380, 550, 170, 150);

        g.setColor(Color.white);
        g.fillRect(600, 30, 190, 200);
        g.setColor(Color.black);
        g.setFont(new Font("Cooper Black", Font.PLAIN, 18));
        g.drawString("PRECIOS", 660, 60);
        g.setFont(new Font("Serif", Font.BOLD, 14));
        g.drawString("Coca Cola   $2000", 620, 100);
        g.drawString("Sprite   $1500", 620, 150);
        g.drawString("Fanta   $1000", 620, 200);
        g.setFont(new Font("Lucida Fax", Font.BOLD, 18));
        g.drawString("Tipo de moneda de pago", 650, 270);
        g.drawString("Cantidad de monedas a pagar", 640, 390);
    }

}

class PintarBebidas extends JPanel {

    public static int x = 50;
    public static int y = 50;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);

    }
}
