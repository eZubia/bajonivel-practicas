package pkg50problemas;

/**
 *
 * @author ezubia
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer impares = 0;
        for (int i = 0; i <= 100; i++) {
            if(i%2 != 0){
                System.out.println(i);
                impares++;
            }
        }
        System.out.println("impares = " + impares);
    }
    
}
