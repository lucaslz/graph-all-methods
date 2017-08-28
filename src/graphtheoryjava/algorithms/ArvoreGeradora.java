/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheoryjava.algorithms;
//import graphtheoryjava.util.Edge;
import graphtheoryjava.util.Graph;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
/**
 *
 * @author nobreck
 */
public class ArvoreGeradora {
    
    private Graph graph;
    
    public ArvoreGeradora(Graph graph) {
        this.graph = graph;
    }   
    
//    public ArrayList<Edge> kruskal(){
//        ArrayList<Edge> a = new ArrayList<>();
//        ArrayList<Integer> c = new ArrayList<Integer>();
//        
//        for (int i = 0; i < this.graph.vertices.size(); i++) {
//            c.add(i);
//        }
//        
//        Collections.sort(this.graph.edges , new Comparator <Edge>(){
//            @Override
//            public int compare(Edge e1, Edge e2) {
//                if(e1.weight > e2.weight) return 1;
//                else return -1;
//            }
//        });
//        return a;
//    }
}
