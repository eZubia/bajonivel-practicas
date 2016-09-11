package pkg50problemas;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Crear un array unidimensional de 20 elementos con nombres de personas,
 * Visualizar los elementos de la lista debiendo ir cada uno en una fila distinta.
 * 
 * @author ezubia
 */
public class Problema33 {
    
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Erik", "Erik","Erik","Erik","Erik", "Erik","Erik","Erik","Erik","Erik","Erik","Erik", "Erik","Erik","Erik","Erik","Erik","Erik","Erik","Erik");
        for (String nombre : nombres) {
            System.out.println(String.format("Mi nombre es: %s", nombre));
        }
    }
    
}
