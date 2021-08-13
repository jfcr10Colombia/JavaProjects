public class pruebas {
    public static void main(String[] args) {
        // Empleado prueba=new Empleado("Jony","indefinido",1200000);
        // System.out.println(prueba.liquidarSalud(prueba));
        Doctor doctor1=new Doctor("hugo","termino fijo",1200000,"dermatologia");
        Hospital fun1=new Hospital();
        System.out.println(fun1.liquidarSaludEmpleado(doctor1));
        System.out.println(fun1.liquidarNominaEmpleado(doctor1));
     
    }
    
}
