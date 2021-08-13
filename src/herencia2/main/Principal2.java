package herencia2.main;

import java.util.Scanner;



import herencia2.Estudiante;

public class Principal2 {

       public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);


        Estudiante estu=new Estudiante();
        estu.pedirDatos();
        System.out.println("Ingrese el codigo del estudiante");
        estu.setCodigo(entrada.nextLine());

        System.out.println("Ingrese nota 1: ");
        estu.setNota1(Double.parseDouble(entrada.nextLine()));

        System.out.println("Ingrese nota 2: ");
        estu.setNota2(Double.parseDouble(entrada.nextLine()));

        System.out.println("Ingrese nota 3: ");
        estu.setNota3(Double.parseDouble(entrada.nextLine()));

        estu.imprimirPadre();

        System.out.println("Con codigo "+ estu.getCodigo());
        //System.out.println();


        
    }
    
}
