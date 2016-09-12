/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg50problemas;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * Hacer un programa que nos permita dar bajas en el fichero DATOS.DAT.
 * 
 * @author ezubia
 */
public class Problema44 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Path file = Paths.get("datos.dat");
        FileInputStream fin = new FileInputStream(file.toString()); 
        DataInputStream din = new DataInputStream(fin);  
        BufferedReader br = new BufferedReader(new InputStreamReader(din)); 

        List<String> registros =new ArrayList<String> ();
        String s = br.readLine();
        while(s!=null){
            registros.add(s);
            System.out.println("registros.size() = " + registros.size());
            s= br.readLine();
        }
        borrarRegistro(file, registros);
        System.out.println("Termino de borrado.");
    }
    
    public static void borrarRegistro(Path file, List<String> registros) throws IOException{
        String indiceBorrar = null;
        String continuar = "s";
        while(registros.size()>0 && (continuar.equals("s") || continuar.equals("S"))){

            System.out.println("Introduzca el DNI que quiere eliminar:");
            Scanner in = new Scanner(System.in);
            String dniEliminar = in.nextLine();
            for (String registro : registros) {
                List<String> valores = Arrays.asList(registro.split(", "));
                if(dniEliminar.equals(valores.get(0))){
                    indiceBorrar = registro;
                }
            }
            if(indiceBorrar!=null){
                registros.remove(indiceBorrar);
            } else {
                System.out.println("No se encontro ningun registro con ese DNI.");
            }
            Files.delete(file);
            Files.write(file, registros);
            System.out.println("Desea continuar? s=Continuar, n=Salir");
            continuar=in.nextLine();
        }
    }
    
}
