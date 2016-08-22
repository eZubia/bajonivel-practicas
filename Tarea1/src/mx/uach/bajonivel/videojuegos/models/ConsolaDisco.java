package mx.uach.bajonivel.videojuegos.models;

import mx.uach.bajonivel.videojuegos.interfases.IConsolas;

/**
 * Modelo que ejemplifica a las consolas de discos.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public abstract class ConsolaDisco extends Consola implements IConsolas{

    /**
     * Dicta como se introduce un juego a la consola.
     */
    @Override
    public void introducirJuego() {
        System.out.println("Introducir disco en la apertura");
    }

    /**
     * Dicta en como se juega la consola.
     */
    @Override
    public void jugar() {
        System.out.println("Tomar el control y apretar botones");
    }
    
}
