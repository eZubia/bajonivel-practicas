package pkg50problemas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 17.-Imprimir, contar y sumar los multiplos de 2 que hay entre una serie de numeros,
 * tal que el segundo sea mayor o igual que el primero.
 * 
 * @author ezubia
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Boolean isNumber = false;       
        Scanner in = new Scanner(System.in);
        Integer numeroUno = 0;
        Integer numeroDos = 0;
        
        while(!isNumber){
            try{
                System.out.println("Introduzca el primer número:");
                String num = in.nextLine();
                numeroUno = Integer.valueOf(num);
                System.out.println("Introduzca el segundo número:");
                num = in.nextLine();
                numeroDos = Integer.valueOf(num);
                isNumber=true;
            } catch(NumberFormatException n){
                System.out.println("Solo se deben de introducir numeros");
                isNumber = false;
            }
        }
        
        if(numeroDos< numeroUno){
            int temp = numeroDos;
            numeroDos = numeroUno;
            numeroUno = temp;
        } 
        System.out.println("Rango de números:");
        IntStream.rangeClosed(numeroUno, numeroDos).filter(num->num%2==0).forEach(num->{
            System.out.println(num);
        });
        System.out.println(String.format("La cantidad de números pares del rango es: %s", IntStream.rangeClosed(numeroUno, numeroDos).filter(n-> n%2==0).count()));
        System.out.println(String.format("La suma de números pares del rango es: %s", IntStream.rangeClosed(numeroUno, numeroDos).filter(n-> n%2!=0).sum()));
        

    }
    
    
}
