package mx.uach.bajonivel.escuela.models;

import mx.uach.bajonivel.escuela.interfases.IAccionesPersona;

/**
 * Modela la estructura de un Empleado de una escuela.
 * 
 * @author Erik David Zubia Hernández.
 * @since 20/Agosto/2016
 * @version 1.0
 */
public abstract class Empleado implements IAccionesPersona{

    private String numEmpleado;

    /**
     * Describe a manera en como habla un {@code Empleado};
     * 
     * @return {@code String} lo que diria un empleado
     */
    @Override
    public String hablar() {
        return "Soy un empleado muy bueno";
    }

    /**
     * Devuelve el objeto para identificarse dentro de la escuela.
     * 
     * @return {@code String} correpondiente al numero de Empleado 
     */
    @Override
    public String darNumeroIdentificacion() {
        return numEmpleado;
    }

    /**
     * Devuelve el numero de empleado correspondiente.
     * 
     * @return {@code String} con el numero de empleado
     */
    public String getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Añade el numero de empleado correspondiente.
     */
    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    
    
}
