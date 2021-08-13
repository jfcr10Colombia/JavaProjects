//package prueba_condicionales;

import java.util.*;
public class dopromedio 
{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double suma=0d;
        int contador=1;
        //System.out.println("Ingrese un numero: ");
        double valor=0d;
        
        do{
            suma +=valor;
            System.out.println("Ingrese un numero: ");
            valor=entrada.nextDouble();            
            contador ++;         
        }while(valor!=-1);        
        System.out.print("el promedio de los numeros ingresados "+ suma/contador);        
    }
   
}


    

