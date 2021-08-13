package sesion12;

import java.util.ArrayList;
import java.util.Scanner;

import POO.OBJETO1.Producto;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ArrayList<Producto>vestir=new ArrayList<>();
        ArrayList<Producto>zapatos=new ArrayList<>();
        
        System.out.println("Digite la cantidad de productos de calzado: ");
        int numeroprendas=Integer.parseInt(entrada.nextLine());
        
        Prenda productosP[]=new Prenda[numeroprendas];

        for(int i=0;i<numeroprendas;i++)
        {
            System.out.println("Digite el codigo del producto");
            int codigop=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite precio de compra del producto");
            int preciocp=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite precio de venta del producto");
            int preciovp=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite cantidad en Bodega del producto");
            int cantidadB=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite cantidad minina requerida en Bodega del producto");
            int cantidadmB=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite cantidad maxima permitida en inventario de Bodega del producto");
            int cantidadMaxB=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite la descripcion del  producto");
            String descripcionP=entrada.nextLine();

            System.out.println("Digite la talla del producto");
            String tallaP=entrada.nextLine();

            System.out.println("Digite si el producto se puede planchar? 1-> Si 0->No");
            String resPlanchar=entrada.nextLine();
            
            if(resPlanchar.equalsIgnoreCase("1"))
            {
                productosP[i]=new Prenda(codigop, descripcionP, preciocp, preciovp, cantidadB, cantidadmB, cantidadMaxB, tallaP, true);
            }
            else
            {
                productosP[i]=new Prenda(codigop, descripcionP, preciocp, preciovp, cantidadB, cantidadmB, cantidadMaxB, tallaP, true);
            }

        }

        System.out.println("Digite la cantidad de productos de calzado: ");
        int tallacalzado=Integer.parseInt(entrada.nextLine());

        Calzado productosC[]=new Calzado[tallacalzado];

        for(int i=0;i<numeroprendas;i++)
        {
            System.out.println("Digite el codigo del producto");
            int codigop=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite precio de compra del producto");
            int preciocp=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite precio de venta del producto");
            int preciovp=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite cantidad en Bodega del producto");
            int cantidadB=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite cantidad minina requerida en Bodega del producto");
            int cantidadmB=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite cantidad maxima permitida en inventario de Bodega del producto");
            int cantidadMaxB=Integer.parseInt(entrada.nextLine());

            System.out.println("Digite la descripcion del  producto");
            String descripcionP=entrada.nextLine();

            System.out.println("Digite la talla del producto");
            int tallaP=Integer.parseInt(entrada.nextLine());            
            
            productosC[i]=new Calzado(codigop, descripcionP, preciocp, preciovp, cantidadB, cantidadmB, cantidadMaxB, tallaP);
            
        }


        System.out.println("");
        boolean salir=false;

        do{
            System.out.println("Menu de opciones: \n 1)Consutar producto \n 2)Verificar productos a pedir de calzado y prendas \n 3)Calzado con mayor cantidad de unidades \n 4)Prendas con mayor cantidad de unidades \n 5)Modificar cantidad minima requeridad en Bodega \n 6)Vender producto \n 7)Salir \n Digite la opcion deseada");
            int opcion=Integer.parseInt(entrada.nextLine());
            System.out.println("%n");

            int cp;
            String tp;
            boolean sw;

            switch(opcion)
            {
                case 1:
                    System.out.println("Digite el codigo del producto,\n");
                    cp=Integer.parseInt(entrada.nextLine());
                    System.out.println("Digite el tipo de prodcuto Prenda(P) o Calzado(C)");
                    tp=entrada.nextLine();
                    sw=true;
                    if(tp.equalsIgnoreCase("p"))
                    {
                            for (int i=0;i<numeroprendas;i++)
                            {
                                if(productosP[i].getCodigo()==cp)
                                {
                                    productosP[i].mostrarTodo();
                                    sw=false;
                                    break;
                                }
                                
                            }
                            if(sw)
                            {
                                System.out.println("Codigo no encontrado");
                            }

                    }
                    if(tp.equalsIgnoreCase("p"))
                    {
                            for (int i=0;i<tallacalzado;i++)
                            {
                                if(productosC[i].getCodigo()==cp)
                                {
                                    productosC[i].mostrarTodo();
                                    sw=false;
                                    break;
                                }
                                
                            }
                            if(sw)
                            {
                                System.out.println("Codigo no encontrado");
                            }

                    }
                break;

            }

        }while(!salir);
        entrada.close();


        
        
    }
    
}
