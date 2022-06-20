/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antvillage;
import java.io.*;
import java.util.*;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Noel
 */
public class AntVillage {
    
   static int maxVertices= 20; //El maximo de vertices a generar del grafo
   //Funcion para comprobar si se añadio una nueva arista
   public static boolean checkAcyclic(int[][]edge, int ed, boolean[] check, int v){
       int i;
       boolean value;
       //verificar si el vertice ya ha sido visitado 
       if(check[v]==true)
           return false;
       else{
           check[v]=true;
           //Para todos los vertices conecten entre si
           for(i=ed; i>=0; i--){
               if (edge[i][0]==v)
                   return checkAcyclic(edge, ed, check, edge[i][1]);
           }
       }
       //En caso de que se llegue al final del recorrido inicial y hayan vertices sin asignar, 
       //los vuelva a deasignar para volver hacer el recorrido hasta que todos se conecten
       check[v] = false;
        
        if (i == 0)
            return true;
        return true;
   }
//Generar un grafo aleatorio apartir de la cantidad de vertices que quiera
   public static void generateRandomGraphs(int e){
       int i=0, j=0, count=0;
       int[][] edge = new int[e][2];
        boolean[] check = new boolean[21];
        Random rand = new Random();
        //Hacer una conecion entre 2 vertices aleatorios
        while (i < e) {
            
            edge[i][0] = rand.nextInt(maxVertices) + 1;
            edge[i][1] = rand.nextInt(maxVertices) + 1;
            
            for (j = 1; j <= 20; j++)
                check[j] = false;
            
            if (checkAcyclic(edge, i, check, edge[i][0]) == true)
                
                i++;
   }
   System.out.println("El grafo generado es :");
   
   for (i = 0; i <maxVertices; i++) {
            
            count = 0;
            System.out.print((i + 1) + " -> { ");
            
            for (j = 0; j < e; j++) {
                
                if (edge[j][0] == i + 1) {
                    System.out.print(edge[j][1] + " ");
                    count++;
                }
                
                else if (edge[j][1] == i + 1) {
                    count++;
                }
                
                else if (j == e - 1 && count == 0)
                    System.out.print("Vertice aislado!");
            }
            
            System.out.print(" }\n");
        }
    }
   
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String m =JOptionPane.showInputDialog("cuantos nodos?");
        int e = Integer.parseInt(m);
        
        System.out.println("Cuantos vertices? :"+ e);
        //generar un grafo directo aleatorio
        generateRandomGraphs(e);
    }
    
}
