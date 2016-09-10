package pkg50problemas;

/**
 *
 * Hacer un pseudocodigo que imprima los números del 0 al 100, controlando las
 * filas y las columnas.
 *
 * @author ezubia
 */
public class Problema23 {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            s.append(i).append("\t");
            if (i % 10 == 0 && i!=0) {
                s.append("\n");
            }
        }
        System.out.println(s.toString());
    }

}
