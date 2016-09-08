package pkg50problemas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author ezubia
 */
public class Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        Scanner in = new Scanner(System.in);
        Integer numeroNuevo;
        List<Integer> numeros = new ArrayList<>();
        
        while(numeros.size()<5){
            System.out.println("Introduzca un número:");
            String num = in.nextLine();
            try{
                numeroNuevo = Integer.valueOf(num);
                numeros.add(numeroNuevo);
            } catch(NumberFormatException n){
                System.out.println("Solo debe de introducir un número entero");
            }
        }
        System.out.println(String.format("El número mayor es: %s", numeros.stream().max(Comparator.naturalOrder()).get()));
        System.out.println(String.format("El número menor es: %s", numeros.stream().min(Comparator.naturalOrder()).get()));

    }
    
    
}
