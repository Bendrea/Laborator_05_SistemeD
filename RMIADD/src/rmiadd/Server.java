/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiadd;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author alexb
 */
public class Server extends UnicastRemoteObject implements ServiceRMI {

    public Server() throws RemoteException{
        super();
    }
    
    public String echo (String input) throws RemoteException{
        return "From server: " + input;
    }
    
    public void array(int[] addVect){
        int sum = 0;
        for (int i = 0; i < addVect.length; i++) {
            sum += addVect[i];
        }
        System.out.println("Suma vector = " + sum);
    }
    
    
    
}
