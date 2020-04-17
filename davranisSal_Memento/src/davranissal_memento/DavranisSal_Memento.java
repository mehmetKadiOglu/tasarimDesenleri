/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_memento;

/**
 *
 * @author mehmet
 */
public class DavranisSal_Memento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // geri yükleme
        
        memoli a = new memoli();
        yedek b = new yedek();
        
        a.setA(15);
        
        b.setMemo( a.geriYuklemeNoktasi() );
        
        a.setA(25);
        
        System.out.println( a.getA() );
        
        a.geriYukle(b.getMemo());
        System.out.println( a.getA() );
        
        
        
    }
    
}
