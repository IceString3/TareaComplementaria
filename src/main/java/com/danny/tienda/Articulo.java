package com.danny.tienda;

/**
 * Esta clase representa los objetos de tipo artículo. Cada artículo tiene su nombre,
 * su precio y su cantidad. Para crear un objeto de tipo artículo se hace de la siguiente manera:
 * <blockquote><pre>
 *     Articulo nombre_artículo = new Articulo(nombre, precio, cantidad)
 * </pre></blockquote>
 */
public class Articulo {

    private String nombre;
    private double precio;
    private int cantidad;

    /**
     * Constructor para Articulo.
     * Se construye un objeto de tipo Articulo
     * @param nombre Nombre del artículo
     * @param precio Precio del artículo
     * @param cantidad Unidades del artículo
     */
    public Articulo(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * getNombre
     * @return Devuelve el nombre del artículo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getPrecio
     * @return Devuelve el precio del artículo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * getCantidad
     * @return Devuelve las unidades del artículo
     */
    public int getCantidad() {
        return cantidad;
    }
}
