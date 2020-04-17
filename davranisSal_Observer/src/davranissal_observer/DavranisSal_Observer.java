/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_observer;

/**
 *
 * @author mehmet
 */
public class DavranisSal_Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Araba araba = new Araba();
        araba.addGozlemci(new mehmet());
        araba.addGozlemci(new ali());
        araba.addGozlemci(new hatice());
        araba.setFiyat(350);
    }
    
}
