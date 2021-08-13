package Descuentos;

import java.util.Scanner;

public class Ofertas {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese el numero de dia de la semana (Domingo-> 1 Sabado->7):\n");
        int dia=Integer.parseInt(entrada.nextLine());

        switch(dia)
        {
            case 1:
                System.out.println("El descuento otorgado para el dia Domingo es del 5% \n");
            break;
            case 2:
                System.out.println("El descuento otorgado para el dia Lunes es del 3% \n");
            break;
            case 3:
                System.out.println("El descuento otorgado para el dia Martes es del 10% \n");
            break;
            case 4:
                System.out.println("El descuento otorgado para el dia Miercoles es del 4% \n");  
            break;
            case 5:
                System.out.println("El descuento otorgado para el dia Jueves es del 6% \n");
            break;
            case 6:
                System.out.println("El descuento otorgado para el dia Viernes es del 2% \n");
            break;
            case 7:
                System.out.println("El descuento otorgado para el dia Sabado es del 1% \n");
            break;
            default:           
                System.out.println("La opcion seleccionada no es valida \n");
        }
        
    }
}
