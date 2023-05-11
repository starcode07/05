package PrimerPacial;

public class NodoDoble {

    // atributosn
    public NodoDoble anterior;
    public int elem;
    public NodoDoble proximo;

    // constructorn
    public NodoDoble(NodoDoble anterior, int elem, NodoDoble proximo) {
        this.anterior = anterior;
        this.elem = elem;
        this.proximo = proximo;
    }
}
