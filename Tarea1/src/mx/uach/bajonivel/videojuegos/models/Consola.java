package mx.uach.bajonivel.videojuegos.models;

import java.sql.Blob;
import mx.uach.bajonivel.videojuegos.models.enums.ECompania;

/**
 * Modelo que ejemplifica a una consola de videojuegos.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Consola {
  
    private String nombre;
    private String descripcion;
    private Blob imagen;
    private Boolean multijugador;
    private ECompania dueno;
}
