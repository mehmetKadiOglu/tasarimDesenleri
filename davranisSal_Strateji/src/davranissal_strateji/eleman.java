/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_strateji;

/**
 *
 * @author mehmet
 */
public class eleman {
   private maasHesapla hesaplaMaas;
   private izinHesapla hesaplaIzın;

   public eleman(maasHesapla hesaplaMaas, izinHesapla hesaplaIzın)
   {
       this.setHesaplaIzın(hesaplaIzın);
       this.setHesaplaMaas(hesaplaMaas);
   }
   
    public izinHesapla getHesaplaIzın() {
        return hesaplaIzın;
    }

    private void setHesaplaIzın(izinHesapla hesaplaIzın) {
        this.hesaplaIzın = hesaplaIzın;
    }

    public maasHesapla getHesaplaMaas() {
        return hesaplaMaas;
    }

    private void setHesaplaMaas(maasHesapla hesaplaMaas) {
        this.hesaplaMaas = hesaplaMaas;
    }
   
   
}
abstract class maasHesapla{
    abstract void maasHesapla();
}
class muhendisMaas extends maasHesapla{

    @Override
    void maasHesapla() {
        System.out.println("muhendis maas");
    }
}

class teknisyenMaas extends maasHesapla{

    @Override
    void maasHesapla() {
         System.out.println("teknisyen maas");
    }
    
}

abstract class izinHesapla{
    abstract void hesapla();
}

class AgrupIzin extends izinHesapla{

    @Override
    void hesapla() {
        System.out.println("a gurupbu");
    }
    
}

class BgrupIzin extends izinHesapla{

    @Override
    void hesapla() {
        System.out.println("b gurupbu");
    }
    
}