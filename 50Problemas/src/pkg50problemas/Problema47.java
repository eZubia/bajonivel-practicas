package pkg50problemas;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * -En el fichero secuencial VENTAS.DAT, est n almacenadas las ventas de los 
 * productos durante el d¡a, cuyos campos son: NART y VENTAS. Se desea hacer un 
 * programa que liste por impresora todas las ventas realizadas durante el d¡a.
 * 
 * @author ezubia
 */
public class Problema47 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Path file = Paths.get("ventas.dat");
        FileInputStream fin = new FileInputStream(file.toString()); 
        DataInputStream din = new DataInputStream(fin);  
        BufferedReader br = new BufferedReader(new InputStreamReader(din));
        List<String> registros =new ArrayList<String> ();
        String s = br.readLine();
        while(s!=null){
            registros.add(s);
            s= br.readLine();
        }
        System.out.println("registros.size() = " + registros.size());
        System.out.println("NART\tVentas\tTipo");
        for (String registro : registros) {
            List<String> valores = Arrays.asList(registro.split(", "));
            StringBuilder sout = new StringBuilder();
            valores.forEach(v->{sout.append(String.format("%s\t", v));});
            System.out.println(sout.toString());
        }
    }
    
}
