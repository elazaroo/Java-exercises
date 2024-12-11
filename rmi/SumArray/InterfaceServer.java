package rmi.SumArray;

import java.rmi.*;
import java.util.ArrayList;

public interface InterfaceServer extends Remote {
    float sum(ArrayList<Float> aNum) throws RemoteException;
}
