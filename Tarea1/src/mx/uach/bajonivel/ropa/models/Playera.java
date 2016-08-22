package mx.uach.bajonivel.ropa.models;

import mx.uach.bajonivel.ropa.interfases.IRopa;

/**
 * Modelo que ejemplifica a una playera de hombre.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Playera extends Ropa implements IRopa{

    /**
     * Forma de lavar.
     */
    @Override
    public void lavar() {
        System.out.println("Colocar en lavadora.");
    }

    /**
     * Froma de poner.
     */
    @Override
    public void poner() {
        System.out.println("Colocar los brazos en las mangas, introducir la cabeza en el hoyo que corresponde a la cabeza"
                + "jalar hacia abajo.");
    }

    /**
     * Forma de secar.
     */
    @Override
    public void secar() {
        System.out.println("Meter en secadora o colgar en un gancho.");
    }
    
}
