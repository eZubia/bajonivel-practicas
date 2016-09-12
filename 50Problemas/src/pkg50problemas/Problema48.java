/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ezubia
 */
public class Problema48 {
    
    public static void main(String[] args) throws IOException {
        
        List<Articulo> articulos = readArticulos();
        if(articulos!=null) {
            List<Venta> ventas = readVentas();
            if(ventas!=null && ventas.size()>0){
                for (Venta venta : ventas) {
                    articulos.stream().filter(a->a.nArt.equals(venta.nArt)).forEach(a->{
                        a.updateStock(venta.numVenta, venta.tipo);
                    });
                }
            }
            updateArchivo(articulos);
            System.out.println("Actualizado con exito.");
            
        } else {
            System.out.println("No existen datos que leer ó existe una anomalía con los datos.");
        }
    }

    private static List<Articulo> readArticulos() throws IOException {
        Path file = Paths.get("articulos.dat");
        FileInputStream fin = new FileInputStream(file.toString()); 
        DataInputStream din = new DataInputStream(fin);  
        BufferedReader br = new BufferedReader(new InputStreamReader(din));
        List<String> registros =new ArrayList<String> ();
        String s = br.readLine();
        while(s!=null){
            registros.add(s);
            s= br.readLine();
        }
        List<Articulo> articulos = new ArrayList<>();
        try{
            for (String registro : registros) {
                List<String> valores = Arrays.asList(registro.split(", "));
                articulos.add(new Articulo(
                        Integer.valueOf(valores.get(0)), 
                        valores.get(1), 
                        valores.get(2), 
                        Integer.valueOf(valores.get(3)), 
                        Integer.valueOf(valores.get(4)))
                );
            }
        } catch(NumberFormatException e){
            return null;
        }
        return articulos;
    }

    private static List<Venta> readVentas() throws FileNotFoundException, IOException {
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
        List<Venta> ventas = new ArrayList<>();
        try{
            for (String registro : registros) {
                List<String> valores = Arrays.asList(registro.split(", "));
                ventas.add(new Venta(Integer.valueOf(valores.get(0)), Integer.valueOf(valores.get(1)), Integer.valueOf(valores.get(2)))
                );
            }
        } catch(NumberFormatException e){
            return null;
        }
        return ventas;
    }

    private static void updateArchivo(List<Articulo> articulos) throws IOException {
        Path file = Paths.get("articulos.dat");
        List<String> registros = new ArrayList<>();
        for (Articulo articulo : articulos) {
            StringBuilder registro = new StringBuilder();
            registro.append(String.format("%s, %s, %s, %s, %s", articulo.nArt, articulo.articulo, articulo.pvp, articulo.stock, articulo.minimo));
            registros.add(registro.toString());
        }
        Files.write(file, registros);
    }
    
    static class Articulo{
    
        private Integer nArt;
        private String articulo;
        private String pvp;
        private Integer stock;
        private Integer minimo;

        public Articulo(Integer nArt, String articulo, String pvp, Integer stock, Integer minimo) {
            this.nArt = nArt;
            this.articulo = articulo;
            this.pvp = pvp;
            this.stock = stock;
            this.minimo = minimo;
        }
        
        public  void updateStock(Integer stock, Integer tipo){
            if(tipo.equals(1)){
                this.stock+=stock;
            } else {
                this.stock-=stock;
            }
        }
        
        public  Integer getNArt(){
            return this.nArt;
        }
    }
    
    static class Venta{
    
        private Integer nArt;
        private Integer numVenta;
        private Integer tipo;

        public Venta(Integer nArt, Integer numVenta, Integer Tipo) {
            this.nArt = nArt;
            this.numVenta = numVenta;
            this.tipo = Tipo;
        }

        
    }
    
}
