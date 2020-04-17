/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author mehmet
 */
public class Adapterim {
    
}
interface dusman{
    
    void yumruk();
    void konus();
}
class robot1 implements dusman{

    @Override
    public void yumruk() {
        
    }

    @Override
    public void konus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
