package mx.uach.bajonive.acuario.models;

import mx.uach.bajonive.acuario.interfases.IPescados;

/**
 * Modelo que ejemplifica a un pez dorado.
 * 
 * @author Erik David Zubia Hernández
 * @since 21/Agosto/2016
 * @version 1.0
 */
public class PezDorado extends Pescado  implements IPescados{

    /**
     * Demuestra como atacan los pescados dorados.
     * 
     * @return {@code String} su forma de ataque
     */
    @Override
    public String atacar() {
        return "Doy un leve golpe con mi aleta.";
    }

    /**
     * Demuestra como se defiende el pescado dorado.
     * 
     * @return {@code String} forma en como se defiende
     */
    @Override
    public String defenderse() {
        return "Huyo de manera rapida.";
    }

    
    /**
     * Demuestra como duerme un pez dorado.
     * 
     * @return {@code String} con su forma de dormir
     */
    @Override
    public String dormir() {
        return "Reposo en lugar chico y oculto.";
    }
    
}
