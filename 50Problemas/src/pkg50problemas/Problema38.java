package pkg50problemas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Cargar en una matriz las notas de los alumnos de un colegio en funcion del
 * número de cursos (filas) y del número de alumnos por curso (columnas).
 * 
 * @author ezubia
 */
public class Problema38 {
    public static void main(String[] args) {
        final int FILAS = 4, COLUMNAS = 5;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Número de cursos");
        Integer cursos = Integer.valueOf(in.nextLine());
        System.out.println("Número de alumnos por curso");
        Integer alumnos = Integer.valueOf(in.nextLine());
        Double[][] matriz = new Double[cursos][alumnos];
        Integer i =0;
        Integer j =0;
        while (matriz[cursos-1][alumnos-1]==null) {
            try{
            
                for (i = i; i < cursos; i++) {
                    j = j==alumnos ? 0 : j;
                    for (j=j; j < alumnos; j++) {
                        System.out.println(String.format("Introduzca la calificacion del curso %s del alumno %s", i+1, j+1 ));
                        Double num = Double.valueOf(in.nextLine());
                        if(num>=0 && num <=10){
                           matriz[i][j] = num;
                        }  else {
                             System.out.println("Solo números entre 0 y 10");
                             j--;
                        }
                    }
                }
            } catch(NumberFormatException ex){
                System.out.println("Solo introducir números.");
            }
        }
        
        System.out.println("Matriz");
        StringBuilder s = new StringBuilder();
        for (i = 0; i < cursos; i++) {
            for (j = 0; j < alumnos; j++) {
                s.append(String.format("%s\t", matriz[i][j]));
                if(j==alumnos-1){
                    s.append("\n");
                }
            }
        }
        
        System.out.println(s.toString());
    }
}
