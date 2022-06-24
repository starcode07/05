/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author angel
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CompositeComment root = new CompositeComment("raiz");
        
        CompositeComment hijo11  = new CompositeComment("Caja1Hijo1");
        root.add(hijo11);
        
        Comment comment11 = new Comment("Himeko", "Tk");
        Comment comment12 = new Comment("Himeko1", "Tk1");
        hijo11.add(comment11);
        hijo11.add(comment12);
        
        
        CompositeComment hijo2  = new CompositeComment("Caja2Hijo1");
        root.add(hijo2);
        
        Comment comment21 = new Comment("Himeko", "Tk");
        Comment comment22 = new Comment("Himeko1", "Tk1");
        hijo2.add(comment21);
        hijo2.add(comment22);
        
        root.add(new Comment("Oswaldo", "You"));
        
        
        
        CompositeComment hijo3  = new CompositeComment("Caja3Hijo2");
        hijo2.add(hijo3);
        
        Comment comment31 = new Comment("Himeko3", "Tk3");
        Comment comment32 = new Comment("Himeko31", "Tk31");
        hijo3.add(comment31);
        hijo3.add(comment32);
        
        
        System.out.println(root.toString());
       
       
        
    }
    
}
