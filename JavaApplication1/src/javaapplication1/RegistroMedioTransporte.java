/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author angel
 */
public class RegistroMedioTransporte {
    List<MedioTransporte> transportes;

    public RegistroMedioTransporte() {
        transportes = new LinkedList<>();
    }
    
    public void addItem(MedioTransporte medio){
        transportes.add(medio);
    }
    
    public MedioTransporte getItem(int pos){
         return (MedioTransporte)transportes.get(pos).clonar();
    }
    
//    public MedioTransporte getByModelo(String modelo){
//        for (MedioTransporte transporte : transportes) {
//            if(transporte.modelo.equals(modelo)){
//                return (MedioTransporte)transporte.clonar();
//            }
//        }
//        return null;
//    }
    
}
