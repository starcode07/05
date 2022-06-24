/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author angel
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Terrestre t1 = new Terrestre("hola", "hola", "motor", "nombre", 10, 5);
        System.out.println("Objecto base antes de la clonacion");
        System.out.println(t1.toString());
        System.out.println();
        
        
          System.out.println("---Comenzando la clonacion ---");
        for (int i = 0; i < 100; i++) {
            System.out.println("------Iniciando clonacion -----" + i + " -----");
            Terrestre t2 = (Terrestre)t1.clonar();
            t2.cantidadPasajeros = new Random().nextInt(100);
            System.out.println(t2.toString());
            System.out.println("------Iniciando clonacion -----" + i + " -----");
            System.out.println();
        }
        
        System.out.println("---Finalizando  la clonacion ---");
        System.out.println();
        
        
        
        System.out.println("Objecto base despues de la clonacion");
        System.out.println(t1.toString());
    }
    
}
