package mx.uach.bajonivel.documentos.models;

import java.util.Date;
import mx.uach.bajonivel.documentos.models.enums.EEstado;

/**
 * Modelo que ejemplifica un documento.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Documento {
    
    private Date fechaCreacion;
    private String condiciones;
    private String descripcion;
    private String destinatario; 
    private String nombreSolicitante;
    private EEstado estado;

    /**
     * Devuelve el estado en el que se encuentra el docuemnto.
     * 
     * @return {@code EEstado} estado actual 
     */
    public EEstado getEstado() {
        return estado;
    }

    /**
     * Asigna el estado en el que se encuentra el docuemnto.
     * @param estado {@code EEstado} actual del documento
     */
    public void setEstado(EEstado estado) {
        this.estado = estado;
    }
    
    
}
