package mx.uach.bajonivel.documentos.models;

import mx.uach.bajonivel.documentos.interfases.IDocumentos;
import mx.uach.bajonivel.documentos.models.enums.EEstado;

/**
 * Modelo que ejemplifica a una constancia de estudio.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class ConstanciaEstudio extends Documento implements IDocumentos{
    
    /**
     * Froma de firmar el documento
     */
    @Override
    public void firmar() {
        this.setEstado(EEstado.VALIDADO);
        System.out.println("Colocar sello de la escuela");
    }

    /**
     * Forma de cancelar el documento.
     */
    @Override
    public void cancelar() {
        this.setEstado(EEstado.ELIMINADO);
        System.out.println("Se pone en la basura");
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
