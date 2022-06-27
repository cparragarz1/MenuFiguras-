
package menufiguras;

import Clases.Trapecio;
import Clases.Paralelogramo;
import Clases.Rombo;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MenuFiguras {
    
//1.	Elaborar un programa que ofrezca un menú de opciones mediante el cual se pueda 
//calcular el área de las figuras geométricas trapecio, rombo y paralelogramo (se 
// deben consultar las fórmulas para calcular estas áreas). Una vez seleccionada la 
//opción que permita seleccionar la figura, el programa debe mostrar en pantalla el 
//nombre de la figura y su área. Utilizar clases abstractas.
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        Scanner sn=new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
         System.out.println("Hola buenos dias ");
         System.out.println("vamos a calcular el area de uas figuras geometricas: ");
         for (int i=5;  i>=0; i--){
         while(salir);
        System.out.println("1. calcular el area de trapecio");
        System.out.println("2. calcular el area de un rombo");
        System.out.println("3. calcular el area de un paralelogramo");
        System.out.println("5. salir");
        System.out.println("Por favor seleccione la opcion que desea calcular");
            opcion= sn.nextInt();
            switch (opcion){
                case 1: 
                    Trapecio miTrapecio= new Trapecio(4, 2, 5);
                 System.out.println("..............................................");
                  System.out.println("Área del trapecio es : " + miTrapecio.calculoArea());
                  System.out.println("..............................................");
                   break;
            
        
                 case 2: 
                    Rombo miRombo= new Rombo(5, 7);
                    System.out.println("..............................................");
                 
                  System.out.println("Área del rombo es : " + miRombo.calculoArea());
                  System.out.println("..............................................");
                   break;
                   case 3: 
                       System.out.println("..............................................");
                   Paralelogramo miParalelogramo= new Paralelogramo(3, 7);
                   
                   System.out.println("..............................................");
                 
                  System.out.println("Área del paralelogramo es : " + miParalelogramo.calculoArea());
                  System.out.println(".............................................."); 
                   break;
                    case 4:
                    salir=true;
                        break;
                        default:
                           System.out.println("solo las opciones entre 1 y 3 :  "); 
            }
    }
    }}
    

