/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author angel
 */
public class Terrestre extends MedioTransporte{
    public int cantidadDeLlantas;
    
    public Terrestre(String marca,String modelo,String motor,String nombre, int cantidadPasajeros,int cantidadDeLlantas){
        super(marca, modelo, motor, nombre, cantidadPasajeros);
        this.cantidadDeLlantas = cantidadDeLlantas;
    }

    @Override
    public Object clonar() {
        return new Terrestre(marca, modelo, motor, nombre, cantidadPasajeros, cantidadDeLlantas) ;
    }
    
    @Override
    public String toString(){
        String marca1 = " marca = " + this.marca +'\n';
        String modelo1 = " modelo = " + this.modelo +'\n';
        String motor1 = " motor = " + this.motor +'\n';
        String nombre1 = " nombre = " + this.nombre +'\n';
        String cantidadPasajeros1 = " cantidadPasajeros = " + this.cantidadPasajeros +'\n';
        String cantidadDeLlantas1 = " cantidadDeLlantas = " + this.cantidadDeLlantas +'\n';
        String s = "{"+'\n'+marca1+modelo1+motor1+nombre1+cantidadPasajeros1+cantidadDeLlantas1 +"}";
        return s;
    }
}
