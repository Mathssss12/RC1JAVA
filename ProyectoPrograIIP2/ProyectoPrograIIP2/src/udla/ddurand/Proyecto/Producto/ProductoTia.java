package udla.ddurand.Proyecto.Producto;
import udla.ddurand.Proyecto.Bodega.Almacen;
import udla.ddurand.Proyecto.transacciones.Transaccion;

public class ProductoTia {
    /** Creacion de atributos */
    protected int codigo;
    protected String nombre;
    protected double precio;
    protected String tipo;
    protected String fechaElaboracion;
    protected String fechaVencimiento;
    private static int contadorId = 1; // Contador estático para asignar IDs únicos



    /** Creacion de constructores */

    public ProductoTia() {
    }
    public ProductoTia(String nombre, double precio, String tipo, String fechaElaboracion, String fechaVencimiento) {
        this.codigo = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.fechaElaboracion = fechaElaboracion;
        this.fechaVencimiento = fechaVencimiento;
    }


    /** Metodos JAVA */
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setCodigo(int codigoBase) {

    }


/** METODOS PROGRAMADOR */




}
