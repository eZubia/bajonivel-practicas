package mx.uach.bajonivel.ropa.models;

import mx.uach.bajonivel.ropa.interfases.IRopa;

/**
 * Modelo que ejemplifica a un traje.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Traje extends Ropa implements IRopa{

    /**
     * Forma de lavar.
     */
    @Override
    public void lavar() {
        System.out.println("Solamente en tintorieria.");
    }

    /**
     * Froma de poner.
     */
    @Override
    public void poner() {
        System.out.println("Colocarse el pantalon");
        System.out.println("Tras terminar de ponerse la camisa y la corbata, meter los brazos en las mangas"
                + "y estirar los brazos para adelante.");
    }

    /**
     * Forma de secar.
     */
    @Override
    public void secar() {
        System.out.println("Colgar en un gancho.");
    }
    
}
