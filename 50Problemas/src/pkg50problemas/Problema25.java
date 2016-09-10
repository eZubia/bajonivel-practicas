package pkg50problemas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * Comprobar si un numero mayor o igual que la unidad es primo.
 * 
 * @author ezubia
 */
public class Problema25 {
    
    public static void main(String[] args) {
        System.out.println("Introducir una número:");
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        try {
            Integer romano = Integer.valueOf(num);
            if(romano>0 && romano<= 5000){
                System.out.println(convertirRomano(romano));
            } else {
                System.out.println("Solo se puede introducir un número mayor a 0 y menor o igual a 5000.");
            }
        } catch(NumberFormatException e){
            System.out.println("Solo se pueden introducir números");
        }
        
    }
    
    /**
     * Realiza la converción de un número a sus siglas correspondientes en romano.
     * 
     * @param num {@code Integer} número a convertir
     * @return 
     */
    public static String convertirRomano(Integer num){
        Map<String, Integer> diccionario = new LinkedHashMap<>();
        diccionario.put("M", 1000);
        diccionario.put("CM", 900);
        diccionario.put("D", 500);
        diccionario.put("CD", 400);
        diccionario.put("C", 100);
        diccionario.put("XC", 90);
        diccionario.put("L", 50);
        diccionario.put("XL", 40);
        diccionario.put("X", 10);
        diccionario.put("IX", 9);
        diccionario.put("V", 5);
        diccionario.put("IV", 4);
        diccionario.put("I", 1);
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,Integer> conjunto : diccionario.entrySet()) {
            while(num>=conjunto.getValue()){
                num-= conjunto.getValue();
                s.append(conjunto.getKey());
            }
        }
        return s.toString();
    }
    
}
