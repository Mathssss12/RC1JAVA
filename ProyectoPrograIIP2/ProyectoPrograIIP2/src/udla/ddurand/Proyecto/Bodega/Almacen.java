package udla.ddurand.Proyecto.Bodega;
import udla.ddurand.Proyecto.Producto.ProductoOrdinario;
import udla.ddurand.Proyecto.Producto.ProductoTia;
public class Almacen extends ProductoTia {
    /** CRECION DE ATRIBUTOS */
    private long capacidadMaxima;
    private long cantidadProducto;
    private String ubicacion;
    private String cantidadMaxima;

    /** CONSTRUCTORES */

    public Almacen() {
    }

    public Almacen(String nombre, double precio, String tipo, String fechaElaboracion, String fechaVencimiento, long capacidadMaxima, long cantidadProducto, String ubicacion, String cantidadMaxima) {
        super(nombre, precio, tipo, fechaElaboracion, fechaVencimiento);
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadProducto = cantidadProducto;
        this.ubicacion = ubicacion;
        this.cantidadMaxima = cantidadMaxima;
    }

    /** METODOS JAVA */
    public long getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(long capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public long getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(long cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(String cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    /** METODOS PROGRAMADOR */

}
