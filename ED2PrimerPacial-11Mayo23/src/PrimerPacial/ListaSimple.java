package PrimerPacial;

public class ListaSimple {

    // atributos
    public NodoSimple primero; //puntero auxiliar que apunta al primero nodo
    public NodoSimple ultimo; //puntero auxiliar que apunta al ultimo nodo
    public int cantElem;

    // constructor
    public ListaSimple() {
        primero = null;
        ultimo = null;
        cantElem = 0;
    }

    // Metodo estaVacia
    public boolean estaVacia() {
        return cantElem == 0;
    }

    /* Método toString(): devuelve la secuencia de elementos de la lista en arreglo*/
    public String toString() {
        String cad = " [ ";
        NodoSimple nodoActual = primero;
        while (nodoActual != null) {
            cad = cad + (nodoActual.elem);
            if (nodoActual != ultimo) {
                cad = cad + " -> ";
            }
            nodoActual = nodoActual.proximo;
        }
        cad = cad + " ] ";
        return cad;
    }

    /* Método insertarUlt: inserta el elemento x, al final de la Lista.*/
    public void insertarUlt(int x) {
        if (estaVacia()) {
            primero = new NodoSimple(x, null);
            ultimo = primero;
        } else {
            ultimo.proximo = new NodoSimple(x, null);
            ultimo = ultimo.proximo;
        }
        cantElem++;
    }

    /* Método insertarIesimo: inserta el elemento x, en la posición i, de la Lista.*/
    public void insertarIesimo(int x, int i) {
        NodoSimple p = primero, ap = null;
        int pos = 0;
        while (p != null && pos < i) {
            ap = p;
            p = p.proximo;
            pos++;
        }
        insertarNodo(x, ap, p);
    }

    /*Método insertarNodo: inserta un nuevo nodo con el elemento x entre dos nodos ya existentes de la lista.*/
    public void insertarNodo(int x, NodoSimple anteriorProx, NodoSimple prox) {
        if (anteriorProx == null) {
            primero = new NodoSimple(x, prox);
        } else {
            anteriorProx.proximo = new NodoSimple(x, prox);
        }
        cantElem++;
    }

    /* Método frecuencia: devuelve la cantidad de veces que aparece el elemento x en la Lista */
    public int frecuencia(int x) {
        int contador = 0;
        NodoSimple p = primero;
        while (p != null) {
            if (p.elem == x) {
                contador++;
            }
            p = p.proximo;
        }
        return contador;
    }

    /* Método existeFrec: devuelve True,si existe algún elemento que se repite exactamente k-veces en la Lista.*/
    public boolean existeFrec(int k) {
        NodoSimple p = primero;
        while (p != null) {
            if (frecuencia(p.elem) == k) {
                return true;
            }
            p = p.proximo;
        }
        return false;
    }

    /* Método poker: devuelve True, si los elementos de la lista todos son iguales excepto uno */
    public boolean poker() {
        return existeFrec(cantElem - 1);
    }

    /* Método eliminarIesimo: elimina el i-ésimo elemento de la Lista.*/
    public void eliminarIesimo(int i) {
        if (i == 0) {
            primero = primero.proximo;
        } else {
            NodoSimple anterior = primero;
            for (int j = 1; j < i; j++) {
                anterior = anterior.proximo;
            }
            anterior.proximo = anterior.proximo.proximo;
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
