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
public class Billete200 extends SuperManejador {

    @Override
    public void retirar(Caja caja) { //total -> 1000bs --> //requerido -> 500
        System.out.println("Estamos en el billete 200");
        if (caja.getTotalCuenta() < caja.getCantidadRequerida()) {
            caja.setMensaje("No encuentra la cantidad requerida");
            return;
        }
        int cantidadBillete200 = caja.getCantidadRestante() / 200;//2
        int sobra = caja.getCantidadRestante() % 200; //100
        caja.setMensaje(cantidadBillete200 + " : cantidad de billete de 200");
        if (sobra > 0) {
            caja.setCantidadRestante(sobra);
            super.retirar(caja); //To change body of generated methods, choose Tools | Templates.
        }

    }

}
