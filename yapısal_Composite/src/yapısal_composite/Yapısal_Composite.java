/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yapısal_composite;

/**
 *
 * @author mehmet
 */
public class Yapısal_Composite {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        
        Kutuphane kitaplar = new Kutuphane();
        Kutuphane bilimKurgu = new Kutuphane();
        Kutuphane fantastik = new Kutuphane();
        
        
        kitaplar.setAd( "Kitaplık" );
        bilimKurgu.setAd( "bilimm" );
        fantastik.setAd( "fantastik" );
        
        Kitap a = new Kitap("Akaid");
        Kitap b = new Kitap("mevlüt");
        
        kitaplar.ekle(bilimKurgu);
        kitaplar.ekle(fantastik);
        
        bilimKurgu.ekle(a);
        bilimKurgu.ekle(b);
        
        kitaplar.Goster();
        
    }

}
