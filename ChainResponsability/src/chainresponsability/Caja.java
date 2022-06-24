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
public class Caja {
    private int cantidadRequerida;
    private int cantidadRestante;
    private int totalCuenta;
    private String mensaje;

    public Caja(int totalCuenta) {
        this.totalCuenta = totalCuenta;
        this.mensaje ="";
    }
    
    public String getMensaje(){
        return mensaje;
    }
    public void setMensaje(String mensaje){
        this.mensaje += "\n" + mensaje + '\n';
    }

    public int getCantidadRequerida() {
        return cantidadRequerida;
    }

    public int getCantidadRestante() {
        return cantidadRestante;
    }

    public int getTotalCuenta() {
        return totalCuenta;
    }

    public void setCantidadRestante(int cantidadRestante) {
        this.cantidadRestante = cantidadRestante;
    }
    
    public void retiroPedido(int cantidadRequerida, int totalCuenta){
        this.cantidadRequerida = cantidadRequerida;
        this.cantidadRestante = cantidadRequerida;
        this.totalCuenta = totalCuenta;
        this.mensaje ="";
    }
    
}
