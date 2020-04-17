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
public class DavranisSal_Strateji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       eleman manele = new eleman(new muhendisMaas(), new AgrupIzin());
       manele.getHesaplaIzın().hesapla();
       manele.getHesaplaMaas().maasHesapla();
    }
    
}
