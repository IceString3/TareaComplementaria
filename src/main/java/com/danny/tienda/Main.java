package com.danny.tienda;

import java.util.Scanner;

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

    public static void main(String[] args) {

        int opcion;
        menu();
        // Creamos tienda, llenamos el almacen y mostramos el inventario:
        do {
            System.out.println ("Selecciona una opción.");
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
                    System.out.println ("Saliendo...");
                    break;
                default:
                    System.out.println ("Opción desconocida");
            }
        } while (opcion != 6);
    }

    private static void menu() {
        System.out.println ("1. Llenar almacén");
        System.out.println ("2. Mostrar inventario");
        System.out.println ("3. Añadir artículo");
        System.out.println ("4. Eliminar artículo");
        System.out.println ("5. Buscar artículo");
        System.out.println ("6. Salir");
    }

    private static void addArticle() {
        System.out.println ("Introduzca el nombre del artículo: ");
        String name = scanner.nextLine ();
        System.out.println ("Introduzca el precio del artículo: ");
        double cost = scanner.nextDouble ();
        scanner.nextLine ();
        System.out.println ("Introduzca las unidades del artículo: ");
        int cantidad = scanner.nextInt ();
        scanner.nextLine ();
        if (t.addArticle (name, cost, cantidad)) {
            System.out.println ("Artículo añadido.");
        } else {
            System.out.println ("No se ha podido añadir el artículo.");
        }
    }

    private static void remove() {
        System.out.println ("Introduce el nombre del artículo que se desea eliminar: ");
        String nombre = scanner.nextLine ();
        if (t.removeArticle (nombre)) {
            System.out.println ("Se ha eliminado el artículo " + nombre);
        } else {
            System.out.println ("No se ha encontrado el artículo");
        }
    }

    private static void search() {
        System.out.println ("Introduce el nombre del artículo que se desea buscar: ");
        String nombre = scanner.nextLine ();
        Articulo art = t.buscar (nombre);
        if (art != null) {
            System.out.println ("Nombre: " + art.getNombre () + "\nPrecio: " +
                    art.getPrecio () + "\nCantidad: " + art.getCantidad ());
        } else {
            System.out.println ("No se pudo encontrar el artículo con nombre \"" + nombre + "\"");
        }
    }
}
