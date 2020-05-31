package com.danny.tienda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TiendaTest {
    Tienda tienda;

    @BeforeEach
    void setUp() {
        tienda = new Tienda ();
    }

    /**
     * <h1>MostrarInventario</h1>
     * <p>Prueba el método mostrarInventario de Tienda</p>
     */
    @org.junit.jupiter.api.Test
    void mostrarInventario() {
        tienda.llenarAlmacen ();
        assertEquals (6, tienda.mostrarInventario ());
    }

    @org.junit.jupiter.api.Test
    void llenarAlmacen() {
        assertEquals (6, tienda.llenarAlmacen ());
    }

    @org.junit.jupiter.api.Test
    void addArticle() {
        assertTrue (tienda.addArticle ("Mascarilla quirúrgica", 0.96, 105));
        assertTrue (tienda.addArticle ("Gel hidroalcohólico", 6.75, 5));
    }

    @org.junit.jupiter.api.Test
    void addDuplicatedArticle() {
        tienda.addArticle ("Lejía", 4.50, 3);
        assertFalse (tienda.addArticle ("Lejía", 4.50, 3));
    }

    @org.junit.jupiter.api.Test
    void removeArticle() {
        int i;
        tienda.addArticle ("Lejía", 4.50, 3);
        for (i = 0; i < tienda.getArticulos ().size (); i++) {
            String nombre = tienda.getArticulos ().get (i).getNombre ();
            if (nombre.equals ("Lejía")) {
                assertTrue (tienda.removeArticle (nombre));
            }
        }
        assertFalse (tienda.removeArticle ("Detergente"));
    }


    @Test
    void getArticulos() {
        tienda.llenarAlmacen ();
        ArrayList<Articulo> articulos = new ArrayList<> (tienda.getArticulos ());
        if (articulos.equals (tienda.getArticulos ())) {
            assertEquals (tienda.getArticulos ().get (2).getNombre (), articulos.get (2).getNombre ());
        }

    }

    @Test
    void buscar() {
        tienda.llenarAlmacen ();
        assertEquals ("Tres", tienda.buscar ("Tres").getNombre ());
        assertEquals (10.0, tienda.buscar ("Tres").getPrecio ());
        assertEquals (12, tienda.buscar ("Tres").getCantidad ());
    }

    @Test
    void buscarNull() {
        tienda.llenarAlmacen ();
        assertNull (tienda.buscar ("Siete"));
    }
}