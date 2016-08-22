package mx.uach.bajonive.acuario.models;

import mx.uach.bajonive.acuario.interfases.IPescados;

/**
 * Modela la estructura basica de un tiburon.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public abstract class Tiburon implements IPescados{

    /**
     * Retorna la forma en como duerme un tiburon.
     * 
     * @return {@code String} con la forma en que duerme un tiburon
     */
    @Override
    public String dormir() {
        return "No duermo, siempre estoy despierto.";
    }
    
}
