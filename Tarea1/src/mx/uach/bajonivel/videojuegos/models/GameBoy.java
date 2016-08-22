package mx.uach.bajonivel.videojuegos.models;

/**
 * Modelo que ejemplifica al GameBoy.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class GameBoy extends ConsolaCasets{

    /**
     * Dicta como se introduce un juego a la consola.
     */
    @Override
    public void introducirJuego() {
        System.out.println("Por la parte de abajo");
    }
    
}
