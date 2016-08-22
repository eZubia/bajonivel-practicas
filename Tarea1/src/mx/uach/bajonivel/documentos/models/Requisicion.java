package mx.uach.bajonivel.documentos.models;

import mx.uach.bajonivel.documentos.interfases.IDocumentos;
import mx.uach.bajonivel.documentos.models.enums.EEstado;

/**
 * Modelo que ejemplifica a una requisicion.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agoto/2016
 * @version 1.0
 */
public class Requisicion extends Documento implements IDocumentos{

    /**
     * Froma de firmar el documento
     */
    @Override
    public void firmar() {
        System.out.println("Nececito firmarme por el due;o de la oficina.");
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
