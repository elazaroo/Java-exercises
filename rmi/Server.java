package rmi;

import java.net.*;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;

public class Server extends UnicastRemoteObject implements InterfaceServer {
    public Server() throws RemoteException {
        super();
    }

    public String greeting(String n) throws RemoteException {
        return "Hello, " + n + "!";
    }

    public static void main(String[] args) {
        try {
            Server obj = new Server();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/ObjectHello", obj);
            System.out.println("Hello registered");
        } catch (RemoteException re) {
            System.out.println("Error: " + re.getMessage());
            re.printStackTrace();
        } catch (MalformedURLException me) {
            System.out.println("Error: " + me.getMessage());
            me.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
