package pkg50problemas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas, 
 * las almacene en un vector y calcule e imprima su media.
 * 
 * @author ezubia
 */
public class Problema34And35 {
    
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (notas.size()<10) {
            try{
                System.out.println("Introduzca una calificacion");
                Double num = Double.valueOf(in.nextLine());
                if(num>=0 && num <=10){
                   notas.add(num);
                }  else {
                     System.out.println("Solo números entre 0 y 10");
                }

            } catch(NumberFormatException ex){
                System.out.println("Solo introducir números.");
            }
        }
        Double media = 0.0;
        for (Double nota : notas) {
            media+=nota;
        }
        System.out.println(String.format("La media es: %s", media/10));
        
        try{
                System.out.println("Introduzca una calificación a buscar");
                Double num = Double.valueOf(in.nextLine());
                if(notas.contains(num)){
                    System.out.println("La calificación se encuentra dentro del arreglo.");
                } else {
                    System.out.println("La calificación no encuentra dentro del arreglo.");
                }

            } catch(NumberFormatException ex){
                System.out.println("Solo introducir números.");
            }
    }
    
}
