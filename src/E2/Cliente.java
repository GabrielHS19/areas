package E2;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author gabhs
 */
public class Cliente {

    public Cliente() {
        try {
            int id;
            double radio, nLados, lado, apotema, nTriangulos, base, altura, area = 0;
            boolean ide=true;
            Scanner entradaEscaner = new Scanner(System.in);
            //InterfaceRemota objetoRemoto = (InterfaceRemota) Naming.lookup("//192.168.1.69/ObjetoRemoto");
            InterfaceRemota objetoRemoto = (InterfaceRemota) Naming.lookup("//25.8.168.42/ObjetoRemoto");

            do{
            System.out.println("Elija una opcion");
            System.out.println("(1) Calcular el area de un circulo");
            System.out.println("(2) Calcular el area de un un poligono regular");
            System.out.println("(3) Calcular el area de un un poligono irregular");
            System.out.println("(4) Salir");

            id = entradaEscaner.nextInt();
            switch (id) {
                case 1:
                    System.out.println("Ingresa el radio : ");
                    radio = entradaEscaner.nextDouble();
                    System.out.println("El area del circulo es:" + objetoRemoto.circulo(radio));
                    break;
                case 2:
                    System.out.println("Ingresa el numero de lados del poligono : ");
                    nLados = entradaEscaner.nextDouble();
                    System.out.println("Ingresa la longitud de cada lado : ");
                    lado = entradaEscaner.nextDouble();
                    System.out.println("Ingresa la longitud del apotema : ");
                    apotema = entradaEscaner.nextDouble();
                    System.out.println("El area del poligono regular es:" + objetoRemoto.regular(nLados, lado, apotema));
                    break;
                case 3:
                    System.out.println("Ingresa el numero de triangulos : ");
                    nTriangulos = entradaEscaner.nextDouble();
                    for (int i = 0; i < nTriangulos; i++) {

                        System.out.println("Ingresa la base : ");
                        base = entradaEscaner.nextDouble();
                        System.out.println("Ingresa la altura : ");
                        altura = entradaEscaner.nextDouble();
                        area = area += objetoRemoto.irregular(base, altura);

                    }
                    System.out.println("El area del poligono irregular es: " + area);
                    break;
                case 4:
                    ide=false;
            }
            }while(ide==true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Cliente();
    }
}
