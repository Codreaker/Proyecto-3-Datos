/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodos_pruebas;

/**
 *
 * @author Noel
 */
public class nodos {
    
    Integer data;
    nodos rigth;
    nodos left;
    int x,y;
    
    
    nodos(){
        data =(Integer)null;
        rigth = null;
        left =null;
        
    }
    
    nodos(Integer data){
        this.data = data;
    }
    
}
