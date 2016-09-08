package pkg50problemas;

import java.util.Scanner;

/**
 *
 * @author ezubia
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Boolean isNumber = false;       
        System.out.println("Introduzca un número:");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        Integer limites;
        
        try{
            limites = Integer.valueOf(num);
            if(limites>0){
                for (int i = 1; i <= limites; i++) {
                        System.out.println(i);
                }
            } else {
                System.out.println("Introdusca un numero mayor a 0");
            }
        } catch(NumberFormatException n){
            System.out.println("Debe de introducirce un numero mayor a 0");
        }

    }
    
}
