package pkg50problemas;

import java.util.Scanner;

/**
 *
 * Introducir una frase por teclado. Imprimirla en el centro de la pantalla.
 * 
 * @author ezubia
 */
public class Problema26 {
    
    public static void main(String[] args) {
        System.out.println("Introducir una oración");
        Scanner in = new Scanner(System.in);
        String oración = in.nextLine();
        StringBuilder s = new StringBuilder();
        s.append("\n\n\n\n\n\n\n");
        s.append("\t\t\t\t\t\t\t\t\t\t");
        s.replace(s.length()-oración.length()/2, s.length(), oración);
        System.out.println(s.toString());
    }
}
