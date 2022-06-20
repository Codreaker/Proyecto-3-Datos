/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodos_pruebas;

/**
 *
 * @author Noel
 */
public class nodos {//se les asigna un valor a los nodos creados y una posicion entre derecha e izquierda
    
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
