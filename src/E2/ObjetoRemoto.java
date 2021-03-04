
package E2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

/**
 *
 * @author gabhs
 */
public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota {
    private static final long serialVersionIUD =1L;
    public ObjetoRemoto() throws RemoteException{
        super();
    }

    @Override
    public double circulo(double radio) throws RemoteException {
        System.out.println("Calculando area del cicrulo");
        double area= (3.1416 * (radio * radio));
        return (area);
    }

    @Override
    public double regular(double nLados, double lado, double apotema) throws RemoteException {
        System.out.println("Calculando area de poligono regular");
        double area= ((nLados*lado)*apotema)/2;
        return (area);
    }

    @Override
    public double irregular(double base,double altura ) throws RemoteException {
        System.out.println("Calculando area de poligono irregular");
        double area;
        area = (base * altura) / 2;
        return area;
    }
    
}
