package PrimerPacial;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //intanciar
//        ListaArreglo L1 = new ListaArreglo(20);
        ListaSimple L1 = new ListaSimple();
//        ListaDoble L1 = new ListaDoble();

        /* aa. L1.insertarUlt(x) : inserta el elemento x, al final de la Lista.*/
        L1.insertarUlt(1);
        L1.insertarUlt(3);
        L1.insertarUlt(5);
        L1.insertarUlt(7);
        System.out.println(L1.toString());
        
//        /* bb. L1.insertarIesimo(x, i) : inserta el elemento x, en la posición i, de la Lista.*/
//        L1.insertarUlt(1); //0
//        L1.insertarUlt(3); //1
//        L1.insertarUlt(5); //2
//        L1.insertarUlt(7); //3
//        System.out.println(L1.toString());       
//        L1.insertarIesimo(9, 2);
//        System.out.println(L1.toString());
//
//        /* cc. L1.frecuencia(x) : devuelve la cantidad de veces que aparece el elemento x en la lista L1. */
//        L1.insertarUlt(7);  
//        L1.insertarUlt(3);  
//        L1.insertarUlt(7);  
//        L1.insertarUlt(7);  
//        System.out.println(L1);
//        System.out.println("Frecuencia del Elem x es: " + L1.frecuencia(7)); 
//
//        /* dd. L1.existeFrec(k) : devuelve True, si existe algún elemento que se repite exactamente k-veces en la lista L1.*/
//        L1.insertarUlt(5);
//        L1.insertarUlt(3);
//        L1.insertarUlt(5);
//        L1.insertarUlt(5);
//        System.out.println(L1);
//        System.out.println("¿Existe Frecuencia k?: " + L1.existeFrec(3));
//
//        /* ee. L1.poker() : devuelve True,si existe algún elemento que se repite exactamente k-veces en la Lista.*/
//        L1.insertarUlt(7);
//        L1.insertarUlt(5);
//        L1.insertarUlt(7);
//        L1.insertarUlt(7);
//        L1.insertarUlt(7);
//        System.out.println(L1);
//        System.out.println("¿Poker?: " + L1.poker());
//
//        /* ff. L1.eliminarIesimo(i) : elimina el i-ésimo elemento de la lista L1.*/
//        L1.insertarUlt(1);  //0
//        L1.insertarUlt(3);  //1
//        L1.insertarUlt(5);  //2
//        L1.insertarUlt(7);  //3
//        System.out.println(L1);
//        L1.eliminarIesimo(2);
//        System.out.println(L1.toString());
//
//        /* gg. L1.eliminarPrim( n ) : elimina los primeros n-elementos de la Lista.*/
//        L1.insertarUlt(3);  //0
//        L1.insertarUlt(4);  //1
//        L1.insertarUlt(5);  //2
//        L1.insertarUlt(7);  //3
//        System.out.println(L1);
//        L1.eliminarPrim(3);
//        System.out.println(L1.toString());
//
//        /* hh. L1.iguales(): devuelve True, si todos los elementos de la lista L1 son iguales.*/
//        L1.insertarUlt(7);
//        L1.insertarUlt(7);
//        L1.insertarUlt(7);
//        L1.insertarUlt(7);
//        L1.insertarUlt(7);
//        System.out.println(L1);
//        System.out.println("¿Todos Iguales?: " + L1.iguales());

    }
}
