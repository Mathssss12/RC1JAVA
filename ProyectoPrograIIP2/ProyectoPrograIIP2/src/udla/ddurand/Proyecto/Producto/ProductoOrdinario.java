package udla.ddurand.Proyecto.Producto;

public class ProductoOrdinario extends ProductoTia{
    /** Creacion de atributos de la subclase */
    private int garantiaMeses;
    private String categoria;
    private String disponibilidad;
    private int cantidadP;
    private int demandaAlta;
    private int demandaMedia;
    private int demandaBaja;
    private static int ContadorId = 1;

    /** Constructores */
    public ProductoOrdinario() {
    }



    public ProductoOrdinario(String nombre, double precio, String tipo, String fechaElaboracion, String fechaVencimiento, int garantiaMeses, String categoria, String disponibilidad, int cantidadP, int demandaAlta, int demandaMedia, int demandaBaja) {
        super(nombre, precio, tipo, fechaElaboracion, fechaVencimiento);
        this.garantiaMeses = garantiaMeses;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
        this.cantidadP = cantidadP;
        this.demandaAlta = demandaAlta;
        this.demandaMedia = demandaMedia;
        this.demandaBaja = demandaBaja;
    }



    /** Metodos java */

    /** Metodos java */
    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCantidadP() {
        return cantidadP;
    }

    public void setCantidadP(int cantidadP) {
        this.cantidadP = cantidadP;
    }

    public int getDemandaAlta() {
        return demandaAlta;
    }

    public void setDemandaAlta(int demandaAlta) {
        this.demandaAlta = demandaAlta;
    }

    public int getDemandaMedia() {
        return demandaMedia;
    }

    public void setDemandaMedia(int demandaMedia) {
        this.demandaMedia = demandaMedia;
    }

    public int getDemandaBaja() {
        return demandaBaja;
    }

    public void setDemandaBaja(int demandaBaja) {
        this.demandaBaja = demandaBaja;
    }

    /** Metodos programador*/

}
