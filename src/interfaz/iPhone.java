public class iPhone extends Telefono implements Gps,Camara{

    //constructores de la clase hija (iPhone) y envio de parametros a la clase padre (Telefono) a travez de super
    
    public iPhone(String marca, String modelo, String serial, String numTelefono) {
        super(marca, modelo, serial, numTelefono);
    }

    public iPhone(String marca, String modelo) {
        super(marca, modelo);
    }
    
    //Se desarrollan todos los metodos de la interface Gps implementada
    @Override
    public void obtenerCoordenadas()
    {
        System.out.println("Implementacion metodo obtener coordenadas dentro de la clase iphone");
    }

    @Override
    public void buscarDireccion()
    {
        System.out.println("Implementacion metodo buscar direccion dentro de la clase iphone");
    }

    //Se desarrollan todos los metodos de la interface Camara implementada
    @Override
    public void apagarFlash()
    {
        System.out.println("Implementacion apagarFlash  dentro de la clase iphone");
    }

    @Override
    public void seleccionarVista()
    {
        System.out.println("Implementacion seleccionar vista  dentro de la clase iphone");
    }

    public void imprimirvelocidadluz()
    {

        System.out.println("Velocidad de la luz: "+ velocidadluz);
    }

    @Override
    public void prendeFlash() {
        System.out.println("Implementacion prenderFlash  dentro de la clase iphone");
        
    }

    

    
}
