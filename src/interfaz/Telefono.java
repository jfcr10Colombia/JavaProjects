public class Telefono {

    //atributos de la clase padre telefono solo pueden ser accesados por la clase padre o por clases que hereden de esta.
    protected String marca;
    protected String modelo;
    protected String serial;
    protected  String numTelefono;

    //constructor de la clase telefono
    public Telefono(String marca,String modelo,String serial,String numTelefono)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.serial=serial;
        this.numTelefono=numTelefono;
    }
    //Polimorfismo de la clase telefono
    public Telefono(String marca,String modelo)
    {
        this.marca=marca;
        this.modelo=modelo;

    }
    //metodos encapsulados para acceder a los atributos de la clase padre Telefono
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    

    
}
