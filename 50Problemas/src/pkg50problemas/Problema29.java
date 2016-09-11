package pkg50problemas;

import java.util.Random;

/**
 * Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10.
 * 
 * @author ezubia
 */
public class Problema29 {
    
    public static void main(String[] args) {
        
        Integer sum10 = 0;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            Integer dado1 = 0;
            Integer dado2 = 0;
            while(dado1==0){
                dado1 = r.nextInt(7);
            }
            while(dado2==0){
                dado2 = r.nextInt(7);
            }
            
            if(dado1 + dado2 == 10) sum10++;
            
        }
        
        System.out.println(String.format("En total fueron %s veces las que sumaron 10 los dados", sum10));
        
    }
    
}
