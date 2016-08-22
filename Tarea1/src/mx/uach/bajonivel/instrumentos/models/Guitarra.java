package mx.uach.bajonivel.instrumentos.models;

import mx.uach.bajonivel.instrumentos.interfases.IIntrumentos;

/**
 * Modelo que ejemplifica a una guitarra.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public abstract class Guitarra extends Intrumento implements IIntrumentos{

    /**
     * Forma en la que se compone con este instrumento.
     * 
     * @return {@code String} manera con la que compone musica
     */
    @Override
    public String componer() {
        return "Notas aleatorias";
    }
    
}
