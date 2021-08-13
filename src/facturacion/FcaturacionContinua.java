package facturacion;

import java.util.Scanner;

public class FcaturacionContinua {
    
    public static void main(String[] args) {
        
        byte posicion=0;
        Scanner entrada=new Scanner(System.in);

        int total=0;
        String continuar;

        do{
            System.out.println("Ingrese los diferentes tipos de productos que requiere:\n");
            int productos=Integer.parseInt(entrada.nextLine());
            int[]cantidad=new int[productos];
            int[]Valor=new int[productos];

            while(productos>0)
            {
                System.out.printf("Ingrese la cantidad del producto %d que requiere :\n",posicion);  
                cantidad[posicion]=Integer.parseInt(entrada.nextLine());
                System.out.printf("Ingrese el valor del producto %d que requiere :\n",posicion);  
                Valor[posicion]=Integer.parseInt(entrada.nextLine());
                posicion++;
                productos--;
            }
    
            for (int f=0; f<posicion;f++)
            {            
                System.out.printf("cantidad producto %d: "+cantidad[f]+" "+"valor producto %d: "+  Valor[f]+ "\n",f,f);  
                
                total=total+(cantidad[f]*Valor[f]);
            } 
                

                System.out.printf("IDesea ingresar el pedido de otro cliente SI(S)/NO(N)?:");
                continuar=entrada.nextLine();
                if("s".equalsIgnoreCase(continuar))
                {
                    continuar="y";
                    posicion=0;
                }
                else
                {
                    continuar="n";
                }                


        }while(continuar=="y");
            System.out.println("Total a facturar es: "+total);
        
    }
    
    
    
}
