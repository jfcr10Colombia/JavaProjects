package herencia.main;

import herencia.clases.Resta;
import herencia.clases.Suma;

public class Principal {

    public static void main(String[] args) {
        Suma sumar=new Suma();
        Resta restar=new Resta();

        System.out.println("Datos para la suma");
        sumar.pedirDatos();
        sumar.sumar();
        System.out.println("El resultado de la suma es: "+ sumar.mostrarResultado());

        System.out.println("Datos para la resta");
    
        restar.pedirDatos();
        restar.restar();
        System.out.println("El resultado de la resta es: "+ restar.mostrarResultado());

        
    }
    
}
