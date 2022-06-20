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
     * Instituto Tecnológico de Costa Rica
     * Campus Central Cartago
     * Ingeniería en computadores
     * Proyecto 3
     * 
     * Esta clase es la encargada de crear los nodos y mostrar los nodos en pantalla 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String m =JOptionPane.showInputDialog("cuantos nodos?");//abre cuador de dialogo para anotar los nodos que se quiere
        
        int c = Integer.parseInt(m);//hace el string del cuadro de dialogo a un int
        int max= 20;//maximo de nodos
        
        GraphicTree tree= new GraphicTree();//genera el "grafo" aleatorio
        //Se uso como base un arbol de busqueda, debido a su similitud en estructura basica
        int contador =0;
        while (contador < c){//funcion que genera nodos de valores aleatorios hasta que se cumpla el requisitos de nodos pedidos
        
        tree.add((int)(Math.random()*max)+1);
        contador++;
        
        
        
        }
        tree.getReady(tree.root);
        tree.drawTree();
    }
    
}
