//package reto4;

import java.util.ArrayList;


public class Hospital {
    protected String nombre;
    ArrayList<Empleado>empleados=new ArrayList<>();
    public static double liquidarNominaEmpleado(Empleado empleado)
    {
        return (empleado.getSalario()-(empleado.getSalario()*0.08));       
    }
    public static double liquidarSaludEmpleado(Empleado empleado)
    {
        return (empleado.getSalario()*0.085+empleado.getSalario()*0.12+empleado.getSalario()*0.00522);
    }

    public static double liquidarPrestacionesEmpleado(Empleado empleado)
    {
        return (empleado.getSalario()*0.0833+empleado.getSalario()*0.0833+empleado.getSalario()*0.0833*0.12+empleado.getSalario()*0.0416);
    }

    public static double liquidarParafiscalesEmpleado(Empleado empleado)
    {
        return (empleado.getSalario()*0.04+empleado.getSalario()*0.03+empleado.getSalario()*0.02);
    }


    public static double costoDoctorPorContratoIndefinido(Doctor doctor)
    {

        

    }

    public static double costoDoctorPorContratoFijo(Doctor doctor,String ingreso,String retiro)
    {


    }

    public static double costoDoctorPorContratoPorPrestaciones(Doctor doctor)
    {



    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
}
