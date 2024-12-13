package rmi.ObjectSend;

import java.rmi.*;

public interface InterfaceServer extends Remote {
    Operations operations(float var1, float var2) throws RemoteException;
}
