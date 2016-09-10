package pkg50problemas;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * Comprobar si un numero mayor o igual que la unidad es primo.
 * 
 * @author ezubia
 */
public class Problema24 {
    
    public static void main(String[] args) {
        System.out.println("Introducir una número:");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        try {
            Integer primo = Integer.valueOf(num);
            if(primo>0){
                if (IntStream.rangeClosed(1, primo).mapToObj(n ->{return primo%n==0;}).filter(c -> c.equals(true)).count() ==2) {
                    System.out.println(String.format("El número %s es primo.", primo));
                } else {
                    System.out.println(String.format("El número %s no es primo.", primo));
                }
            }
        } catch(NumberFormatException e){
            System.out.println("Solo se pueden introducir números");
        }
        
    }
    
}
