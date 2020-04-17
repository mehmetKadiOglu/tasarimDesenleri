/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yapısal_composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mehmet
 */
abstract class IKutuphane {

    private String ad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    
    
    abstract void Goster();
    

}

class Kutuphane extends IKutuphane {

    List<IKutuphane> aa;

    public Kutuphane() {

        aa = new ArrayList<IKutuphane>();
    }

    @Override
    public void Goster() {

        System.out.println( this.getAd() );
        for (IKutuphane k : aa) {
            k.Goster();
        }
    }

    public void ekle(IKutuphane a) {
        aa.add(a);
    }
}

class Kitap extends IKutuphane {

    
    public Kitap( String a ) {
        
   
        this.setAd( a );
    }
    
    public void Goster() {

        System.out.println( this.getAd() );
        
    }

}

public class BaseClass {

}
