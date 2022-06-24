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
public class Billete50 extends SuperManejador {

    @Override
    public void retirar(Caja caja) {
        System.out.println("Billete 50");
        int cantidadBillete50 = caja.getCantidadRestante() / 50;//2
        int sobra = caja.getCantidadRestante() % 50; //100
        caja.setMensaje(cantidadBillete50 + " : cantidad de billete de 50");
        if (sobra > 0) {
            caja.setCantidadRestante(sobra);
            super.retirar(caja); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
