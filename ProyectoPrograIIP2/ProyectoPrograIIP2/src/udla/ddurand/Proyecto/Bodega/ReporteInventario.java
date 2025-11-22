package udla.ddurand.Proyecto.Bodega;

public class ReporteInventario extends Almacen{
    /** Creacion de atributos de la subclase */
    private int productosContados;
    private double ingresos;
    /** Constructores */
    public ReporteInventario() {
    }

    public ReporteInventario(String nombre, double precio, String tipo, String fechaElaboracion, String fechaVencimiento, long capacidadMaxima, long cantidadProducto, String ubicacion, String cantidadMaxima, int productosContados, double ingresos) {
        super(nombre, precio, tipo, fechaElaboracion, fechaVencimiento, capacidadMaxima, cantidadProducto, ubicacion, cantidadMaxima);
        this.productosContados = productosContados;
        this.ingresos = ingresos;
    }

    /** Metodos JAVA*/
    public int getProductosContados() {
        return productosContados;
    }

    public void setProductosContados(int productosContados) {
        this.productosContados = productosContados;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
/** Metodos programador*/

}
