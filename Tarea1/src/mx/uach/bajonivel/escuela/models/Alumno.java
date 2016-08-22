package mx.uach.bajonivel.escuela.models;

import mx.uach.bajonivel.escuela.interfases.IAccionesPersona;

/**
 * Modelo que ejemplifica a un alumno de una escuela.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public abstract class Alumno extends Persona implements IAccionesPersona{

    private String matricula;

    /**
     * Retorna una frase que diria un alumno.
     * 
     * @return {@code String} una frase de un {@code Alumno}
     */
    @Override
    public String hablar() {
        return "Hola Como estas? Como te fue de vacaciones?";
    }

    /**
     * Retorna la matricula correpondiente al alumno.
     * 
     * @return {@code String} de la matrucula correspondinete
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Asigna la matricula correpondiente al alumno.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}
