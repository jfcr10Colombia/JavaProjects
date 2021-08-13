//package prueba_condicionales;

import java.util.*;
public class condicionles {
    public static void main(String[] args) 
    {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese un valor: \n");
        int valor_ingresado=lectura.nextInt();
        lectura.close();
        if (valor_ingresado<0)
           System.out.printf("%d es negativo \n", valor_ingresado); 
        else if(valor_ingresado==0)
            System.out.printf("%d es igual a cero \n", valor_ingresado);
        else
            System.out.printf("%d es positivo \n", valor_ingresado);        
    }     
}
