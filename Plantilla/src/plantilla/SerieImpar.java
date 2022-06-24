/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

/**
 *
 * @author Lab
 */
public class SerieImpar extends SeriePlantilla{    

    @Override
    public int calcularSerie(int n) {
        if (n == 0) {
            return 1;            
        }
        return n+2;
    }
    
}
