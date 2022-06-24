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
public class Comment implements InterfaceComment{

    private String name;
    private String description;
    
    public Comment(String name,String description){
        this.name = name;
        this.description = description;
    }
    @Override
    public String toString() {
        return "\n { name:" + this.name +", descripcion: "+ this.description + "}";
    }

    
    
}
