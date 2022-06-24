/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Lab
 */
public class ClienteStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contexto contexto = new Contexto();
        List<Integer> listaEle = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            listaEle.add(new Random().nextInt(100));            
        }
        
        System.out.println("---------------- Lista base ------------------");
        System.out.println(listaEle.toString());
        System.out.println("----------------------------------------------");
        
        IOrdenamiento stregy = new QuickShort();
        contexto.setStrategy(stregy);
        contexto.executeStrategy(listaEle);
        
        System.out.println("---------------- Lista ordenada ------------------");
        System.out.println(listaEle.toString());
        System.out.println("--------------------------------------------------");
    }   
}
