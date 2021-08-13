//package prueba_condicionales;
import java.util.*;
public class promedio {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double suma=0d;
        int contador=0;
        System.out.println("Ingrese un numero: ");
        double valor=entrada.nextDouble();

        while(valor!=-1)
        {
            suma +=valor;
            contador ++;
            System.out.println("Ingrese un numero: ");
            valor=entrada.nextDouble();
        }
        System.out.print("el promedio de los numeros ingresados "+ suma/contador);
    }
    
}
