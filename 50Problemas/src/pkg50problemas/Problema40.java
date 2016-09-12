/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg50problemas;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * Crear una tabla de 3 paginas, 4 filas y 5 columnas donde el primer elemento 
 * valga 1, el segundo 2, el tercero 3 y as¡ sucesivamente, e imprimirla.
 * 
 * @author ezubia
 */
public class Problema40 {
    public static void main(String[] args) {
        final int FILAS = 4, COLUMNAS = 5, PAGINAS = 3;
        int[][][] matriz = new int[PAGINAS][FILAS][COLUMNAS];
        Integer contador = 1;
        Random r = new Random();
        for (int k = 0; k < PAGINAS; k++) {
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    matriz[k][i][j] = contador++;
                }
            }
        }
        
        StringBuilder s = new StringBuilder();
        for (int k = 0; k < PAGINAS; k++) {
            System.out.println(String.format("Página %s", k+1));
            s=new StringBuilder();
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    s.append(String.format("%s\t", matriz[k][i][j]));
                    if(j==COLUMNAS-1){
                       s.append("\n");
                    }
                }
            }
            System.out.println(s.toString());
        }
        System.out.println(Arrays.deepToString(matriz));
               
    }
}
