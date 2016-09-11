package pkg50problemas;

import java.util.Random;

/**
 * Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o 
 * cruz.
 * 
 * @author ezubia
 */
public class Problema28 {
    
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(2)==0 ? "Es cara" : "Es cruz");
    }
    
}
