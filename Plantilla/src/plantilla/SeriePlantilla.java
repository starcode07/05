/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lab
 */
public abstract class SeriePlantilla {
    
    public List<Integer> metodoPlantilla(int n){
        List<Integer> listserie = new LinkedList<>();
        int inicio = 0;
        for (int i = 0; i < n; i++) {
            inicio = calcularSerie(inicio);
            listserie.add(inicio);
        }
        return listserie;
    }
    
    public abstract int calcularSerie(int n);
}
