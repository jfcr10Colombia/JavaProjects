package herencia2.main;

import java.util.Scanner;

public class Persona {

    protected String nombre;
    protected String apellido;

    Scanner entrada= new Scanner(System.in);

    public void pedirDatos()
    {
        System.out.println("Ingrese nombre");
        nombre=entrada.nextLine();

        System.out.println("Ingrese apellido");
        apellido=entrada.nextLine();
        
        
    }
    
}
