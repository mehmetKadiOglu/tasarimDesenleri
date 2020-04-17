/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_mediator;

/**
 *
 * @author mehmet
 */
public class DavranisSal_Mediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        media nesnem = new media();
        
        nesne1 a1 = new nesne1();
        nesne2 a2 = new nesne2();
        nesne3 a3 = new nesne3();
        nesne4 a4 = new nesne4();
        nesne5 a5 = new nesne5();
        
        nesnem.addEleman(a5);
        nesnem.addEleman(a4);
        nesnem.addEleman(a3);
        nesnem.addEleman(a2);
        nesnem.addEleman(a1);
        
        nesnem.sendMesaj( "xxxx", a5 );
        
        nesnem.sendMesaj( "xxxxxx", a2 );
        
    }
    
}
