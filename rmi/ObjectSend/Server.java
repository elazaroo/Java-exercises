package rmi.ObjectSend;

import java.net.*;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;

public class Server extends UnicastRemoteObject implements InterfaceServer {
    public Server() throws RemoteException {
        super();
    }

    public Operations operations(float var1, float var2) throws RemoteException {
        return new Operations(var1, var2);
    }

    public static void main(String[] args) {
        try {
            Server obj = new Server();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/operations", obj);
            System.out.println("Object created succesfully!");
        } catch (RemoteException e) {
            System.out.println("Error Remote: " + e);
        } catch (MalformedURLException e) {
            System.out.println("Error Malformed: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
