package com.mycompany.proyecto3;


public class ListaDoble{

    private NodoDoble inicio,fin;
    public ListaDoble(){
        inicio=fin=null;
    }
    
    // Metodo para saber cuando la lista esta vacia
    public boolean estVacia(){
        return inicio == null;
    }
    
    // Metodo para agregar nodos al Final
    public void agregarAlFinal(int el){
        if(!estVacia()){
            fin=new NodoDoble(el,null,fin);
            fin.anterior.siguiente=fin;
        }else{
            inicio=fin=new NodoDoble(el);
        }
    }

    // Metodo para mostrar la Lista de Final-Inicio
    public void mostrarListaFinInicio(){
        if(!estVacia()){
            String datos="<=>";
            NodoDoble auxiliar=fin;
            while(auxiliar!=null){
                datos = datos +"["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.anterior;
            }
            return ;
        }
    }

    
}