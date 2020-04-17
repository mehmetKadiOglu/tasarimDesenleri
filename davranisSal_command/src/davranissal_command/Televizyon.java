/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mehmet
 */
public class Televizyon { // televizyonun komutları vardır. Ac ve kapat.
    private List<Komut> komut;
    public Televizyon(){this.setKomutlar();}
    
    private void setKomutlar()
    {
        komut = new ArrayList<Komut>();
        komut.add(new TelevizyonAc());
        komut.add(new TelevizyonKapat());
    }
    public void komutGir(int index)
    {
        komut.get(index).execute();
    }
    
}
interface Komut{
    void execute();
}

class TelevizyonAc implements Komut{
    @Override
    public void execute() {
        System.out.println("Televizyon Acıldı");
    }
}
class TelevizyonKapat implements Komut{
    @Override
    public void execute() {
        System.out.println("Televizyon Kapandı");
    }
}