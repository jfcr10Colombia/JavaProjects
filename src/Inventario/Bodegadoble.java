package Inventario;

import java.util.Scanner;

public class Bodegadoble {

   // final public static int cantBodega=500;
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese la cantidad en Bodega minima del producto A : \n");
        int cantBodega=Integer.parseInt(entrada.nextLine()); 
        

        System.out.println("Ingrese la cantidad 1 de producto A deseada: \n");
        int cantidad1=Integer.parseInt(entrada.nextLine()); 
        
        /*
        En caso de no ser necesario la solicitud
        del producto, indique cuántas unidades hacen falta vender para tener que realizar el pedido
        y genere una alerta cuando estas unidas sean menores a 10.        */
        
        
        if (cantidad1<=cantBodega)
        {
            System.out.println("No se requiere realizar pedido al proveedor");  
            System.out.printf("Faltan %d por vender para requirir pedido al proveedor\n",cantBodega-cantidad1); 

            if((cantBodega-cantidad1)<10)
            {
                System.out.println("Alerta se aproxima la solicitud de pedido al proveedor");    
            }
        }
        else
        {
            System.out.println("Se requiere realizar pedido al proveedor");  
        }        
    }    
}
