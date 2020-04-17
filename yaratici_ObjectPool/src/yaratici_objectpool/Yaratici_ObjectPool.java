/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaratici_objectpool;

/**
 *
 * @author mehmet
 */
public class Yaratici_ObjectPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Basket basket = BasketSource.getBasket(IronBasket.class);
        System.out.println(basket.type() + " " + basket.toString());
        Basket basket2 = BasketSource.getBasket(IronBasket.class);
        System.out.println(basket.type() + " " + basket.toString());*/
        
        Basket a = new IronBasket();
        System.out.println(a.type());

    }

}
