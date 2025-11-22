package udla.ddurand.Proyecto;

import udla.ddurand.Proyecto.Bodega.ReporteInventario;
import udla.ddurand.Proyecto.Producto.ProductoOrdinario;
import udla.ddurand.Proyecto.Producto.ProductoTia;
import udla.ddurand.Proyecto.Bodega.Almacen;
import udla.ddurand.Proyecto.transacciones.Compra;
import udla.ddurand.Proyecto.transacciones.Transaccion;
import udla.ddurand.Proyecto.transacciones.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaIn {
    private static Scanner scanner = new Scanner(System.in);
    //Listas para almacenar los productos
    private static List<ProductoOrdinario> listaProductosOrd = new ArrayList<>();

    private static List<Almacen> listaAlmacenes = new ArrayList<>();

    private static List<Transaccion> listaTransacciones = new ArrayList<>();

    private static List<Compra> listaCompras = new ArrayList<>();

    private static List<Venta> listaVentas = new ArrayList<>();

    private static List<ReporteInventario> listaReportes = new ArrayList<>();

    private static List<ProductoTia> listaproductos = new ArrayList<>();


    public static void main(String[] args) {
        int opc;
        do {
            mostrarMenu();
            if (scanner.hasNextInt()) {
                opc = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea pendiente

                switch (opc) {
                    case 1:
                        ingresarProducto();
                        break;
                    case 2:
                        gestionBodega();
                        break;
                    case 3:
                        realizarVenta();
                        break;
                    case 4:
                        reabastecerProducto();
                        break;
                    case 5:
                        editarProducto();
                        break;
                    case 6:
                        eliminarProducto();
                        break;
                    case 7:

                        break;
                    case 8:
                        System.out.println("\n Saliendo de la aplicación. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("\n Opción no válida. Inténtelo de nuevo.");
                }
            } else {
                System.out.println("\n Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); // Consumir la entrada no válida
                opc = 0; // Para que el bucle continúe
            }

            if (opc != 8) {
                System.out.println("\n-------------------------------------------");
            }
        } while (opc != 8);
        scanner.close();


    }

    /**
     * --- Métodos de Interfaz ---
     */

    private static void mostrarMenu() {
        System.out.println("\n===========================================");
        System.out.println("          SISTEMA DE GESTIÓN INVENTARIO          ");
        System.out.println("===========================================");
        System.out.println("1.  Ingresar Nuevo Producto");
        System.out.println("2.  Control de Bodega ");
        System.out.println("3.  Realizar venta");
        System.out.println("4.  Reabastecer producto");
        System.out.println("5.  Editar Producto");
        System.out.println("6.  Eliminar Producto");
        System.out.println("7.  Mostrar reporte");
        System.out.println("8. Salir");
        System.out.print(">>> Ingrese su opcion: ");
    }

    /**
     * Métodos de Gestión
     */
    private static void ingresarProducto() {
        System.out.println("\n--- Ingreso de Nuevo Producto ---");
        System.out.println("1. Producto Tia");
        System.out.println("2. Producto Ordinario");
        System.out.print(">>> Seleccione el tipo de producto: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        boolean opcionValida = false;

        if (opcion == 1) {
            ingresarProductoTia();
            opcionValida = true;
        } else if (opcion == 2) {
            IngresarProductosOrdinarios();
            opcionValida = true;
        }

        if (!opcionValida) {
            System.out.println("\n Opción no válida.");
        }
    }

    private static void ingresarProductoTia() {
    }

    /**
     * Metodo de ingreso de producto Tia
     */
    private static void IngresarProductosOrdinarios() {
        if (listaproductos.isEmpty()) {
            System.out.println("\n No hay productos Tia registrados. Primero debe ingresar un Producto Tia.");
            return;
        }

        System.out.println("\n--- Productos Tia Disponibles ---");
        for (int i = 0; i < listaproductos.size(); i++) {
            ProductoTia p = listaproductos.get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + " - Tipo: " + p.getTipo() + " - ID: " + p.getCodigo());
        }

        System.out.print("\n>>> Seleccione el producto Tia base (número): ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion < 1 || opcion > listaproductos.size()) {
            System.out.println("\n Opción no válida.");
            return;
        }

        ProductoTia productoBase = listaproductos.get(opcion - 1);
        int codigoBase = productoBase.getCodigo(); // GUARDAR EL CÓDIGO
        String categoria = productoBase.getTipo();

        System.out.println("\n--- Ingreso de Producto Ordinario ---");
        System.out.println("Categoría asignada: " + categoria);

        System.out.print("\nGarantía en meses: ");
        int garantiaMeses = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nCantidad del producto: ");
        int cantidadP = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDisponibilidad:");
        System.out.println("1. Disponible");
        System.out.println("2. No disponible");
        System.out.print(">>> Seleccione disponibilidad: ");
        int opci = scanner.nextInt();
        scanner.nextLine();

        String disponibilidad;
        if (opci == 1) {
            disponibilidad = "Disponible";
        } else if (opci == 2) {
            disponibilidad = "No disponible";
        } else {
            System.out.println("\nOpción no válida. Se asignará 'No disponible' por defecto.");
            disponibilidad = "No disponible";
        }

        System.out.println("\nNivel de demanda:");
        System.out.println("1. Alta");
        System.out.println("2. Media");
        System.out.println("3. Baja");
        System.out.print(">>> Seleccione nivel de demanda: ");
        int opcionDemanda = scanner.nextInt();
        scanner.nextLine();

        int demandaAlta=0, demandaMedia=0, demandaBaja=0;

        switch (opcionDemanda) {
            case 1:
                demandaAlta = 1;
                break;
            case 2:
                demandaMedia = 1;
                break;
            case 3:
                demandaBaja = 1;
                break;
            default:
                System.out.println("\nOpcion no valida. Se asignará demanda baja por defecto.");
                demandaAlta = 0;
                demandaMedia = 0;
                demandaBaja = 1;
                break;
        }

        ProductoOrdinario nuevoProducto = new ProductoOrdinario(
                productoBase.getNombre(),
                productoBase.getPrecio(),
                productoBase.getTipo(),
                productoBase.getFechaElaboracion(),
                productoBase.getFechaVencimiento(),
                garantiaMeses,
                categoria,
                disponibilidad,
                cantidadP,
                demandaAlta,
                demandaMedia,
                demandaBaja
        );

        // ASIGNAR EL MISMO CÓDIGO DEL ProductoTia
        nuevoProducto.setCodigo(codigoBase);

        listaProductosOrd.add(nuevoProducto);
        System.out.println("\nProducto Ordinario ingresado con éxito. Código asignado: " + nuevoProducto.getCodigo());
    }

    /**
     * Metodo de gestion de Bodega
     */
    private static void gestionBodega() {
        System.out.println("\n--- Gestión de Bodega ---");
        System.out.println("Ingrese la capacidad maxima de la bodega");
        long capacidadMaxima = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Ingrese la cantidad maxima de productos");
        int cantidadMaxima = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la ubicacion de la bodega");
        String ubicacion = scanner.nextLine();

    }

    /**
     * Metodo de realizar venta
     */

    private static void realizarVenta() {
        if (listaProductosOrd.isEmpty()) {
            System.out.println("\n No hay productos ordinarios para vender.");
            return;
        }

        System.out.println("\n--- Realizar Venta ---");
        System.out.print("Ingrese el código del producto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < listaProductosOrd.size(); i++) {
            if (listaProductosOrd.get(i).getCodigo() == codigo) {
                ProductoOrdinario producto = listaProductosOrd.get(i);

                System.out.print("Cantidad a vender: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                if (cantidad <= 0) {
                    System.out.println("\n La cantidad debe ser mayor que cero.");
                    return;
                }

                if (cantidad > producto.getCantidadP()) {
                    System.out.println("\n Stock insuficiente. Cantidad disponible: " + producto.getCantidadP());
                    return;
                }

                double monto = producto.getPrecio() * cantidad;

                System.out.print("Ingrese nombre del cliente: ");
                String cliente = scanner.nextLine();

                System.out.print("Ingrese fecha (dd/mm/aaaa): ");
                String fecha = scanner.nextLine();

                String numeroTransaccion = "V-" + (listaVentas.size() + 1);

                Venta venta = new Venta(fecha, monto, numeroTransaccion, cliente);
                listaVentas.add(venta);
                listaTransacciones.add(venta);

                producto.setCantidadP(producto.getCantidadP() - cantidad);

                encontrado = true;
                System.out.println("\n Venta realizada con éxito. Stock restante: " + producto.getCantidadP());
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("\n No se encontró ningún producto con código " + codigo + ".");
        }
    }

    /**Metodo para rebastecer un producto */
    private static void reabastecerProducto() {
        if (listaProductosOrd.isEmpty()) {
            System.out.println("\n No hay productos ordinarios registrados.");
            return;
        }

        System.out.println("\n--- Reabastecer Producto ---");
        System.out.print("Ingrese el ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < listaProductosOrd.size(); i++) {
            if (listaProductosOrd.get(i).getCodigo() == id) {
                ProductoOrdinario producto = listaProductosOrd.get(i);

                System.out.print("Ingrese la cantidad a reabastecer: ");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                if (cantidad <= 0) {
                    System.out.println("\n La cantidad debe ser mayor que cero.");
                    return;
                }

                int cantidadActual = producto.getDemandaBaja() + producto.getDemandaMedia() + producto.getDemandaAlta();
                producto.setDemandaBaja(cantidadActual + cantidad);

                System.out.print("Ingrese fecha de reabastecimiento (dd/mm/aaaa): ");
                String fecha = scanner.nextLine();

                encontrado = true;
                System.out.println("\n Producto reabastecido con éxito.");
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("\n No se encontró ningún producto con ID " + id + ".");
        }
    }

    /**
     * Metodo para eliminar un producto ordinario
     */
    private static void eliminarProducto() {
        if (listaProductosOrd.isEmpty()) {
            System.out.println("\n No hay productos ordinarios para eliminar.");
            return;
        }

        System.out.println("\n--- Eliminar Producto ---");
        System.out.print("Ingrese el código del producto a eliminar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < listaProductosOrd.size(); i++) {
            if (listaProductosOrd.get(i).getCodigo() == codigo) {
                listaProductosOrd.remove(i);
                encontrado = true;
                System.out.println("\n Producto con código " + codigo + " eliminado con éxito.");
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("\n No se encontró ningún producto con código " + codigo + ".");
        }
    }
    /**
     * Metodo para editar un producto
     */
    private static void editarProducto() {
        if (listaProductosOrd.isEmpty()) {
            System.out.println("\n No hay productos ordinarios para editar.");
            return;
        }

        System.out.println("\n--- Editar Producto ---");
        System.out.print("Ingrese el código del producto a editar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < listaProductosOrd.size(); i++) {
            if (listaProductosOrd.get(i).getCodigo() == codigo) {
                ProductoOrdinario producto = listaProductosOrd.get(i);

                System.out.println("\n--- Datos Actuales ---");
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Cantidad: " + producto.getCantidadP());

                System.out.println("\n--- Ingrese los Nuevos Datos ---");

                System.out.print("Nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();

                System.out.print("Nuevo precio: ");
                double nuevoPrecio = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Nueva cantidad: ");
                int nuevaCantidad = scanner.nextInt();
                scanner.nextLine();

                producto.setNombre(nuevoNombre);
                producto.setPrecio(nuevoPrecio);
                producto.setCantidadP(nuevaCantidad);

                encontrado = true;
                System.out.println("\n Producto actualizado con éxito.");
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("\n No se encontró ningún producto con código " + codigo + ".");
        }
    }


}

