public class Samsung extends Telefono implements Gps,Camara {/// extens usado para herencia, implements usado para interfaces

    //constructores de la clase hija (Samsung) y refencia super a la clase padre (Telefono)
    public Samsung(String marca, String modelo, String serial, String numTelefono) {
        super(marca, modelo, serial, numTelefono);
    }

    public Samsung(String marca, String modelo) {
        super(marca, modelo);
    }

    
    //Se desarrollan todos los metodos de la interface Gps implementada
    @Override
    public void obtenerCoordenadas()
    {
        System.out.println("Implementacion metodo obtener coordenadas dentro de la clase Samsung");
    }

    
    @Override
    public void buscarDireccion()
    {
        System.out.println("Implementacion metodo buscar direccion dentro de la clase  Samsung");
    }
    //Se desarrollan todos los metodos de la interface Camara implementada
    @Override
    public void apagarFlash()
    {
        System.out.println("Implementacion apagarFlash  dentro de la clase Samsung");
    }

    @Override
    public void seleccionarVista()
    {
        System.out.println("Implementacion seleccionar vista  dentro de la clase Samsung"); 
    }

    @Override
    public void prendeFlash()
    {
        System.out.println("Implementacion prenderFlash  dentro de la clase Samsung");
        
    }

   
    
}
