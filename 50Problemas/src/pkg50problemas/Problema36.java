/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg50problemas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Generar una matriz de 4 filas y 5 columnas con numeros aleatorios entre 1 y 
 * 100, e imprimirla.
 * 
 * @author ezubia
 */
public class Problema36 {
    public static void main(String[] args) {
        final int FILAS = 4, COLUMNAS = 5;
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[FILAS][COLUMNAS];
        Random r = new Random();
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = r.nextInt(100);
            }
        }
        
        System.out.println("Matriz");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                s.append(String.format("%s\t", matriz[i][j]));
                if(j==4){
                    s.append("\n");
                }
            }
        }
        System.out.println(s.toString());
    }
}
