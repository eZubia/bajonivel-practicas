package mx.uach.bajonive.acuario.models;

/**
 * Modelo que ejemplifica a un tiburon martillo.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class TiburonMartillo extends Tiburon{
 
    /**
     * Retorna la forma en como ataca un tiburon martillo.
     * 
     * @return {@code String} forma en como ataca
     */
    @Override
    public String atacar() {
        return "Golpeo con los costados de mi cabeza aturdiendo al objetivo, "
                + "luego muerdo puntos vitales.";
    }

    /**
     * Retorna la forma de defenderse
     * 
     * @return {@code String} forma de defenserse
     */
    @Override
    public String defenderse() {
        return "Doy embestidas con mi cabeza.";
    }
    
}
