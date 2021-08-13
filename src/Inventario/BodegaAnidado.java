package Inventario;

import java.util.Scanner;

public class BodegaAnidado {

    public static void main(String[] args) 
    {
         
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
            /*
            Por el contrario si se debe realizar el pedido, debe solicitar
            las unidades de compra deseadas, el valor de compra del producto y el dinero en caja con el
            fin de validar si es posible realizar la compra.
            */ 

            else
            {
                System.out.println("Se requiere realizar pedido al proveedor");  
                System.out.println("Ingrese la cantidad a solicitar al proveedor del producto A deseada: \n");
                int cantidadDeseada=Integer.parseInt(entrada.nextLine()); 

                System.out.println("Ingrese precio unitario del  producto A deseada: \n");
                int precioUnitario=Integer.parseInt(entrada.nextLine()); 

                System.out.println("Ingrese dinero en Caja disponible: \n");
                int dineroCaja=Integer.parseInt(entrada.nextLine()); 

                if(cantidadDeseada*precioUnitario>dineroCaja)
                {
                    System.out.println("No es posible realizar la compra");
                }
                else
                {
                    System.out.println("Es posible realizar la compra");
                }        

            }        
    }  
      
    
}
