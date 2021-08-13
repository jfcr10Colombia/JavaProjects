import java.util.ArrayList;


public class Hospital {
    private String nombre;
    ArrayList<Empleado>empleados=new ArrayList<>();

    public static double liquidarNominaEmpleado(Empleado empleado)
    {
        return (empleado.getSalario()-(empleado.getSalario()*0.08));
       
    }

    public static double liquidarSaludEmpleado(Empleado empleado)
    {
        return (empleado.getSalario()*0.085+empleado.getSalario()*0.12+empleado.getSalario()*0.00522);
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
