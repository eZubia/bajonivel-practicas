package pkg50problemas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 18.-Hacer un pseudocodigo que cuente las veces que aparece una determinada 
 * letra en una frase que introduciremos por teclado.
 * 
 * @author ezubia
 */
public class Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca una palabra u oración");
        String frase = in.nextLine();
        System.out.println("Introduzca una letra");
        String letra = in.nextLine();
        System.out.println(String.format("La cantidad de veces que aparece la letra en la oración es: %s", frase.length() - frase.replace(letra, "").length()));
        

    }
    
    
}
