package pkg50problemas;

import java.util.Scanner;

/**
 *
 * Hacer un pseudocodigo que simule el funcionamiento de un reloj digital y que permita ponerlo en hora.
 * 
 * @author ezubia
 */
public class Problema19 {
 
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Introduzca la hora");
            Integer hora = in.nextInt();
            System.out.println("Introduzca los minutos");
            Integer min = in.nextInt();
            System.out.println("Introduzca los segundos");
            Integer segundo = in.nextInt();
            
            hora = hora<0 ? (hora*-1) : hora;
            min = min<0 ? (min*-1) : min;
            segundo = segundo<0 ? (segundo*-1) : segundo;
            
            while(hora<24){
                if(segundo==60){
                    min++;
                    segundo=0;
                }
                if(min==60){
                    hora++;
                    min = 0;
                }
                Thread.sleep(1000);
                System.out.println(String.format("Son las: %s:%s:%s", hora,min,segundo));
                segundo++;
            }
        } catch(NumberFormatException ex){
            System.out.println("Solamente introducir números.");
        }
        
        
    }
    
}
