package mx.uach.bajonivel.tienda.models;

import mx.uach.bajonivel.tienda.interfases.IPendientesTienda;

/**
 * Modelo que ejemplifica a un cajero de una tienda
 * 
 * @author Erik David Zubia Henrnádez
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class Cajero extends Personal implements IPendientesTienda{

    /**
     * Realiza la autorizacion de un documento segun si gerarquia organica
     */
    @Override
    public void autorizarPapel() {
        System.out.println("Lo mando a mi subgerente");
    }

    /**
     * Realiza las tareas diarias correspondientes
     */
    @Override
    public void atenderTareasDiarias() {
        System.out.println("Estoy despachando clientes");
        System.out.println("Limpio mi estacion de trabajo");
        System.out.println("Sonrio mucho");
    }
    
}
