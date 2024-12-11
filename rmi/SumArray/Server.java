package rmi.SumArray;

import java.net.*;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
import java.util.ArrayList;

public class Server extends UnicastRemoteObject implements InterfaceServer {
    public Server() throws RemoteException {
        super();
    }

    public float sum(ArrayList<Float> aNum) throws RemoteException {
        float dev = 0;
        for (Float x : aNum) {
            dev += x;
        }
        return dev;
    }

    public static void main(String[] args) {
        try {
            Server obj = new Server();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/SumArray", obj);
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
