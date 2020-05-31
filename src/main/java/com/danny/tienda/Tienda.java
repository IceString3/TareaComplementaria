package com.danny.tienda;

import java.util.ArrayList;

/**
 * En esta clase se incluyen los métodos para manejar artículos en la tienda.
 */
public class Tienda {

    private ArrayList<Articulo> articulos;
    private int numArticulos;

    /**
     * Genera un ArrayList donde se almacenarán los artículos de la tienda.
     */
    public Tienda() {
        articulos = new ArrayList<> ();
    }

    /**
     * <p>Muestra los artículos de la tienda</p>
     * @return Devuelve el número de artículos mostrados
     */
    public int mostrarInventario() {
        int count = 0;
        for (Articulo articulo : articulos) {
            System.out.println ("Nombre: " + articulo.getNombre () + ", " +
                                "Precio: " + articulo.getPrecio () + ", " +
                                "Cantidad: " + articulo.getCantidad ());
            count++;
        }
        return count;
    }

    /**
     * <p>Añade artículos predeterminados a la tienda</p>
     * @return Devuelve el número de artículos añadidos
     */
    public int llenarAlmacen() {
        addArticle ("Cero", 10.0, 12);
        addArticle ("Uno", 20.0, 9);
        addArticle ("Dos", 10.0, 12);
        addArticle ("Tres", 10.0, 12);
        addArticle ("Cuatro", 105.0, 4);
        addArticle ("Cinco", 99.0, 1);
        numArticulos = articulos.size ();
        System.out.println ("Artículos añadidos");
        return numArticulos;
    }

    /**
     * <p>Añade un artículo a la tienda</p>
     * @param name Nombre del artículo
     * @param cost Precio del artículo
     * @param cantidad Unidades del artículo
     * @return Devuelve True si no se encuentra el artículo (lo añade), y False si se encuentra (no lo añade)
     */
    public boolean addArticle(String name, double cost, int cantidad) {
        Articulo articulo = new Articulo (name, cost, cantidad);
        if (find (articulo.getNombre ()) == -1) {
            articulos.add (articulo);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Elimina un artículo de la tienda.
     * @param nombre Nombre del artículo que se desea eliminar
     * @return Devuelve True si se ha eliminado el artículo, o False si no se ha encontrado
     */
    public boolean removeArticle(String nombre) {
        int pos = find (nombre);
        if (pos >= 0) {
            articulos.remove (pos);
            return true;
        } else {
            return false;
        }
    }


    /**
     * <p>Busca un artículo por su nombre</p>
     * @param nombre Nombre del artículo a buscar.
     * @return Devuelve el artículo si se encuentra. Si no, devuelve null.
     */
    public Articulo buscar(String nombre) {
        Articulo articulo = search (nombre);
        if (articulo != null) {
            return articulo;
        } else {
            return null;
        }
    }

    private int find(String nombre) {
        for (int i = 0; i < articulos.size (); i++) {
            if (articulos.get(i).getNombre ().equals (nombre)) {
                return i;
            }
        }
        return -1;
    }

    private Articulo search(String nombre) {
        for (int i = 0; i < articulos.size (); i++) {
            if (articulos.get(i).getNombre ().equals (nombre)) {
                return articulos.get (i);
            }
        }
        return null;
    }

    /**
     * Permite, al devolver un ArrayList de Articulo, escoger un elemento de dicho ArrayList.
     * @return Devuelve un ArrayList de objetos de tipo Articulo.
     */
    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
}
