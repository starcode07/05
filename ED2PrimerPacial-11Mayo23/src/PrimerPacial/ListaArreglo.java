package PrimerPacial;

public class ListaArreglo {

    // atributos
    private int[] arreglo;
    private int cantElem;

    // constructor
    public ListaArreglo(int dimension) {
        arreglo = new int[dimension];
        cantElem = 0;
    }

    /* Método toString(): devuelve la secuencia de elementos de la lista en arreglo*/
    public String toString() {
        String cad = " [ ";
        for (int i = 0; i < cantElem; i++) {
            cad = cad + (arreglo[i]);
            if (i != cantElem - 1) {
                cad = cad + " , ";
            }
        }
        cad = cad + " ] ";
        return cad;
    }

    /* Método insertarUlt: inserta el elemento x, al final de la Lista.*/
    public void insertarUlt(int elemento) {
        if (cantElem < this.arreglo.length) {
            this.arreglo[cantElem] = elemento;
            cantElem++;
        }
    }

    /* Método insertarIesimo: inserta el elemento x, en la posición i, de la Lista.*/
    public void insertarIesimo(int x, int i) {
        for (int j = cantElem - 1; j >= i; j--) {
            arreglo[j + 1] = arreglo[j];
        }
        arreglo[i] = x;
        cantElem++;
    }

    /* Método frecuencia: devuelve la cantidad de veces que aparece el elemento x en la Lista */
    public int frecuencia(int x) {
        int cont = 0;
        for (int i = 0; i < cantElem; i++) {
            if (arreglo[i] == x) {
                cont++;
            }
        }
        return cont;
    }

    /* Método existeFrec: devuelve True,si existe algún elemento que se repite exactamente k-veces en la Lista.*/
    public boolean existeFrec(int k) {
        for (int i = 0; i < cantElem; i++) {
            if (frecuencia(arreglo[i]) == k) {
                return true;
            }
        }
        return false;
    }

    /* Método poker: devuelve True, si los elementos de la lista todos son iguales excepto uno */
    public boolean poker() {
        return existeFrec(cantElem - 1);
    }

    /* Método eliminarIesimo: elimina el i-ésimo elemento de la Lista.*/
    public void eliminarIesimo(int i) {
        for (int j = i; j < cantElem - 1; j++) {
            arreglo[j] = arreglo[j + 1];
        }
        cantElem--;
    }

    /* Método eliminarPrim: elimina los primeros n-elementos de la Lista.*/
    public void eliminarPrim(int n) {
        for (int i = 0; i < n; i++) {
            eliminarIesimo(0);
        }
    }

    /* Método iguales: devuelve True, si todos los elementos de la lista L1 son iguales.*/
    public boolean iguales() {
        return existeFrec(cantElem);
    }
}
