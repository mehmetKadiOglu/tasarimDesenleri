/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package davranissal_state;

/**
 *
 * @author mehmet
 */
//context
public class Socket {
    private StateSocket stateSocket;

    private StateSocket getStateSocket() {
        return stateSocket;
    }

    public void setStateSocket(StateSocket stateSocket) {
        this.stateSocket = stateSocket;
    }
    
    public void Do()
    {
        this.getStateSocket().handle(this);
    }
    
}

interface StateSocket{
    void handle(Socket socket);
}

class SocketAc implements StateSocket{

    @Override
    public void handle(Socket socket) {
        System.out.println("Socket acildi");
        socket.setStateSocket(new SocketDinle());
    }
    
}
class SocketDinle implements StateSocket{

    @Override
    public void handle(Socket socket) {
        System.out.println("Socket dinlendi");
        socket.setStateSocket(new SocketKapat());
    }
    
}
class SocketKapat implements StateSocket{

    @Override
    public void handle(Socket socket) {
        System.out.println("Socket kapandı");
        socket.setStateSocket(new SocketAc());
    }
    
}