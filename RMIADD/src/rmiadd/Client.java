/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiadd;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author alexb
 */
public class Client {
     static int[] Array = {3,6,8,9,10};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        // TODO code application logic here
       
        ServiceRMI service = (ServiceRMI) Naming.lookup("rmi://localhost:5099/hello");
        System.out.println("---" + service.echo("hey server ") + service.getClass().getName() );
        
        service.array(Array);
    }
}
