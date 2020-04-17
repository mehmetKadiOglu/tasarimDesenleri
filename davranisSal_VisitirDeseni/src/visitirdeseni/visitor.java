/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitirdeseni;

/**
 *
 * @author mehmet
 */
interface Visitor {
    void ziyaret(Urun urun);
}
abstract class  Urun
{    double fiyat;
      double miktar;
    void kabulEt(Visitor visitor)
    {
        visitor.ziyaret(this);
    }
    abstract double getFiyat();
    abstract void setFiyat(double fiyat);
    abstract double getMiktar();
    abstract void setMiktar(double miktar);
    double total() {
        return getMiktar() * getFiyat();
    }
}

class Bilgisayar extends Urun{

    @Override
    public double getFiyat() {
        return fiyat;
    }

    @Override
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    double total() {
        return getMiktar() * getFiyat();
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }    
    
}
class Otomobil extends Urun {
 
    @Override
    public double getFiyat() {
        return fiyat;
    }

    @Override
    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    
      public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }
}

class Indirim implements Visitor{

    @Override
    public void ziyaret(Urun urun) {
       urun.setFiyat(urun.getFiyat()*0.8);
    }
    
}
class BuyukIndirim implements Visitor{

    @Override
    public void ziyaret(Urun urun) {
       urun.setFiyat(urun.getFiyat()*0.5);
    }
    
}