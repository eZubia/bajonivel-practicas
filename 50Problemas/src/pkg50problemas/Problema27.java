/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg50problemas;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *  Realizar la tabla de multiplicar de un numero entre 0 y 10.
 * 
 * @author ezubia
 */
public class Problema27 {
    
    public static void main(String[] args) {
        System.out.println("Introducir una número:");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        StringBuilder s = new StringBuilder();
        try {
            Integer valor = Integer.valueOf(num);
            if(valor>=0 && valor<=10){
                IntStream.rangeClosed(1, 10).forEach(n ->{
                    s.append(String.format("%s\tx\t%s\t=\t%s\n", valor, n, valor*n));
                });
                System.out.println(s.toString());
            } else {
                System.out.println("Solo números entre 0 y 10");
            }
        } catch(NumberFormatException e){
            System.out.println("Solo se pueden introducir números");
        }
    }
    
}
