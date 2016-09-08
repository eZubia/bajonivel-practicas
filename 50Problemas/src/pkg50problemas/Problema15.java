package pkg50problemas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 15.-Introducir dos numeros por teclado. Imprimir los numeros naturales que
   hay entre ambos numeros empezando por el más pequeño, contar cuantos hay y 
   * cuantos de ellos son pares. Calcular la suma de los impares.
 * 
 * @author ezubia
 */
public class Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Boolean isNumber = false;       
        Scanner in = new Scanner(System.in);
        Integer numeroUno = 0;
        Integer numeroDos = 0;
        List<Integer> numeros = new ArrayList<>();
        Integer numeroPares=0;
        Integer sumaImpares=0;
        
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
                System.out.println("Los dos números tiene que ser enteros");
                isNumber = false;
            }
        }
        
        numeroUno = numeroUno<0 ? 1 : numeroUno;
        numeroDos = numeroDos<0 ? 1 : numeroDos;
        
        if(numeroUno != numeroDos){
            if(numeroDos< numeroUno){
                int temp = numeroDos;
                numeroDos = numeroUno;
                numeroUno = temp;
            } 
            System.out.println("Rango de números:");
            IntStream.rangeClosed(numeroUno, numeroDos).forEach(num->{
                System.out.println(num);
            });
            System.out.println(String.format("La cantidad de números del rango es: %s", IntStream.rangeClosed(numeroUno, numeroDos).count()));
            System.out.println(String.format("La cantidad de números pares del rango es: %s", IntStream.rangeClosed(numeroUno, numeroDos).filter(n-> n%2==0).count()));
            System.out.println(String.format("La suma de números impares del rango es: %s", IntStream.rangeClosed(numeroUno, numeroDos).filter(n-> n%2!=0).sum()));
        }
        

    }
    
    
}
