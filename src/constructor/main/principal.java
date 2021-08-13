package constructor.main;

import javax.swing.text.StyledEditorKit;

import constructor.Empleado;
import constructor.Gerente;

public class principal {

    public static void main(String[] args) {
        Gerente gerente1= new Gerente("jony", 2400000, "Ingenieria");
        System.out.println(gerente1.detalles());

        Empleado empleado1=new Empleado("fredy", 1200000);
        System.out.println(empleado1.detalles());

        
    }

    
}
