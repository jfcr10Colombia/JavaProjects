//package reto5;

import java.util.ArrayList;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


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


    public static double costoDoctorPorContratoIndefinido(Empleado doctor)
    {
        double prestaciones=liquidarPrestacionesEmpleado(doctor);
        double parafiscales=liquidarParafiscalesEmpleado(doctor);
        double sal40=doctor.getSalario()*0.40;
        double salud=sal40*0.125;
        double pension=sal40*0.16;
        return prestaciones+parafiscales+salud+pension+doctor.getSalario()+29196;        

    }

    public static double costoDoctorPorContratoFijo(Empleado doctor,String ingreso,String retiro)
    {

        LocalDate fecha_ingreso=LocalDate.parse(ingreso);
        LocalDate fecha_retiro=LocalDate.parse(retiro);
        long dias_trabajados=ChronoUnit.DAYS.between(fecha_ingreso, fecha_retiro);
        double parafiscales=liquidarParafiscalesEmpleado(doctor);

        double sal40=doctor.getSalario()*0.40;
        double salud=sal40*0.125;
        double pension=sal40*0.16;

        long prima=(doctor.getSalario()*dias_trabajados)/360;
        long cesantias=(doctor.getSalario()*dias_trabajados)/360;
        double interes_cesantias=(cesantias*dias_trabajados*0.12)/360;
        long vacaciones=(doctor.getSalario()*dias_trabajados)/720;

        return parafiscales+prima+cesantias+interes_cesantias+vacaciones+doctor.getSalario()+salud+pension+17484786.79;

    }

    public static double costoDoctorPorContratoPorPrestaciones(Empleado doctor)
    {
            return doctor.getSalario();

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
