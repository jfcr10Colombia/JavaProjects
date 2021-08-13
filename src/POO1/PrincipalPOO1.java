import java.util.*;


public class PrincipalPOO1 {

    public static void main(String[] args) 
    {
        ArrayList<Producto>productos=new ArrayList<>();
        Scanner entrada=new Scanner(System.in);

        System.out.println("Numero de productos a manejar: ");
        int cantidadProductos=Integer.parseInt(entrada.nextLine());

        while(cantidadProductos>0)
        {
            System.out.println("Ingrese codigo del producto: ");
            int codigo=Integer.parseInt(entrada.nextLine());

            System.out.println("Ingrese precio de compra del producto: ");
            int precioCompra=Integer.parseInt(entrada.nextLine());

            System.out.println("Ingrese precio de venta del producto: ");
            int precioVenta=Integer.parseInt(entrada.nextLine());

            System.out.println("Ingrese cantidad en Bodega del producto: ");
            int cantidadBodega=Integer.parseInt(entrada.nextLine());

            System.out.println("Ingrese cantidad minima requerida del producto: ");
            int cantidadMinRequerida=Integer.parseInt(entrada.nextLine());

            System.out.println("Ingrese cantidad maxima inventario del producto: ");
            int cantidadMaxInventario=Integer.parseInt(entrada.nextLine());

            Producto prueba=new Producto(codigo,precioCompra,precioVenta,cantidadBodega,cantidadMinRequerida,cantidadMaxInventario);
            productos.add(prueba);

            cantidadProductos--;
        }
        
        for (Producto x:productos)
        {
            System.out.println(x);
        }

        //System.out.println(productos.toString());


        entrada.close();

    }
    
}
