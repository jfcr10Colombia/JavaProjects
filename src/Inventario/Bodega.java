package Inventario;

import java.util.Scanner;

public class Bodega {

    final public static int cantBodega=500;
    final public static int cantBodega2=450;
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la cantidad 1 de producto deseada: \n");

        int cantidad1=Integer.parseInt(entrada.nextLine()); 
        
        System.out.println("Ingrese la cantidad 2 de producto deseada: \n");

        int cantidad2=Integer.parseInt(entrada.nextLine()); 
        
        if (cantidad1<=cantBodega)
        {
            System.out.println("No se requiere realizar pedido al proveedor");  
        }

        if (cantidad1>cantBodega)
        {
            System.out.println("Se requiere realizar pedido al proveedor");  
        }

        if (cantidad2<=cantBodega2)
        {
            System.out.println("No se requiere realizar pedido al proveedor");  
        }

        if (cantidad2>cantBodega2)
        {
            System.out.println("Se requiere realizar pedido al proveedor");  
        }
        
    }
    
}
