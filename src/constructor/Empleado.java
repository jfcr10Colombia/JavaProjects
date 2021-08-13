package constructor;
// clase padre
public class Empleado {

    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre,double sueldo)
    {
        setNombre(nombre);
        setSueldo(sueldo);

    }

    public String detalles()
    {
        return "Nombre: " + this.nombre + "\n" + "sueldo: " + this.sueldo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
