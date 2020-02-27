package E4;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ObjetoRemoto extends UnicastRemoteObject implements InterfaceRemota{

    public ObjetoRemoto() throws RemoteException{
        super();
    }
    
    public double areaPoligonoRegular(double perimetro, double apotema) throws RemoteException {
        return (perimetro * apotema) / 2;
    }

    
    public String trinomioCuadradoPErfecto(double a, double b, double c) throws RemoteException {
        String solucionPositiva = Double.toString((-b + Math.sqrt((b*b - 4*a*c))) /(2*a));
        String solucionNegativa = Double.toString((-b - Math.sqrt((b*b - 4*a*c))) /(2*a));
        return ("Soluciones: {" + solucionPositiva +"," + solucionNegativa + "}");
    }


    public double areaCirculo(double radio) throws RemoteException {
        return (Math.PI * Math.pow(radio,2));
    }
 
 

     
    
}