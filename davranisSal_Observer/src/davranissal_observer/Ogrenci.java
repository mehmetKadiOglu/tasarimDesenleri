/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mehmet
 */
public class Ogrenci {
    
}
interface Observer{
    void haberVer(int yeniFiyat);
}
class Araba{
    
    List<Observer> gozlemci;
    int fiyat = 300;
    public Araba()
    {
        gozlemci = new ArrayList<Observer>();
    }
    public void setFiyat(int a)
    {
        
        fiyat = a;
        this.haberVer();
        
    }
    public void haberVer()
    {
        for(Observer observer : gozlemci)
            observer.haberVer(fiyat);
    }
    public void addGozlemci(Observer observer)
    {
        gozlemci.add(observer);
    }
    public void deleteGozlemci(Observer observer)
    {
        gozlemci.remove(observer);
    }
}

class mehmet implements Observer{

    @Override
    public void haberVer(int yeniFiyat) {
        System.out.println("mehmet haberi aldi"+ yeniFiyat);
    }
    
}
class ali implements Observer{

    @Override
    public void haberVer(int yeniFiyat) {
        System.out.println("ali haberi aldi"+ yeniFiyat);
    }
    
}
class hatice implements Observer{

    @Override
    public void haberVer(int yeniFiyat) {
        System.out.println("hatice haberi aldi"+ yeniFiyat);
    }
    
}
