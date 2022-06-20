/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodos_pruebas;

/**
 *
 * @author Noel
 */
public class Arbol {//Clase donde se genera el arbol, almacenando los nodos y distribuyendolos
    //Esto mediante la asignacion de valores temporales
    
    nodos root;
    nodos temp;
    static int howmany =0;
    static int w=120, h=80;
    
    Arbol(){
        root=null;
    }
    
    public void add(Integer data){
        nodos node = new nodos(data);
        
        if(this.root==null){
            this.root= node;
            this.root.x=500;
            this.root.y=10;
            howmany++;
        }
        else{
            boolean ok=true;
            temp=root;
            while(ok)
             
           if (temp.data> data){//asignar un nodo a la izquierda
               if(temp.left==null){
                   temp.left=node;
                   temp.left.x=temp.x -w;
                   temp.left.y= temp.y + 80;
                   howmany++;
                   w -=5;
                   ok= false;
                   
               }
               else{
                   temp= temp.left;
               }
           }
           else{
               if (temp.rigth==null){//asignar un nodo a la derecha
                   temp.rigth=node;
                   temp.rigth.x= temp.x +w;
                   temp.rigth.y= temp.y +80;
                   howmany++;
                   w -= 5;
                   ok= false;
               }
               else{
                   temp=temp.rigth;
               }
           }
        }
    }
}
