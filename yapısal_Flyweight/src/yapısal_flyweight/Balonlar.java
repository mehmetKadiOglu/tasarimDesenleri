/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yapısal_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mehmet
 */
public class Balonlar {

    private String balonRengi;
    private int boy;
    private int en;

    public String getBalonRengi() {
        return balonRengi;
    }

    public void setBalonRengi(String balonRengi) {
        this.balonRengi = balonRengi;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public void balonOlustur() {

        System.out.println(this.getBoy() + " boynda " + this.getEn() + " eninde " + this.getBalonRengi() + " renginde balon oluştu");

    }

}

class FlyweightBalonOlusturucu {

    private Map< String, Balonlar> balonHavuzu;

    public FlyweightBalonOlusturucu() {

        this.balonHavuzu = new HashMap< String, Balonlar>();

    }

    private Map<String, Balonlar> getBalonHavuzu() {
        
        return balonHavuzu;
    }
    
    private Balonlar getBalonHavuzu( String renk ) {
        
        return balonHavuzu.get(renk);
    }
    
    private void setKarakterHavuzu( String renk, Balonlar balon ) {
        
        this.balonHavuzu.put(renk, balon);
        
    }

    public Balonlar BalonYarat(String renk) {
        
        if (!this.getBalonHavuzu().containsKey(renk)) {
            Balonlar balon = new Balonlar();
            balon.setBalonRengi( renk );
            this.setKarakterHavuzu( renk, balon );
            return balon;
        }
        else
            return this.getBalonHavuzu( renk );
    }

}
