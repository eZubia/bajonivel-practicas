package mx.uach.bajonivel.tienda.models;

import java.util.Date;
import mx.uach.bajonivel.escuela.models.enums.EEstadoCivil;
import mx.uach.bajonivel.escuela.models.enums.EGenero;


/**
 * Modelo de una Persona
 * 
 * @author Erik Zubia
 * @since 1.0
 */
public class Personal {
    
    private String nombre;
    
    private String primerApellido;
    
    private String segundoApellido;
    
    private Date fechaNacimiento;
    
    private Integer edad;
    
    private String numeroTelefono;
    
    private EGenero genero;
    
    private String direccion;
    
    private Double peso;
    
    private Double altura;
    
    private EEstadoCivil estadoCivil;
    
    private String etnia;

    /**
     * Contructor vacio de una persona.
     */
    public Personal() {
        this.estadoCivil = EEstadoCivil.SOLTERO;
    }
    
    
}
