package POO.OBJETO1;

import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        ArrayList<Producto>productos=new ArrayList<>();

        System.out.println("Ingrese el numero de productos a manejar: \n");
        int cantidadProductos=Integer.parseInt(entrada.nextLine());

        while(cantidadProductos>0)
        {
            
           // Producto inventario=new Producto(codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinimaBodega, cantidadMaxPermitida, porcentajeDescuento)

        }
    }
    
}
