package mx.uach.bajonivel.tienda.models;

import mx.uach.bajonivel.tienda.interfases.IPendientesTienda;

/**
 * Modelo que ejemplifica a un subgerente de una tienda.
 * 
 * @author Erik David Zubia Hernandez.
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class SubGerente extends Personal implements IPendientesTienda{
    
    /**
     * Realiza la autorizacion de un documento segun si gerarquia organica
     */
    @Override
    public void autorizarPapel() {
        System.out.println("Lo mando a mi gerente");
    }

    /**
     * Realiza las tareas diarias correspondientes
     */
    @Override
    public void atenderTareasDiarias() {
        System.out.println("Reviso que todo en la tienda se comporte de la manera correcta.");
    }
    
}
