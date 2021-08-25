//preuba jfcr 10/08/2021

//package reto4;

public class Principal {

    public static void main(String[] args) {
        Empleado prueba=new Empleado("jony", "prueba", 1200000);
        System.out.println("parafiscales: "+ Hospital.liquidarParafiscalesEmpleado(prueba));
        System.out.println("prestaciones: "+ Hospital.liquidarPrestacionesEmpleado(prueba));
    }
    
}
