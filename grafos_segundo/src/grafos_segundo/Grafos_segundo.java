/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafos_segundo;
import java.util.*;
import java.io.*;
/**
 *
 * @author Noel
 */
public class Grafos_segundo {
    
   public int vertices;
    public int edges;
  
    // Limite de vertices
    final int MAX_LIMIT = 20;
  
    // Generar valores random
    Random random = new Random();
    // Representar el grafo
    public List<List<Integer> > adjacencyList;
  
    // Constructor
    public Grafos_segundo()
    {
        // Definir limite para los vertices
        
        this.vertices = random.nextInt(MAX_LIMIT) + 1;
  
        // maximo de aristas y escoger random el de posibles aristas
        
        this.edges
            = random.nextInt(computeMaxEdges(vertices)) + 1;
  
        // Crear una lista de adjacencia para representar el grafo 
        
        adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++)
            adjacencyList.add(new ArrayList<>());
  
        //Un loop para las aristas generadas random 
        for (int i = 0; i < edges; i++) {
            // escoger 2 vertices aleatorias y crear aristas entre ellos
            int v = random.nextInt(vertices);
            int w = random.nextInt(vertices);
  
            // agregar arista entre ellos
            addEdge(v, w);
        }
    }
  
    //Metodo para computar el maximo numero de aristas dado un numero de vertices 
    int computeMaxEdges(int numOfVertices)
    {
        
        return numOfVertices * ((numOfVertices - 1) / 2);
    }
  
    // Metodo para agregar aristas entre vertices dados 
    void addEdge(int v, int w)
    {
       
        adjacencyList.get(v).add(w);
  
        
        adjacencyList.get(w).add(v);
    }
  
    public static void main(String[] args)
    {
        // Crear un objeto random de la clase
        Grafos_segundo randomGraph = new Grafos_segundo();
  
        // Imprime el grafo
        System.out.println("El grafo generado :");
        for (int i = 0;
             i < randomGraph.adjacencyList.size(); i++) {
            System.out.print(i + " -> { ");
  
            List<Integer> list
                = randomGraph.adjacencyList.get(i);
  
            if (list.isEmpty())
                System.out.print(" No vertices adyacentes ");
            else {
                int size = list.size();
                for (int j = 0; j < size; j++) {
  
                    System.out.print(list.get(j));
                    if (j < size - 1)
                        System.out.print(" , ");
                }
            }
  
            System.out.println("}");
        }
    }
}
         
     

    /**
     * @param args the command line arguments
     */

    

