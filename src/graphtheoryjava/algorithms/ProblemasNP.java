package graphtheoryjava.algorithms;

import graphtheoryjava.util.Graph;
import java.util.ArrayList;

/**
 * Classe que implementa problemas do tipo NP= nao resolvivel
 *
 * @version 1.0
 */
public class ProblemasNP {

    private Graph graph;
    public ArrayList u = new ArrayList();
    public ArrayList S = new ArrayList();

    public ProblemasNP(Graph graph) {
        this.graph = graph;
    }

    public ArrayList neArestNeibhbor () {
        ArrayList naoVisitados = this.graph.vertices;
        this.u.add(naoVisitados.get(0));
        this.S.add(this.u.get(0));
        int v = 0;

        while (!naoVisitados.isEmpty()) {
            for (int i = 0; i < naoVisitados.size(); i++) {
                for (int j = 0; j < naoVisitados.size(); j++) {
                    if (this.u.get(0).equals(i)) {
                        System.out.println(v+"===="+i);
                        if (this.graph.adjMatrix[v][j] > this.graph.adjMatrix[i][j]) { 
                            v = j;   
                        }
                    }
                }
            }
            
            this.S.add(v);
            naoVisitados.remove(v);
            this.u.add(0, v);
        }
        this.S.add(this.S.get(0));
        return this.S;
    }
}
