/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiadd;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author alexb
 */
public class ApplicationServer {
    public static void main(String[] args) throws RemoteException{
        Registry registry = LocateRegistry.createRegistry(5099);
        registry.rebind("hello", new Server());
    }
}
