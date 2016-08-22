package mx.uach.bajonivel.videojuegos.models;

import mx.uach.bajonivel.videojuegos.interfases.IConsolas;

/**
 * Modelo que ejmplifica a las consolas de casets.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public abstract class ConsolaCasets extends Consola implements IConsolas{

    /**
     * Dicta la forma en como se apaga la consola.
     */
    @Override
    public void apagarConsola() {
        System.out.println("Precionar boton de apagado");
    }

    /**
     * Dicta en como se juega la consola.
     */
    @Override
    public void jugar() {
        System.out.println("Apretar botones");
    }
    
}
