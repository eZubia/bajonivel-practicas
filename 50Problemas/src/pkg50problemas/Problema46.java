/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg50problemas;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static pkg50problemas.Problema44.borrarRegistro;

/**
 *
 * Tenemos el fichero secuencial DATOS.DAT cuyos campos son: DNI, NOMBRE, 
 * APELLIDOS, DIRECCION y PROVINCIA. Listar por impresora todos los registros 
 * cuya provincia sea una determinada que introduciremos por teclado.
 * 
 * @author ezubia
 */
public class Problema46 {
    
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("datos.dat");
        FileInputStream fin = new FileInputStream(file.toString()); 
        DataInputStream din = new DataInputStream(fin);  
        BufferedReader br = new BufferedReader(new InputStreamReader(din)); 

        List<String> registros =new ArrayList<String> ();
        String s = br.readLine();
        while(s!=null){
            registros.add(s);
            s= br.readLine();
        }
        listarRegistro(registros);
        System.out.println("Termino de borrado.");
    }
    
    public static void listarRegistro(List<String> registros) throws IOException{
        Integer indiceModificar = null;
        String continuar = "s";
        while(registros.size()>0 && (continuar.equals("s") || continuar.equals("S"))){
            System.out.println("Introduzca la provincia del los registros a mostrar:");
            Scanner in = new Scanner(System.in);
            String provincia = in.nextLine();
            System.out.println("DNI \tNombre \tAPELLIDOS \tDIRECCION \tPROVINCIA");
            StringBuilder sout = new StringBuilder();
            for (String registro : registros) {
                List<String> valores = Arrays.asList(registro.split(", "));
                if(provincia.equals(valores.get(4))){
                    valores.forEach(valor-> sout.append(String.format("%s \t", valor)));
                    sout.append("\n");
                }
            }
            System.out.println(sout.toString());
            System.out.println("Desea continuar? s=Continuar, n=Salir");
            continuar=in.nextLine();
        }
    }
    
}
