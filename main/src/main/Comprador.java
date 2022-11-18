package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Comprador{

    private Bebida b;
    private Expendedor exp;
    private Graphics g;

    public Comprador(Expendedor exp) {
        this.exp = exp;
    }
}
