//preuba jfcr 10/08/2021

//package reto4;


public class Principal {

    public static void main(String[] args) {
        /* Empleado prueba=new Empleado("jony", "prueba", 1200000);
        System.out.println("parafiscales: "+ Hospital.liquidarParafiscalesEmpleado(prueba));
        System.out.println("prestaciones: "+ Hospital.liquidarPrestacionesEmpleado(prueba)); */
       
        Doctor doctor1=new Doctor("jony","Termino fijo",1800000,"Alegologia");
        System.out.println("costo Doctor Por Contrato Indefinido :"+ Hospital.costoDoctorPorContratoIndefinido(doctor1));

        System.out.println("costo Doctor Por Contrato Fijo :"+ Hospital.costoDoctorPorContratoFijo(doctor1,"2020-01-01","2020-12-30"));

        System.out.println("costo Doctor Por Prestacion de Servicios :"+ Hospital.costoDoctorPorContratoPorPrestaciones(doctor1));
        

    }

    
}
