package POO.OBJETO1;

public class Producto {
    
    protected static int codigo;
    protected static  int precioCompra;
    protected static int precioVenta;
    protected static int cantidadBodega;
    protected static int cantidadMinimaBodega;
    protected static int cantidadMaxPermitida;
    protected static double porcentajeDescuento;
    

    /* public boolean solicitarPedido()
    {
        int cantidadActual=getCantidadMinimaBodega();
            if cantidadActual
        return 5;
    }

    public int calcularTotalPagar()
    {
        return 5;
    } */

    public Producto( int codigo,int precioCompra,int precioVenta,int cantidadBodega,int cantidadMinimaBodega,int cantidadMaxPermitida, double porcentajeDescuento) 
    {
        setCodigo(codigo);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
        setCantidadBodega(cantidadBodega);
        setCantidadMaxPermitida(cantidadMaxPermitida);
        setCantidadMinimaBodega(cantidadMinimaBodega);
        setPorcentajeDescuento(porcentajeDescuento);
    }

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Producto.codigo = codigo;
    }

    public static int getPrecioCompra() {
        return precioCompra;
    }

    public static void setPrecioCompra(int precioCompra) {
        Producto.precioCompra = precioCompra;
    }

    public static int getPrecioVenta() {
        return precioVenta;
    }

    public static void setPrecioVenta(int precioVenta) {
        Producto.precioVenta = precioVenta;
    }

    public static int getCantidadBodega() {
        return cantidadBodega;
    }

    public static void setCantidadBodega(int cantidadBodega) {
        Producto.cantidadBodega = cantidadBodega;
    }

    public static int getCantidadMinimaBodega() {
        return cantidadMinimaBodega;
    }

    public static void setCantidadMinimaBodega(int cantidadMinimaBodega) {
        Producto.cantidadMinimaBodega = cantidadMinimaBodega;
    }

    public static int getCantidadMaxPermitida() {
        return cantidadMaxPermitida;
    }

    public static void setCantidadMaxPermitida(int cantidadMaxPermitida) {
        Producto.cantidadMaxPermitida = cantidadMaxPermitida;
    }

    public static double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public static void setPorcentajeDescuento(double porcentajeDescuento) {
        Producto.porcentajeDescuento = porcentajeDescuento;
    }

    

   



}
