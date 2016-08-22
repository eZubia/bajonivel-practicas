package mx.uach.bajonivel.ropa.models;

import mx.uach.bajonivel.ropa.interfases.IRopa;

/**
 * Modelo que ejemplifica a una camisa.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Camisa extends Ropa implements IRopa{
    
    /**
     * Forma de lavar.
     */
    @Override
    public void lavar() {
        System.out.println("Colocar en lavadora a temperatura media.");
    }

    /**
     * Froma de poner.
     */
    @Override
    public void poner() {
        System.out.println("Colocar los brazos en las mangas, estirar los brazos hacia adelante y abrochar botones.");
    }

    /**
     * Forma de secar.
     */
    @Override
    public void secar() {
        System.out.println("Colgar en un gancho en la sombra.");
    }
}
