package constructor;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo,String departamento) {
        super(nombre, sueldo);// asigna los parametros que corresponden a la clase padre
        this.departamento=departamento;//asignacion directa por ser parametro de la clase hija
    }
    //sobre escritura de metodo, el mismo metodo esta en la clase padre
    @Override // decorador para indicar que se va a sobreescribir un metodo
    public String detalles()
    {
        return super.detalles() + "\n" + "departamento: "+ this.departamento;//se invoca el metodo detalles sin sobreescribir el mismo

    }


   
    
}
