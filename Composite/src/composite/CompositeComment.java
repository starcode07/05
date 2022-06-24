/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author angel
 */
public class CompositeComment implements InterfaceComment{
    private String codigo;
    List<InterfaceComment> comments ;

    public CompositeComment(String codigo) {
        this.codigo = codigo;
        this.comments = new LinkedList<>();
    }
    
    public void add(InterfaceComment comment){
        comments.add(comment);
    }
    
    @Override
    public String toString(){
        String mostrar = "\n codigo: "+ this.codigo + " [";
        for (InterfaceComment comment : comments) {
            mostrar += "\t" +comment.toString();
        }
        mostrar+= "\n ]";
        return mostrar;
    }
}
