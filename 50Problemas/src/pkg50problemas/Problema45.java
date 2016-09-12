package pkg50problemas;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static pkg50problemas.Problema44.borrarRegistro;

/**
 *
 * Dado el fichero secuencial DATOS.DAT, realizar un programa que nos permita 
 * realizar modificaciones cuantas veces deseemos.
 * 
 * @author ezubia
 */
public class Problema45 {
    
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("datos.dat");
        FileInputStream fin; 
        try {
            fin = new FileInputStream(file.toString());
            DataInputStream din = new DataInputStream(fin);  
            BufferedReader br = new BufferedReader(new InputStreamReader(din)); 

            List<String> registros =new ArrayList<String> ();
            String s = br.readLine();
            while(s!=null){
                registros.add(s);
                System.out.println("registros.size() = " + registros.size());
                s= br.readLine();
            }
            modificarRegistro(file, registros);
            System.out.println("Termino de modificado.");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Problema45.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void modificarRegistro(Path file, List<String> registros) throws IOException{
        Integer indiceModificar = null;
        String continuar = "s";
        while(registros.size()>0 && (continuar.equals("s") || continuar.equals("S"))){
            System.out.println("Introduzca el DNI del registro a modificar:");
            Scanner in = new Scanner(System.in);
            String dniEliminar = in.nextLine();
            for (String registro : registros) {
                List<String> valores = Arrays.asList(registro.split(", "));
                if(dniEliminar.equals(valores.get(0))){
                    indiceModificar = registros.indexOf(registro);
                }
            }
            if(indiceModificar!=null){
                System.out.println("Que campo del registro quiere modificad:");
                System.out.println("1:DNI\t2:Nombre\t3:APELLIDOS\t4:DIRECCION\t5:PROVINCIA");
                try{
                    Integer opcion = Integer.valueOf(in.nextLine());
                    System.out.println("Introduzca el nuevo valor:");
                    String nuevoValor = in.nextLine();
                    String registroCambiado = cambiarValor(opcion-1, nuevoValor, registros.get(indiceModificar));
                    registros.set(indiceModificar, registroCambiado);
                } catch(NumberFormatException e){
                    System.out.println("Solamente se pueden introducir numeros");
                }
            } else {
                System.out.println("No se encontro ningun registro con ese DNI.");
            }
            Files.delete(file);
            Files.write(file, registros);
            System.out.println("Desea continuar? s=Continuar, n=Salir");
            continuar=in.nextLine();
        }
    }

    private static String cambiarValor(Integer opcion, String nuevoValor, String viejoValor) {
        List<String> valores = Arrays.asList(viejoValor.split(", "));
        valores.set(opcion, nuevoValor);
        StringBuilder registroCambiado = new StringBuilder();
        valores.stream().forEach(valor->{
            registroCambiado.append(String.format("%s, ", valor));
        });
        registroCambiado.replace(registroCambiado.length()-2, registroCambiado.length(), "");
        return registroCambiado.toString();
    }
    
}
