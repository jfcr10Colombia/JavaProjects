//package reto4;

public class Doctor extends Empleado 
{
    protected String especialidad;   
    public Doctor(String nombre, String tipoContrato, int salario,String especialidad) 
    {
        super(nombre, tipoContrato, salario);        
        setEspecialidad(especialidad);
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
