/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodos_pruebas;
import javax.swing.JOptionPane;


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
        
        String m =JOptionPane.showInputDialog("cuantos nodos?");
        
        int c = Integer.parseInt(m);
        int max= 1000;
        
        GraphicTree tree= new GraphicTree();
        int contador =0;
        while (contador < c){
        
        tree.add((int)(Math.random()*max)+1);
        contador++;
        
        
        
        }
        tree.getReady(tree.root);
        tree.drawTree();
    }
    
}
