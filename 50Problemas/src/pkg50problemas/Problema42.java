package pkg50problemas;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus tres 
 * representantes a lo largo de doce meses de sus cuatro productos 
 * VENTAS[ representante, mes, producto ]. 
 * Queremos proyectar el array tridimensional sobre uno de dos dimensiones que 
 * represente el total de ventas, TOTAL[ mes, producto ], para lo cual sumamos 
 * las ventas de cada producto de cada mes de todos los representantes. 
 * Imprimir ambos arrays.
 * 
 * @author ezubia
 */
public class Problema42 {
    
    public static void main(String[] args) {
        final int MESES = 12, PRODUCTOS = 4, REPRESENTANTE = 3;
        int[][][] matriz = new int[REPRESENTANTE][MESES][PRODUCTOS];
        int [][] matrizBi = new int[MESES][PRODUCTOS];
        Integer contador = 1;
        Random r = new Random();
        for (int k = 0; k < REPRESENTANTE; k++) {
            for (int i = 0; i < MESES; i++) {
                for (int j = 0; j < PRODUCTOS; j++) {
                    matriz[k][i][j] = contador++;
                    matrizBi[i][j]=0;
                }
            }
        }
        
        for (int k = 0; k < REPRESENTANTE; k++) {
            for (int i = 0; i < MESES; i++) {
                for (int j = 0; j < PRODUCTOS; j++) {
                    matrizBi[i][j]+=matriz[k][i][j];
                }
            }
        }
        
        
        StringBuilder s = new StringBuilder();
        for (int k = 0; k < REPRESENTANTE; k++) {
            System.out.println(String.format("Página %s", k+1));
            System.out.println("1\t2\t3\t4\tProducto");
            s=new StringBuilder();
            for (int i = 0; i < MESES; i++) {
                for (int j = 0; j < PRODUCTOS; j++) {
                    s.append(String.format("%s\t", matriz[k][i][j]));
                    if(j==PRODUCTOS-1){
                       s.append(String.format("Mes %s\n", i+1));
                    }
                }
            }
            System.out.println(s.toString());
        }
        StringBuilder sBi = new StringBuilder();
        System.out.println("Total de ventas por mes:");
        System.out.println("1\t2\t3\t4\tProducto");
        for (int i = 0; i < MESES; i++) {
            for (int j = 0; j < PRODUCTOS; j++) {
                sBi.append(String.format("%s\t", matrizBi[i][j]));
                if(j==PRODUCTOS-1){
                   sBi.append(String.format("Mes %s\n", i+1));
                }
            }
        }
            System.out.println(sBi.toString());
        System.out.println(Arrays.deepToString(matriz));
               
    }
    
}
