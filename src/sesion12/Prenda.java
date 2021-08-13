package sesion12;

public class Prenda extends Producto implements vista{

    private String talla;
    private boolean plancha;

    public Prenda(int codigo, String descripcion, int precioCompra, int precioVenta, int cantidadBodega,
            int cantidadMinRequerida, int cantidadMaxPermitida, String talla, boolean plancha) {
        super(codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinRequerida,
                cantidadMaxPermitida);
        this.talla = talla;
        this.plancha = plancha;
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

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isPlancha() {
        return plancha;
    }

    public void setPlancha(boolean plancha) {
        this.plancha = plancha;
    }

    
    

    
}
