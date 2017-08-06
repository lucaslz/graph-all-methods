/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheoryjava.algorithms;

import graphtheoryjava.util.Graph;
import java.util.ArrayList;

/**
 *
 * @author nobreck
 */
public class Search {
    
    public Graph graph;
    public ArrayList<Integer> ordem;
    public int [] visitado;
    
    public Search(Graph graph)
    {
        this.graph = graph;
        this.visitado = new int[graph.vertices.size()];
    }
    
    public void reset () {
        ordem = new ArrayList<>();
        for (int i = 0; i < graph.vertices.size(); i++) {
            this.visitado[i] = 0;
        }
    }
    
    public ArrayList<Integer> buscaLargura(int s)
    {
        ArrayList<Integer> fila = new ArrayList<>();
       this.reset();
        
        this.visitado[s] = 1;
        
        fila.add(s);
        this.ordem.add(s);
        
        while (!fila.isEmpty()) {
            int u = fila.remove(0);
            for (int i = 0; i < graph.adjList.get(u).size(); i++) {
                int v = graph.adjList.get(u).get(i).destino;
                if (this.visitado[v] == 0) {
                    this.visitado[v] = 1;
                    this.ordem.add(v);
                    fila.add(v);
                }
            }
        }
        return this.ordem;
    }
    
    public ArrayList<Integer> buscaProfundidade(int s)
    {
        this.visitado[s] = 1;
        this.ordem.add(s);
        
        for (int i = 0; i < graph.adjList.get(s).size(); i++) {
            int v = graph.adjList.get(s).get(i).destino;
            if (this.visitado[v] == 0) {
                this.buscaProfundidade(v);
            }
        }
        return this.ordem;
    }
    
    public void comp(int u, int component)
    {
        this.visitado[u] = 1;
        
        for (int i = 0; i < graph.adjList.get(u).size(); i++) {
            int v = graph.adjList.get(u).get(i).destino;
            if (this.visitado[v] == 0) {
                comp(v, component);
            }
        }
    }
    
    public int connectedComponents()
    {
        int component = 0;
        
        for (int i = 0; i < graph.vertices.size(); i++) {
            if (visitado[i] == 0) {
                ++component;
                comp(i, component);
            }
        }
        return component;
    }
    
    public void ord (int u){
        this.visitado[u] = 1;
        
        for (int i = 0; i < graph.adjList.get(u).size(); i++) {
            int v = graph.adjList.get(u).get(i).destino;
            if (this.visitado[v] == 0) {
                this.ord(u);
            }
        }
        this.ordem.add(0, u);
    }
    
    public ArrayList<Integer> ordTopologica ()
    {
        for (int i = 0; i < graph.vertices.size(); i++) {
            if (this.visitado[i] == 0) {
                this.ord(i);
            }
        }
        
        return this.ordem;
    }
}
    