package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

class PanelPrincipal extends JPanel {
    private Expendedor exp;
    
    public PanelPrincipal() {
        exp = new Expendedor(9);
        this.setBackground(Color.blue);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        exp.paint(g); //Expendedor
        exp.paintBebidastoExpendedor(g); //Imprime Bebidas
        g.setColor(Color.white);
        g.fillRect(600, 30, 190, 215);
        g.fillRect(620, 530, 300, 20);//**************++

        g.setColor(Color.black);
        g.setFont(new Font("Cooper Black", Font.PLAIN, 18));
        g.drawString("PRECIOS", 660, 60);
        g.setFont(new Font("Serif", Font.BOLD, 14));
        g.drawString("Coca Cola   $1000", 660, 100);
        g.drawString("Sprite   $1000", 660, 160);
        g.drawString("Fanta   $1000", 660, 220);
        g.setFont(new Font("Lucida Fax", Font.BOLD, 18));
        g.drawString("Tipo de moneda de pago", 650, 270);
        //g.drawString("Cantidad de monedas a pagar", 640, 390);

        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.setColor(Color.red);
        g.fillRoundRect(620, 70, 27, 48, 20, 20);
        g.setColor(Color.black);
        g.drawString("xxx", 621, 100);
        g.setColor(Color.green);
        g.fillRoundRect(620, 130, 27, 48, 20, 20);
        g.setColor(Color.black);
        g.drawString("xxx", 621, 160);
        g.setColor(Color.orange);
        g.fillRoundRect(620, 190, 27, 48, 20, 20);
        g.setColor(Color.black);
        g.drawString("xxx", 621, 220);
        g.drawString("$$$$$  Deposito de Monedas  $$$$$", 650, 545); //************************+

    }

}
