package herencia.clases;

import java.util.Scanner;

public class Operaciones {

    protected int valorUno;
    protected int valorDos;
    protected int resultado;

    Scanner entrada=new Scanner(System.in);

    public void pedirDatos()
    {
        System.out.println("Ingrese el primer valor");
        valorUno= Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese el segundo valor");
        valorDos= Integer.parseInt(entrada.nextLine());

    }

    public int mostrarResultado()
    {
        return resultado;
    }
    
}
