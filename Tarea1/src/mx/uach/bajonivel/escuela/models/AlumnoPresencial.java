package mx.uach.bajonivel.escuela.models;

/**
 * Modelo que ejemplifica a un alumno de modalida presencial.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class AlumnoPresencial extends Alumno{

    /**
     * Retorna la forma en la que llega un alumno precensia a la escuela.
     * 
     * @return {@code String} con la forma en que llega
     */
    @Override
    public String llegarEscuela() {
        return "Voy en camion o carro";
    }

    /**
     * Retorna el numero con el que se identifica en la escuela.
     * 
     * @return {@code String} con la matricula correspondiente al alumno
     */
    @Override
    public String darNumeroIdentificacion() {
        return this.getMatricula();
    }
    
    
    
}
