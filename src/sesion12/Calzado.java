package sesion12;

public class Calzado extends Producto implements vista {

    private int talla;

    
    public Calzado(int codigo, String descripcion, int precioCompra, int precioVenta, int cantidadBodega,
            int cantidadMinRequerida, int cantidadMaxPermitida, int talla) {
        super(codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinRequerida,
                cantidadMaxPermitida);
        this.talla = talla;
    }

    @Override
    public boolean solicitar() {
        if(cantidadBodega<cantidadMinRequerida)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }

    @Override
    public double totalPagar(double unidades) {

        
        return unidades*precioCompra;
    }

    @Override
    public void mostrarLite1() {
       
        System.out.println(getCodigo()+ "-"+ getDescuento());
    }

    @Override
    public void mostrarLite2() {
        System.out.println(getCodigo()+ "-"+ getDescuento()+"-"+getPrecioCompra()+"-"+getPrecioVenta());
        
    }

    @Override
    public void mostrarTodo() {
        
        System.out.println(getCodigo()+ "-"+ getDescuento()+"-"+getPrecioCompra()+"-"+getPrecioVenta()+"-"+getCantidadBodega()+"-"+getCantidadMinRequerida()+"-"+getCantidadMaxPermitida());
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }  
        
}
