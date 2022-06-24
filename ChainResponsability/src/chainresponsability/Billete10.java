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
public class Billete10 extends SuperManejador{

    @Override
    public void retirar(Caja caja) {
        System.out.println("Billete 10");
        int cantidadBillete10 = caja.getCantidadRestante() / 10;//2
        int sobra = caja.getCantidadRestante() % 10; //100
        caja.setMensaje(cantidadBillete10 + " : cantidad de billete de 10");
        if (sobra > 0) {
            caja.setCantidadRestante(sobra);
            super.retirar(caja); //To change body of generated methods, choose Tools | Templates.
        }
      
        
    }
    
}
