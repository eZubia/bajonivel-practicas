package mx.uach.bajonivel.videojuegos.models;

/**
 * Modelo que ejemplifica al Xbox One.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class XboxOne extends ConsolaDisco{

    /**
     * Dicta la forma en como se apaga la consola.
     */
    @Override
    public void apagarConsola() {
        System.out.println("Tocando el circulo gris");
    }
    
}
