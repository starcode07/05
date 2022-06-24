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
public class Aereo extends MedioTransporte{
    public int cantidadDeAlas;
    
    public Aereo(String marca,String modelo,String motor,String nombre, int cantidadPasajeros,int cantidadDeAlas){
        super(marca, modelo, motor, nombre, cantidadPasajeros);
        this.cantidadDeAlas = cantidadDeAlas;
    }

    @Override
    public Object clonar() {
        return new Aereo(this.marca, this.modelo, this.motor, this.nombre,this.cantidadPasajeros, this.cantidadDeAlas);
    }
    
    @Override
    public String toString(){
        String marca1 = " marca = " + this.marca +'\n';
        String modelo1 = " modelo = " + this.modelo +'\n';
        String motor1 = " motor = " + this.motor +'\n';
        String nombre1 = " nombre = " + this.nombre +'\n';
        String cantidadPasajeros1 = " cantidadPasajeros = " + this.cantidadPasajeros +'\n';
        String cantidadDeLlantas1 = " cantidadDeLlantas = " + this.cantidadDeAlas +'\n';
        String s = "{"+'\n'+marca1+modelo1+motor1+nombre1+cantidadPasajeros1+cantidadDeLlantas1 +"}";
        return s;
    }
    
}
