//package reto2;

public class Empleado {
    protected int id;
    protected String nombre;  
    protected String tipoContrato;
    protected int salario;
    final protected double auxilio =106454;
    public Empleado(String nombre,String tipoContrato,int salario)
    {
        setNombre(nombre);
        setTipoContrato(tipoContrato);
        setSalario(salario);
    }
  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    public String getTipoContrato() {
        return tipoContrato;
    }
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public double liquidarSalud(Empleado empleado)
    {
        return (empleado.salario*0.085+empleado.salario*0.12+empleado.salario*0.00522);
    } 
   
}
