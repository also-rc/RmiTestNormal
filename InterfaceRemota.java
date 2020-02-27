package E4;
import java.rmi.*;

public interface InterfaceRemota extends Remote{

    // (Perimetro * apotema) / 2
    public double areaPoligonoRegular(double perimetro, double apotema)throws RemoteException;

    public String trinomioCuadradoPErfecto (double a, double b, double c)throws RemoteException; 

    public double areaCirculo(double radio)throws RemoteException;


}