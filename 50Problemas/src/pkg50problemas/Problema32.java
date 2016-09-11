package pkg50problemas;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * Hacer un programa que nos permita introducir un numero por teclado y sobre el
 * se realicen las siguientes operaciones: comprobar si es primo, hallar su 
 * factorial o imprimir su tabla de multiplicar.
 * 
 * @author ezubia
 */
public class Problema32 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Integer eleccion = 1;
            while(eleccion != 0){
                System.out.println("Introduzca un número");
                Integer numero = Integer.valueOf(in.nextLine());
                System.out.println("Elija una opcion:\n1:Verificar primo\t2:Sacar factorial \t3:Tabla de Multiplicar\t0:Salir");
                eleccion = Integer.valueOf(in.nextLine());
                switch(eleccion){
                    case 1: 
                        isPrimo(numero);
                        break;
                    case 2: 
                        System.out.println(String.format("El factorial de %s es: %s", numero, factorial(numero)));
                        break;
                    case 3: 
                        imprimirTabla(numero);
                        break;
                }
            }
            System.out.println("Ha salido con exito.");
        } catch(NumberFormatException e){
            System.out.println("Solo se pueden introducir números");
        }
    }
    
    public static void imprimirTabla(Integer num){
        StringBuilder s = new StringBuilder();
        IntStream.rangeClosed(1, 10).forEach(n ->{
                    s.append(String.format("%s\tx\t%s\t=\t%s\n", num, n, num*n));
                });
        System.out.println(s.toString());
    }
    
    public static void isPrimo(Integer num){
        if(num>0){
            if (IntStream.rangeClosed(1, num).mapToObj(n ->{return num%n==0;}).filter(c -> c.equals(true)).count() ==2) {
                System.out.println(String.format("El número %s es primo.", num));
            } else {
                System.out.println(String.format("El número %s no es primo.", num));
            }
        } else {
            System.out.println("Solo introducir números positivos 0 mayores a 0");
        }
    }
    
    private static Integer factorial(Integer num) {
        return num ==0 ? 1 :num * factorial(num-1);
    }
    
}
