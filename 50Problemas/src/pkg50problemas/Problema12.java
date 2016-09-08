package pkg50problemas;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author ezubia
 */
public class Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer sumImpares = 0;
        Integer sumPares = 0;
      
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if(i%2 == 0){
                sumPares+=i;
            } else {
                sumImpares+=i;
            }
        }
       
        System.out.println(String.format("La suma de los números pares del 1 al 100 es: %s", sumPares));
        System.out.println(String.format("La suma de los números impares del 1 al 100 es: %s", sumImpares));
    }
    
}
