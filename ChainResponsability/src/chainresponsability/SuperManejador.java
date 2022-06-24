/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainresponsability;

/**
 *
 * @author angel
 */
public  class SuperManejador {
    SuperManejador manejador;
    
    
    
    public void nextManejador(SuperManejador next){
        this.manejador = next;
    }
    
    public  void retirar(Caja caja){
        if(caja!= null){
            this.manejador.retirar(caja);
        }
    }
    
}
