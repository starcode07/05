/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantilla;

import java.util.List;





/**
 *
 * @author Lab
 */
public class CPlantilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SeriePlantilla s = new SeriePar();
        List<Integer> seriepar = s.metodoPlantilla(10);
        System.out.println(seriepar);
        
        
    }
    
}
