/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheoryjava.algorithms;
import graphtheoryjava.util.Graph;

/**
 *
 * @author nobreck
 */
public class Info {
    
    public Graph graph;
    
    public Info(Graph graph) {
        this.graph = graph;
    }
    
    public double density() {
        double density = (double) graph.edges.size() / ((double) graph.vertices.size() * (graph.vertices.size() - 1));
        return density;
    }
    
    public boolean complete() {
        for(int i = 0; i < graph.vertices.size(); i++) {
            if(graph.adjList.get(i).size() != graph.adjList.size()) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean regular() {
        int grauV0 = graph.adjList.get(0).size();
        for(int i = 1; i < graph.vertices.size(); i++) {
            int grauVi = graph.adjList.get(i).size();
            if(grauV0 != grauVi) {
                return false;
            }
        }
        return true;
    }
    
//    public int completeMatrix() {
//        for(int i = 0; i <= graph.vertices.size(); i++) {
//           if(graph.adjMatrix.){
               
//           } 
//        }
//        return graph.;
//    }
    
//    public boolean regularMatrix() {
        
//    }

//    public ArrayList<ArrayList<Edge>> complementarList() {
//    
//    }    
//
//    public int[][] complementarList() {
//    
//    }    
    
}