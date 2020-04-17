/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yapısal_decorator;

/**
 *
 * @author mehmet
 */
public class Yapısal_Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cikarma cikarma = new Cikarma();
        cikarma.setSayi1(35);
        cikarma.setSayi2(25);
        
        IkiliIslem ikili = new IkiliIslem(cikarma);
        
        ikili.setSayi1( 35 );
        
        ikili.sifrele();
       //https://www.turkayurkmez.com/decorator-design-pattern/
       //http://www.tasarimdesenleri.com/jsp/tasdesincele/decorator.jsp
    }
    
}
