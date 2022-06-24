package chainresponsability;

public class ChainResponsability {

    public ChainResponsability() {

    }

    public static void main(String[] args) {
        Caja caja = new Caja(1000);
        SuperManejador billete200 = new Billete200();
        SuperManejador billete100 = new Billete100();
        SuperManejador billete50 = new Billete50();
        SuperManejador billete20 = new Billete20();
        SuperManejador billete10 = new Billete10();
        billete200.nextManejador(billete100);
        billete100.nextManejador(billete50);
        billete50.nextManejador(billete20);
        billete20.nextManejador(billete10);
        
        caja.retiroPedido(980, 1000);
        
        
        billete200.retirar(caja);
        
        System.out.println("-------------------------------------");
        System.out.println(caja.getMensaje());

    }
}
