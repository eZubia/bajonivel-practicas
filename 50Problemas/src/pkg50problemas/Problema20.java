package pkg50problemas;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;
import java.util.stream.IntStream;

/**
 *
 * Calcular el factorial de un numero, mediante subprogramas.
 * 
 * @author ezubia
 */
public class Problema20 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try{
            System.out.println("Introduzca un número");
            Integer num = in.nextInt();
            if(num<0){
                System.out.println("No se puede numeros negativos;");
            } else if(num == 0){
                System.out.println(String.format("El factorias del número es: %s", 1));
            } else {
                   System.out.println(String.format("El factorial de num %s es: %s", num, factorial(num)));
            }
            
        } catch(NumberFormatException ex){
            System.out.println("Solo introducir números.");
        }
    }

    /**
     * 
     * @param num
     * @return 
     */
    private static Integer factorial(Integer num) {
        return num ==0 ? 1 :num * factorial(num-1);
    }
}
