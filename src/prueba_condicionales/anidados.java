//package prueba_condicionales;
import java.util.*;
public class anidados 
{
    public static void main(String[] args) 
    {
        Scanner dato=new Scanner(System.in);
        String luz="",peaton="";
        Boolean condicion=true;
        System.out.println("Ingrese el color en que esta actualmente el semaforo: \n");
        luz=dato.nextLine();
        System.out.println("Se encuentra un peaton a en via? [SI] o [NO] \n");
        peaton=dato.nextLine();
        if(peaton.equalsIgnoreCase("si"))
            condicion=true;        
        else        
            condicion=false;
        if (luz.equalsIgnoreCase("verde"))
        {
            if (condicion)            
                System.out.println("--PARE--");
            else            
                System.out.println("--SIGA--");            
        }
        else if(luz.equalsIgnoreCase("amarillo"))
        {
            if (condicion)            
                System.out.println("--PARE--");            
            else            
                System.out.println("--PRECAUCIÓN--");            
        }
        else if(luz.equalsIgnoreCase("rojo"))
        {
            System.out.println("--PARE--");
        }
        else
        {
            System.out.println("El color no es valido");
        }
        dato.close();        
    }
}
