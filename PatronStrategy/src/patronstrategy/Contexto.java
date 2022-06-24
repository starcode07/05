/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstrategy;

import java.util.List;

/**
 *
 * @author Lab
 */
public class Contexto {
    private IOrdenamiento strategy; 
    
    public void setStrategy(IOrdenamiento strategy){
        this.strategy = strategy;
    }
    
    public void executeStrategy(List<Integer> arreglo){
        this.strategy.execute(arreglo);
    }
}
