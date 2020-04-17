/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yaratici_prototype;

/**
 *
 * @author mehmet
 */
public class Musteri implements Cloneable  {
    
    protected String ad;
    protected String Soyad;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }
    
    @Override
    public Musteri clone() {
        Musteri musteri = null;
        try {
            
            musteri = (Musteri)super.clone();
            
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
            e.printStackTrace();
            
        }
        
        return musteri;
    }
    
}

class Amusteri extends Musteri {
    
    protected String no;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
    
    
}

class Bmusteri extends Musteri {
    
    protected String no;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
    
    
}
