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
public abstract class MedioTransporte implements CloneableMe {
    public String marca;
    public String modelo;
    public String motor;
    public String nombre;
    public int cantidadPasajeros;
    
    public MedioTransporte(String marca,String modelo,String motor,String nombre, int cantidadPasajeros){
          this.marca = marca;
          this.modelo = modelo;
          this.motor = motor;
          this.nombre = nombre;
          this.cantidadPasajeros = cantidadPasajeros;
    }
    
}
