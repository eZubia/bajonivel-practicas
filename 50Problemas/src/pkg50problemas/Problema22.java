package pkg50problemas;

import java.util.Scanner;

/**
 *
 * ntroducir una frase por teclado. Imprimirla cinco veces en filas consecutivas,
 * pero cada impresion ir desplazada cuatro columnas hacia la derecha.
 * 
 * @author ezubia
 */
public class Problema22 {
    
    public static void main(String[] args) {
        System.out.println("Introducir una oración");
        Scanner in = new Scanner(System.in);
        String oración = in.nextLine();
        Integer cantidadTabs = 4;
        for (int i = 0; i < 5; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < cantidadTabs*i; j++) {
                s.append("\t");
            }
            System.out.println(String.format("%s%s", s.toString(), oración));
        }
    }
    
}
