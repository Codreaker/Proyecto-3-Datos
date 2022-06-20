/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodos_pruebas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Noel
 */
public class drawingTree extends JPanel {//clase donde dibuja el grafo en el panel establecido
    static nodos[]copietab=new nodos[100];
    int n=0;
    drawingTree(nodos[]nodes,int n)
    {
    copietab =nodes.clone();
    this.n=n;
    
    }
    
    public void paintComponent(Graphics g){//forma que tendran los nodos y aristas de cada lado
        for(int x=0; x<n; x++){
           g.drawOval(copietab[x].x, copietab[x].y, 40, 40);
        String a= String.valueOf(copietab[x].data);
        g.drawString(a,copietab[x].x+5,copietab[x].y+25);
        if(copietab[x].rigth!=null){
            g.setColor(Color.RED);
            g.drawLine(copietab[x].x+15,copietab[x].y+40,copietab[x].x+90, copietab[x].y+90);
        }
        if(copietab[x].left !=null){
            g.setColor(Color.GREEN);
            g.drawLine(copietab[x].x+15,copietab[x].y+40,copietab[x].x-50, copietab[x].y+90);
        }
        g.setColor(Color.BLACK);
        //g.drawString("ha", 1, 2);
        
        }
    }
    
    
    
}
