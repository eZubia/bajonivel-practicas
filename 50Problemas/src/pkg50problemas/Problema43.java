/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg50problemas;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Hacer un programa que nos permita dar altas en el fichero secuencial DATOS.DAT,
 * cuyos campos son: DNI, NOMBRE, APELLIDOS, DIRECCION y PROVINCIA.
 * 
 * @author ezubia
 */
public class Problema43 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);
        String continuar = "s";
        while(continuar.equals("s") || continuar.equals("S")){
            System.out.println("El DNI:");
            String dni = in.nextLine();
            System.out.println("Nombre:");
            String nombre = in.nextLine();
            System.out.println("Apellidos:");
            String apellidos = in.nextLine();
            System.out.println("Direccion:");
            String direccion = in.nextLine();
            System.out.println("Provincia:");
            String provincia = in.nextLine();

            StringBuilder s = new StringBuilder();
            s.append(String.format("%s, ", dni));
            s.append(String.format("%s, ", nombre));
            s.append(String.format("%s, ", apellidos));
            s.append(String.format("%s, ", direccion));
            s.append(String.format("%s", provincia));
            List<String> lines = Arrays.asList(s.toString());
            Path file = Paths.get("datos.dat");
            Files.write(file, lines, StandardOpenOption.APPEND);
            System.out.println("Desea continuar? s=Continuar, n=Salir");
            continuar=in.nextLine();
        }
        System.out.println("Ha salido exitosamente.");
    }
    
}
