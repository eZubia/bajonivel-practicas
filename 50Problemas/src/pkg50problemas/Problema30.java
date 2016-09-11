/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg50problemas;

import java.util.Random;

/**
 * Simular una carrera de dos caballos si cada uno tiene igual probabilidad de 
 * ganar.
 * 
 * @author ezubia
 */
public class Problema30 {
    
    public static void main(String[] args) {
        Random r = new Random();
        Integer caballo1 = 0;
        Integer caballo2 = 0;
        Integer longitudMetros = 200;
        Integer probabilidad = 4;
        
        while (caballo1 <longitudMetros && caballo2 < longitudMetros) {
            caballo1 += r.nextInt(probabilidad);
            caballo2 += r.nextInt(probabilidad);
        }
        
        System.out.println(String.format("El %s gano la carrera", (caballo1<caballo2) ? "Caballo 2" : "Caballo1"));
    }
    
}
