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
public class VisitirDeseni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bilgisayar bilgisayar = new Bilgisayar();
       bilgisayar.setFiyat(3000);
       bilgisayar.kabulEt(new Indirim());
       System.out.println(bilgisayar.getFiyat());
       
       Otomobil otomobil = new Otomobil();
       otomobil.setFiyat(150000);
       otomobil.kabulEt(new BuyukIndirim());
       
       System.out.println(otomobil.getFiyat());
     
    }
    
}
