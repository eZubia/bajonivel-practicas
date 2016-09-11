package pkg50problemas;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Introducir dos nymeros por teclado y mediante un menu, calcule su suma, su 
 * resta, su multiplicacion o su division.
 * @author ezubia
 */
public class Problema31 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Integer eleccion = 1;
            while(eleccion != 0){
                System.out.println("Introduzca el primer número");
                Integer numero = Integer.valueOf(in.nextLine());
                System.out.println("Introduzca el segundo número");
                Integer numero2 = Integer.valueOf(in.nextLine());
                System.out.println("Elija una opcion:\n1:Suma\t2:Resta\t3:Multiplicación\t4:Division\t0:Salir");
                eleccion = Integer.valueOf(in.nextLine());
                switch(eleccion){
                    case 1: 
                        System.out.println(String.format("%s + %s = %s", numero,numero2, numero+numero2));
                        break;
                    case 2: 
                        System.out.println(String.format("%s - %s = %s", numero,numero2, numero-numero2));
                        break;
                    case 3: 
                        System.out.println(String.format("%s * %s = %s", numero,numero2, numero*numero2));
                        break;
                    case 4: 
                        if(numero2 == 0){
                            System.out.println("Ops las diviciones entre 0 no son posbiles D:.");
                        } else{
                            System.out.println(String.format("%s / %s = %s", numero,numero2, numero/numero2));
                        }
                        break;
                }
            }
            System.out.println("Ha salido con exito.");
        } catch(NumberFormatException e){
            System.out.println("Solo se pueden introducir números");
        }
    }
    
}
