package pkg50problemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ezubia
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Solamente introducir s o n, el programa no se detendra hasta que vea la letra correcta");
        
        Scanner in = new Scanner(System.in);
        String oracion="";
        while(!oracion.equals("s") && !oracion.equals("n") ){
            oracion = in.nextLine();
        }
        
        System.out.println("Si estas viendo este mensaje lo has logrado");

    }
    
}
