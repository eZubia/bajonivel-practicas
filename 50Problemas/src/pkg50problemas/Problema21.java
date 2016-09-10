package pkg50problemas;

import java.util.stream.IntStream;

/**
 * Hacer un programa que calcule independientemente la suma de los pares y los 
 * impares de los numeros entre 1 y 1000, utilizando un switch.
 * 
 * @author ezubia
 */
public class Problema21 {
    
    public static void main(String[] args) {
        
        Integer sumPares = 0;
        Integer sumImpares = 0;
        
        for (int i = 1; i <= 1000; i++) {
            switch(i%2){
                case 0: sumPares+=i;
                        break;
                default: sumImpares +=i;
                
            }
        }
        System.out.println(String.format("La suma total de los pares del 1 al 1000 es: %s", sumPares));
        System.out.println(String.format("La suma total de los impares del 1 al 1000 es: %s", sumImpares));
        
    }
    
}
