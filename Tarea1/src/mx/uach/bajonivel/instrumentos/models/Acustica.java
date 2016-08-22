package mx.uach.bajonivel.instrumentos.models;

/**
 * Modelo que ejemplifica a una guitarra acustica.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Acustica extends Guitarra{

    /**
     * Forma en la que emite sonido.
     * 
     * @return {@code String} forma en la que emite sonido  
     */
    @Override
    public String emitirSonido() {
        return "Sonido suave";
    }
    
}
