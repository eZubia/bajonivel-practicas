package pkg50problemas;

import java.util.Scanner;

/**
 *
 * @author ezubia
 */
public class Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Boolean isNumber = false;       
        System.out.println("Introduzca un número:");
        Scanner in = new Scanner(System.in);
        Integer num = 0;
        Integer limites;
        
        try{
            limites = Integer.valueOf(num);
            for (int i = 1; i <=limites; i++) {
                if(i%3 == 0){
                    System.out.println(i);
                }
            }
        } catch(NumberFormatException n){
            System.out.println("Debe de introducirce un número");
        }

    }
    
}
