/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yapısal_flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mehmet
 */
public class Yapısal_Flyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fark ne? Görebildiniz mi? Prototype deseni, nesneyi yaratırken karşımıza çıkan problemi çözüyor.
        //Flyweight design pattern ise zaten oluşturulmuş nesneleri belleğe aktarıyor! 
        //Yani hali hazırda bellekte olan nesnelerin bir kombinasyonunu oluşturuyorsunuz. 
        //Sonuç olarak birbirlerine benzemelerine karşın, pratikte oldukça farklı iki işleve sahip desenlerden bahsediyoruz.

        FlyweightBalonOlusturucu olustur = new FlyweightBalonOlusturucu();
        
        List<String> dizim = new ArrayList<String>();
        dizim.add("sari");
        dizim.add("kırmızı");

        dizim.forEach(item -> {

            for (int i = 1; i <= 5; i++) {
               Balonlar balon = olustur.BalonYarat( item );
               balon.setBoy(i);
               balon.setEn(i);
               balon.balonOlustur();
                
                
            }
            
        });

    }

}
