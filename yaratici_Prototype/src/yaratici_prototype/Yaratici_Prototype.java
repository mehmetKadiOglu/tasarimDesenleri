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
public class Yaratici_Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Amusteri nesne = new Amusteri();
        System.out.println(nesne);
        nesne.setAd("mehmet");
        nesne.setNo("1055");
        nesne.setSoyad("Kati");

        Amusteri nesne2 = (Amusteri) nesne.clone();
        nesne2.setAd("Ayşeee");
        System.out.println(nesne2.getAd());
        System.out.println(nesne.getAd());

    }

}
