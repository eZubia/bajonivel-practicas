package mx.uach.bajonive.acuario.models;

/**
 * Modelo que ejemplifica la estructura y acciones de un tiburon.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class TiburonBlanco extends Tiburon{

    /**
     * Retorna la forma en como ataca un tiburon blanco.
     * 
     * @return {@code String} forma en como ataca
     */
    @Override
    public String atacar() {
        return "Ataco directamente al cuello con mis dientes.";
    }

    /**
     * Retorna la forma de defenderse
     * 
     * @return {@code String} forma de defenserse
     */
    @Override
    public String defenderse() {
        return "Doy embestidas con mi cabeza, o empiezo a morder la cola de mi atacante";
    }
    
}
