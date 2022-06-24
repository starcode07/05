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
public class Billete20 extends SuperManejador{

    @Override
    public void retirar(Caja caja) {
        System.out.println("Billete 20");
        int cantidadBillete20 = caja.getCantidadRestante() / 20;//2
        int sobra = caja.getCantidadRestante() % 20; //100
        caja.setMensaje(cantidadBillete20 + " : cantidad de billete de 20");
        if (sobra > 0) {
            caja.setCantidadRestante(sobra);
            super.retirar(caja); //To change body of generated methods, choose Tools | Templates.
        }
       
        
    }
    
}
