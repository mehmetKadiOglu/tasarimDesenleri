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
public class DavranisSal_State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket socket = new Socket();
        socket.setStateSocket(new SocketAc());
        socket.Do();
        socket.Do();
        socket.Do();
        socket.Do();
    }
    
}
