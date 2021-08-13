//package prueba_condicionales;

import java.util.*;
public class ciclos {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero par: \n");
        int numero_maximo=entrada.nextInt();
        entrada.close();

        if (numero_maximo%2==0)
        {
            for(int a=2; a<=numero_maximo;a=a+2)
            {
                System.out.println(a);
            }
        }
        else
        {
            System.out.println("El numero ingresado no es par");
        }
    }
    
}
