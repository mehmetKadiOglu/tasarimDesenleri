/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mehmet
 */

// bir nesnedeki komut diğer nesnelere gitmesi için. Burda mesajlaşma örneği verilmiş
abstract class Mediator {
    
    protected List <message> listem;
    
    abstract void addEleman( message a );
    abstract void sendMesaj( String mesaj, message nesne );
    
    
}

interface message {
    
    void sendMessage( String mesaj );
}


class media extends Mediator {

    
    public media() {
        
        this.listem = new ArrayList<message>();
    }
    
    @Override
    void addEleman( message a ) {
        
        listem.add(a);
    }

    @Override
    void sendMesaj( String mesaj, message nesne ) {
        
        listem.stream().filter((x) -> ( x != nesne )).forEachOrdered((x) -> {
            x.sendMessage( mesaj );
        });
    }
    
    
}

class nesne1 implements message {

    @Override
    public void sendMessage(String mesaj) {
        
        System.out.println( "nesne1'de " + mesaj );
    }
    
}
class nesne2 implements message {

    @Override
    public void sendMessage(String mesaj) {
        
        System.out.println( "nesne2'de " + mesaj );
    }
    
}
class nesne3 implements message {

    @Override
    public void sendMessage(String mesaj) {
        
        System.out.println( "nesne3'de " + mesaj );
    }
    
}
class nesne4 implements message {

    @Override
    public void sendMessage(String mesaj) {
        
        System.out.println( "nesne4'de " + mesaj );
    }
    
}
class nesne5 implements message {

    @Override
    public void sendMessage(String mesaj) {
        
        System.out.println( "nesne5'de " + mesaj );
    }
    
}