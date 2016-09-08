package pkg50problemas;

import java.util.Scanner;

/**
 *
 * @author ezubia
 */
public class Problema9 {

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
                System.out.println("El número es positivo");
            } else if(limites<0){
                System.out.println("El número es menor a cero");
            } else {
                System.out.println("El número es a cero");
            }
        } catch(NumberFormatException n){
            System.out.println("Debe de introducirce un número");
        }

    }
    
}
