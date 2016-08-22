package mx.uach.bajonive.acuario.models;

import mx.uach.bajonive.acuario.models.enums.ETipoAlimento;

/**
 * Modelo que ejemplifica a un pescado.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Pescado {
    
    private Integer numDientes;
    private String color;
    private String nombre;
    private String descripcion;
    private ETipoAlimento tipoAlimento;
    private Boolean tineCola;

    /**
     * Constructor vacio de un pescado.
     */
    public Pescado() {
    }
    
}
