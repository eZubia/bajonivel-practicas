package mx.uach.bajonivel.escuela.models;

import mx.uach.bajonivel.escuela.interfases.IAccionesPersona;

/**
 * Modelo que ejemplifica a un maestro.
 * 
 * @author Erik David Zubia Hernández
 * @since 20/Agosto/2016
 * @version 1.0
 */
public class Maestro extends Empleado implements IAccionesPersona{

    /**
     * Describe como llega un {@code Maestro} a la escuela.
     * 
     * @return {@code String} describiendo la forma en como llega a la escuela
     */
    @Override
    public String llegarEscuela() {
        return "Voy en carro o camion";
    }

}
