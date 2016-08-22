package mx.uach.bajonivel.instrumentos.models;

import mx.uach.bajonivel.instrumentos.interfases.IIntrumentos;

/**
 * Modelo que ejemplifica a un saxofon
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Saxofon extends Intrumento implements IIntrumentos{

    /**
     * Forma en la que emite sonido.
     * 
     * @return {@code String} forma en la que emite sonido  
     */
    @Override
    public String emitirSonido() {
        return "Sonido de saxofon";
    }

    /**
     * Forma en la que se compone con este instrumento.
     * 
     * @return {@code String} manera con la que compone musica
     */
    @Override
    public String componer() {
        return "Escala de mayores";
    }
    
}
