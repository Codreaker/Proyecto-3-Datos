/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodos_pruebas;

/**
 *
 * @author Noel
 */
public class Nodos_pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GraphicTree tree= new GraphicTree();
        tree.add(1);
        tree.add(3); //Se añaden los nodos
        tree.add(4);
        tree.add(23);
        tree.add(2);
        tree.add(64);
        
        tree.getReady(tree.root);
        tree.drawTree();
    }
    
}
