/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_template;

/**
 *
 * @author mehmet
 */
abstract class template {
    
    private void islem1(){ System.out.println("islem1");}
    private void islem2(){ System.out.println("islem2");}
    abstract void farkliIslem();
    
    public void templateFunc() {
        
        islem1();
        islem2();
        farkliIslem();
    }
}
// işlemin yapılması için bir sıra var
class xml extends template {

    @Override
    void farkliIslem() {
        
        System.out.println("xml");
        
    }
    
}

class html extends template {

    @Override
    void farkliIslem() {
        
        System.out.println("html");
        
    }
    
    
}
