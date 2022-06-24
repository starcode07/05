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
public class Billete100 extends SuperManejador{

   @Override
    public void retirar(Caja caja) {
        System.out.println("Billete 100");
        int cantidadBillete100 = caja.getCantidadRestante() / 100;//2
        int sobra = caja.getCantidadRestante() % 100; //100
        caja.setMensaje(cantidadBillete100 + " : cantidad de billete de 100");
        caja.setCantidadRestante(sobra);
        if (sobra > 0) {
            super.retirar(caja); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
