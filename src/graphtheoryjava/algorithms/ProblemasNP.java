package graphtheoryjava.algorithms;
import graphtheoryjava.util.Graph;
import java.util.ArrayList;

/**
 * Classe que implementa problemas do tipo NP= nao resolvivel
 * @version 1.0
 */
public class ProblemasNP {
    
    private Graph graph;
    public ArrayList<String> cores = new ArrayList<>();
    public ArrayList S = new ArrayList<>();
    public ArrayList coresPossiveis = new ArrayList<>();;
    
    public ArrayList iniciaCores() {
        this.cores.add("Amarelo");
        this.cores.add("Vermelho");
        this.cores.add("Verde");
        this.cores.add("Azul");
        this.cores.add("Roxo");
        this.cores.add("Laranja");
        this.cores.add("Rosa");
        this.cores.add("Bege");
        this.cores.add("Bronze");
        this.cores.add("Caramelo");        
        
        return cores;
    }
    
    public ArrayList greedyCol(Graph graph) {
        
        this.graph = graph;
        this.cores = this.iniciaCores();
        
        //cor atribuida a cada vertice
        for (int i = 0; i < this.graph.vertices.size(); i++) {
            if (this.cores.get(i) != null) {
                this.S.add(i, this.cores.get(i));
            }else{
                i = 0;
            }
        }
        
        System.out.println("\nCor atribuida a cada vertice: " + this.S);
        
        for (Integer u = 0; u < this.graph.vertices.size(); u++) {
            this.coresPossiveis =  this.cores;
            for (Integer i = 0; i < cores.size(); i++) {
                for(Integer v = 0; v < this.graph.adjList.get(u).size(); v++){
                    if (this.S.get(v) == i  && this.coresPossiveis.get(i) != null) {
                        this.coresPossiveis.remove(i); 
                    }
                }
            }
            this.S.set(u, this.coresPossiveis.get(0));
        }   
        return this.S;
    }
}