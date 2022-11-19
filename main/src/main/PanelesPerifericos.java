
package main;

import javax.swing.JPanel;


class PanelesPerifericos extends JPanel {

    public Botones bo;

    public PanelesPerifericos() {
        bo = new Botones();
    }

    public Botones getBoton() {
        return bo;
    }

    public void addBotonestoPanel(JPanel pp) {
        pp.add(getBoton().Rb1);
        pp.add(getBoton().Rb2);
        pp.add(getBoton().Rb3);
        pp.add(getBoton().R);

        pp.add(getBoton().Jc1);
        pp.add(getBoton().Jc2);
        pp.add(getBoton().Jc3);
        pp.add(getBoton().Jc4);
        repaint();
    }

    public void addButtonsCoordinate() {
        getBoton().R.setBounds(820, 110, 130, 50); //Boton de Compra
        getBoton().Rb1.setBounds(340, 650, 80, 50); //Fanta ************
        getBoton().Rb2.setBounds(265, 650, 75, 50); //Sprite ***********
        getBoton().Rb3.setBounds(180, 650, 88, 50); //Coca ***************
        getBoton().Jc1.setBounds(600, 300, 80, 50); //100
        getBoton().Jc2.setBounds(690, 300, 80, 50); //500
        getBoton().Jc3.setBounds(780, 300, 80, 50); //1000
        getBoton().Jc4.setBounds(870, 300, 80, 50); //1500 
        repaint();
    }

}
