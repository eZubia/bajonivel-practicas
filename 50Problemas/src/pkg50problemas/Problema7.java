package pkg50problemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ezubia
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<String> oraciones = new ArrayList<>();
        System.out.println("Introduzca tantas oraciones quiera, para detenerce mande una oracion en blanco(cada oracion se separa con enter)");
        
        Scanner in = new Scanner(System.in);
        String oracion="oracion";
        while(!"".equals(oracion)){
            oracion = in.nextLine();
            if(!"".equals(oracion)){
                oraciones.add(oracion);
            }
        }
        
        System.out.println("Número de oraciones Escritas: " + oraciones.size());

    }
    
}
