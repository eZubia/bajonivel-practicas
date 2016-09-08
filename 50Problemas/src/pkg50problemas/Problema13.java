package pkg50problemas;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author ezubia
 */
public class Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 100).filter(c-> c%2==0 || c%3==0).map(n -> {System.out.println(n); return n;}).count());
    }
    
}
