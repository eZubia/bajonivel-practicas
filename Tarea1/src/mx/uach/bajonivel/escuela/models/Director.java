package mx.uach.bajonivel.escuela.models;

import mx.uach.bajonivel.escuela.interfases.IAccionesPersona;

/**
 * Modelo que ejemplifica a un director de una escuela.
 * 
 * @author Erik David Zubia Hernández.
 * @since 20/Agosto/2016
 * @version 1.0
 */
public class Director extends Empleado implements IAccionesPersona{

    /**
     * Describe como llega un {@code Director} a la escuela;
     * 
     * @return {@code String} describiendo como llega a la escuela
     */
    @Override
    public String llegarEscuela() {
        return "Voy en carro";
    }

}
