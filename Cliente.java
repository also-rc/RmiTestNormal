package E4;

import java.net.MalformedURLException;
import java.rmi.*;

import java.util.Scanner;

public class Cliente {
    public Cliente() throws NotBoundException, MalformedURLException, RemoteException{
        InterfaceRemota objetoRemoto = (InterfaceRemota)Naming.lookup("//25.9.254.95/ObjetoRemoto");
        int opcion=0;
        double  aux1,aux2,aux3;
        boolean redo=false;
        Scanner sc = new Scanner(System.in);
        
        try{
            do{
                System.out.println("¿Qué operación quieres?\n"
                        + "1.- Área poligono Regular\n"
                        + "2.- Resolver ecuación forma ax²+bx+c\n"
                        + "3.- Área círculo");
                
                opcion=sc.nextInt();
                
                switch(opcion){
                    case 1:
                    do{
                        System.out.println("----CÁLCULO DE POLÍGONO REGULAR----");
                        System.out.println("Ingrese valor de perímetro en cm²: ");
                        aux1 = sc.nextDouble();
                        System.out.println("Ingrese valor de apotema en cm²: ");
                        aux2 = sc.nextDouble();
                        
                        System.out.println("Verificación de datos: ");
                        System.out.println("Perímetro = " + aux1 + "cm²");
                        System.out.println("Apotema = " + aux2 + "cm²");
                        System.out.println("¿Son correctos estos datos? [1]Sí [2]No");
                        opcion = sc.nextInt();
                        
                        if(opcion == 2)
                            redo = true;
                        else
                            redo = false;
                            
                    
                    }while(redo);
                        System.out.println("Datos validados con éxito\nEl área es: " + objetoRemoto.areaPoligonoRegular(aux1, aux2 )+ "cm²");
                        break;
                    case 2:
                    do{
                        System.out.println("----CÁLCULO DE ECUACIÓN FORMA AX²+BX+C----");
                        System.out.println("Ingrese valor de A: ");
                        aux1 = sc.nextDouble();
                        System.out.println("Ingrese valor de B: ");
                        aux2 = sc.nextDouble();
                        System.out.println("Ingrese valor de C: ");
                        aux3 = sc.nextDouble();
                        
                        System.out.println("Verificación de datos: ");
                        System.out.println("Valor de A: " + aux1);
                        System.out.println("Valor de B: " + aux2);
                        System.out.println("Valor de C: " + aux3);
                        System.out.println("¿Son correctos estos datos? [1]Sí [2]No");
                        opcion = sc.nextInt();
                        
                        if(opcion == 2)
                            redo = true;
                        else
                            redo = false;
                        
                    }while(redo);
                        System.out.println("Datos validados con éxito \n"+objetoRemoto.trinomioCuadradoPErfecto(aux1, aux2,aux3));
                        break;
                    case 3:
                    do{
                        System.out.println("----CÁLCULO ÁREA DE CÍRCULO----");
                        System.out.println("Ingrese valor de radio en cm²: ");
                        aux1 = sc.nextDouble();
                        System.out.println("Verificación de datos: ");
                        System.out.println("Radio = " + aux1 + "cm²");
                        System.out.println("¿Son correctos estos datos? [1]Sí [2]No");
                        opcion = sc.nextInt();
                        if(opcion == 2)
                            redo = true;
                        else
                            redo = false;
                    }while(redo);
                        System.out.println("El área es: " +objetoRemoto.areaCirculo(aux1) + "cm²");
                        break;
                    
                }
                System.out.println("¿Realizar otra operación? [1] Sí [2] No");
                opcion = sc.nextInt();

        }while(opcion == 1);
            
        System.out.println("Gracias por usarme, vuelve pronto, te amo.");     
            
    }catch(Exception e){
        e.printStackTrace();
    }
        
    }
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
        new Cliente();
    }
}
