/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstrategy;

import java.util.List;

/**
 *
 * @author Lab
 */
public class Burbuja implements IOrdenamiento {

    @Override
    public void execute(List<Integer> arreglo) {
        int i, j, aux;
        for (i = 0; i < arreglo.size() - 1; i++) {
            for (j = 0; j < arreglo.size() - i - 1; j++) {
                if (arreglo.get(j + 1) < arreglo.get(j)) {
                    aux = arreglo.get(j + 1);
                    arreglo.set(j + 1, arreglo.get(j));
                    arreglo.set(j, aux);
                }
            }
        }

    }
}
