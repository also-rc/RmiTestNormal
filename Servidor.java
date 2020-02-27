package E4;
import java.rmi.*;

public class Servidor {
    public Servidor() {

        System.setProperty("java.rmi.server.hostname", "25.9.254.95");//IP de mi servicio 

        InterfaceRemota objetoRemoto;
        try{
            
            objetoRemoto = new ObjetoRemoto();
            Naming.rebind("//25.9.254.95/ObjetoRemoto", objetoRemoto);

            System.out.println("Y se la damos en 3...2.....1 TIEMPO!");  
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Servidor();
    }

}