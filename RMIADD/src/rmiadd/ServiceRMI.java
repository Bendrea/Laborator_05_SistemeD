/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiadd;

import java.lang.reflect.Array;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author alexb
 */
public interface ServiceRMI extends Remote{
    
    public String echo(String input) throws RemoteException;
    
    public void array(int[] addVect) throws RemoteException;
   
}
