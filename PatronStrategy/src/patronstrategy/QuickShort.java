/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstrategy;


import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lab
 */
public class QuickShort implements IOrdenamiento{

    @Override
    public void execute(List<Integer> arreglo) {
        Collections.sort(arreglo);
    }
    
}