package rmi.Example;

import java.rmi.*;

public interface InterfaceServer extends Remote {
    String greeting(String n) throws RemoteException;
}