
package E2;

import java.rmi.Naming;

/**
 *
 * @author gabhs
 */
public class Servidor {
    public Servidor(){
        try {
            
            System.setProperty(
                    "java.rmi.server.codebase",
                    "25.8.168.42");
            InterfaceRemota objetoRemoto = new ObjetoRemoto();
            Naming.rebind("//25.8.168.42/ObjetoRemoto", objetoRemoto);
            System.out.println("Servidor iniciado...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        new Servidor();
    }
}
