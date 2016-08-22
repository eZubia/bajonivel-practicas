package mx.uach.bajonivel.tienda.models;

import mx.uach.bajonivel.tienda.interfases.IPendientesTienda;

/**
 *  Modelo que ejemplifica a un Gerente de una tienda.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Gerente extends Personal implements IPendientesTienda{
    
    /**
     * Realiza la autorizacion de un documento segun si gerarquia organica
     */
    @Override
    public void autorizarPapel() {
        System.out.println("Firmo el documento");
    }

    /**
     * Realiza las tareas diarias correspondientes
     */
    @Override
    public void atenderTareasDiarias() {
        System.out.println("Firmo y autorizo papeles todo el dia.");
    }
    
}
