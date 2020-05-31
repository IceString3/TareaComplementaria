package com.danny.tienda;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Este programa implementa una aplicación para añadir artículos predeterminados
 * a una tienda, mostrarlos, añadirlos, buscarlos y eliminarlos.
 * Versión de la JDK con la que se ha compilado y ejecutado: 13.0.2
 * Plugin para realizar la compilación: maven-compiler-plugin
 * @author Daniel Montesdeoca
 * @version 1.0
 */

public class Main {

    private static Scanner scanner = new Scanner (System.in);
    private static Tienda t = new Tienda();
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        int opcion;
        menu();
        // Creamos tienda, llenamos el almacen y mostramos el inventario:
        do {
            logger.log (Level.INFO, "Selecciona una opción: ");
            opcion = scanner.nextInt ();
            scanner.nextLine ();
            switch (opcion) {
                case 0:
                    menu();
                    break;
                case 1:
                    t.llenarAlmacen ();
                    break;
                case 2:
                    t.mostrarInventario ();
                    break;
                case 3:
                    addArticle ();
                    break;
                case 4:
                    remove ();
                    break;
                case 5:
                    search ();
                    break;
                case 6:
                    logger.log(Level.INFO, "Saliendo...");
                    break;
                default:
                    logger.log(Level.INFO, "Opción desconocida");
            }
        } while (opcion != 6);
    }

    private static void menu() {
        logger.log(Level.INFO, "1. Llenar almacén");
        logger.log(Level.INFO, "2. Mostrar inventario");
        logger.log(Level.INFO, "3. Añadir artículo");
        logger.log(Level.INFO, "4. Eliminar artículo");
        logger.log(Level.INFO, "5. Buscar artículo");
        logger.log(Level.INFO, "6. Salir");
    }

    private static void addArticle() {
        logger.log(Level.INFO, "Introduzca el nombre del artículo: ");
        String name = scanner.nextLine ();
        logger.log(Level.INFO, "Introduzca el precio del artículo: ");
        double cost = scanner.nextDouble ();
        scanner.nextLine ();
        logger.log(Level.INFO, "Introduzca las unidades del artículo: ");
        int cantidad = scanner.nextInt ();
        scanner.nextLine ();
        if (t.addArticle (name, cost, cantidad)) {
            logger.log(Level.INFO, "Artículo añadido.");
        } else {
            logger.log(Level.INFO, "No se ha podido añadir el artículo.");
        }
    }

    private static void remove() {
        logger.log(Level.INFO, "Introduce el nombre del artículo que se desea eliminar: ");
        String nombre = scanner.nextLine ();
        if (t.removeArticle (nombre)) {
            logger.log(Level.INFO, "Se ha eliminado el artículo " + nombre);
        } else {
            logger.log(Level.INFO, "No se ha encontrado el artículo");
        }
    }

    private static void search() {
        logger.log(Level.INFO, "Introduce el nombre del artículo que se desea buscar: ");
        String nombre = scanner.nextLine ();
        Articulo art = t.buscar (nombre);
        if (art != null) {
            logger.log(Level.INFO, "Nombre: {0} \nPrecio: {1} \nCantidad: {2}",
                        new Object []{art.getNombre (), art.getPrecio (), art.getCantidad ()});
        } else {
            logger.log(Level.INFO, "No se pudo encontrar el artículo con nombre {0}",
                        new Object[]{nombre});
        }
    }
}
