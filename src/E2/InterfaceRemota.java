
package E2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author gabhs
 */
public interface InterfaceRemota extends Remote{
    public double circulo (double radio)throws RemoteException;
    public double regular (double nLados, double lado,double apotema)throws RemoteException;
    public double irregular (double base,double altura )throws RemoteException;

}
