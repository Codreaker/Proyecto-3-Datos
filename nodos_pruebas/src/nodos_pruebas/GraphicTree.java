/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodos_pruebas;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Noel
 */
public class GraphicTree extends Arbol {
    //se asigna los valores que tendra el panel y frame, donde se mostrara los nodos graficados
    static nodos[] tab= new nodos[100];
    static int i =0;
    JFrame fenetre = null;
    JPanel pna1 = null;
    
    GraphicTree(){//se establece el frame y sus carectiristicas
        fenetre = new JFrame();
        fenetre.setTitle("Buscar");
        fenetre.setSize(1500,600);
    }
    

    public void getReady(nodos node)//carga los nodos
    {
        tab[i]=node;
        i++;
        if(node.left!=null)getReady(node.left);
        if(node.rigth!=null)getReady(node.rigth);
    }
    public void drawTree()
    {
        fenetre.setContentPane(new drawingTree(tab,howmany));
        fenetre.setVisible(true);
    }
    
}
