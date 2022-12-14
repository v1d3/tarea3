
package main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class DepMonedas {
    private ArrayList<Moneda> al;
    private Moneda m;
    private int x, y;
    
    public DepMonedas(int x, int y){
        this.x = x; this.y = y;
        al = new ArrayList<Moneda>();
    }
    
    public void paint(Graphics g){
        y = 470 - y;
        for(int i=0; i<al.size(); i++){
            if( i%10 == 0){
                x =580 +x;
                y = y - 20;
            }
            al.get(i).setXY(x, y);
            Moneda aux = al.get(i);
            aux.paint(g);
            x = x + 10;
        }
    }
    public void addMoneda(Moneda m){
        if(m!=null){
            al.add(m);
        }
    }
 
    public Moneda getMoneda(){
        Moneda moneda;
        if(al.size() > 0){
            moneda = al.remove(0);
            return moneda;
        }
        else
            return null;  
    }
}
