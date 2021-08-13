//this is a test

public class Producto {

    protected int codigo;
    protected int precioCompra;
    protected int precioVenta;
    protected int cantidadBodega;
    protected int cantidadMinima;
    protected int cantidadMaxima;


    // public boolean SolicitarPedido()
    // {

    // }  

    // public int CalcularTotalPagar()
    // {

    // }

    


    public Producto(int codigo,int precioCompra,int precioVenta,int cantidadBodega,int cantidadMinima,int cantidadMaxima) {
        setCodigo(codigo);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setCantidadBodega(cantidadBodega);
        setCantidadMinima(cantidadMinima);
        setCantidadMaxima(cantidadMaxima);
    }


    public int getCantidadBodega() {
        return cantidadBodega;
    }


    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }


    public int getCantidadMinima() {
        return cantidadMinima;
    }


    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }


    public int getCantidadMaxima() {
        return cantidadMaxima;
    }


    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    //sobre escribe el metodo que retorna el contenido de una posicion de memoria no la direccion de la misma
    @Override
    public String toString() {

        String producto="---------------------------\n"+"codigo: "+ getCodigo()+ "\n "+"Precio Compra: "+ getPrecioCompra()+ "\n "+"Precio Venta: "+ getPrecioVenta()+ "\n "+"Cantidad en Bodega: "+ getCantidadBodega()+ "\n "+"Cantidad Minima: "+ getCantidadMinima()+ "\n "+"Cantidad Maxima: "+ getCantidadMaxima();
        return producto;
    }
    
}


