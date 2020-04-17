/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_command;

/**
 *
 * @author mehmet
 */
public class DavranisSal_command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Televizyon televizyon = new Televizyon();
       televizyon.komutGir(0);
       televizyon.komutGir(1);
    }
    
}
