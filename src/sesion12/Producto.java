package sesion12;
/*



*/ 

public abstract class Producto {

    protected int codigo;
    protected String descripcion;
    protected int precioCompra;
    protected int precioVenta;
    protected int cantidadBodega;
    protected int cantidadMinRequerida;
    protected int cantidadMaxPermitida;
    protected static double descuento=0.01;
    public Producto(int codigo, String descripcion, int precioCompra, int precioVenta, int cantidadBodega,
            int cantidadMinRequerida, int cantidadMaxPermitida) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinRequerida = cantidadMinRequerida;
        this.cantidadMaxPermitida = cantidadMaxPermitida;
    }

    public abstract boolean solicitar(); 
    public abstract double totalPagar(double unidades);

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinRequerida() {
        return cantidadMinRequerida;
    }

    public void setCantidadMinRequerida(int cantidadMinRequerida) {
        this.cantidadMinRequerida = cantidadMinRequerida;
    }

    public int getCantidadMaxPermitida() {
        return cantidadMaxPermitida;
    }

    public void setCantidadMaxPermitida(int cantidadMaxPermitida) {
        this.cantidadMaxPermitida = cantidadMaxPermitida;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        Producto.descuento = descuento;
    }  
  
}
