package mx.uach.bajonivel.documentos.models;

import mx.uach.bajonivel.documentos.interfases.IDocumentos;
import mx.uach.bajonivel.documentos.models.enums.EEstado;

/**
 * Modelo que ejemplifica a un Acta de nacimiento.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class ActaNacimiento extends Documento implements IDocumentos{
    
    /**
     * Froma de firmar el documento
     */
    @Override
    public void firmar() {
        this.setEstado(EEstado.VALIDADO);
        System.out.println("Colocar sello");
    }

    /**
     * Forma de cancelar el documento.
     */
    @Override
    public void cancelar() {
        this.setEstado(EEstado.CANCELADO);
    }

    /**
     * Forma de invalidar el documento
     */
    @Override
    public void invalidar() {
        this.setEstado(EEstado.INVALIDADO);
        System.out.println("Colocar sello de invalido");
    }
    
}
