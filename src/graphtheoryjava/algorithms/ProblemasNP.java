package graphtheoryjava.algorithms;

import graphtheoryjava.util.Graph;
import java.util.ArrayList;
import java.util.Random;

/**
 * Classe que implementa problemas do tipo NP= nao resolvivel
 *
 * @version 1.0
 */
public class ProblemasNP {

    private Graph graph;
    public ArrayList u = new ArrayList();
    public ArrayList S = new ArrayList();
    long tempoInicial;
    long tempoFinal;
    
    public ProblemasNP(Graph graph) {
        this.graph = graph;
    }
    
    public void definirTempo() {
        this.tempoInicial = System.currentTimeMillis();
        this.tempoFinal = tempoInicial + 100000;        
    }

    public ArrayList neArestNeibhbor () {
        ArrayList naoVisitados = this.graph.vertices;
        this.u.add(naoVisitados.get(0));
        this.S.add(this.u.get(0));
        int v = 0;
        
        System.out.println(naoVisitados);
        
        while (!naoVisitados.isEmpty()) {
            for (int i = 0; i < naoVisitados.size(); i++) {
                int c = (int) this.u.get(0);     
                if ((i+1) < naoVisitados.size()) {
                    if (this.graph.adjMatrix[c][i] < this.graph.adjMatrix[c][i++]) {
                        v = i++;
                    }    
                }                
            }
            System.out.println(this.S);
            this.S.add(v);
            naoVisitados.remove(v);
            this.u.add(v);            
        }
        this.S.add(this.S.get(0));;
        return this.S;
    }
    
    public ArrayList twooPt() {
        
        long inicio = System.currentTimeMillis();
        Random randomGenerator = null;
        ArrayList Slinha = new ArrayList();
        
        while(System.currentTimeMillis() - inicio <= 100000){
            //Pegando indice aleatorio para i1 e i2
            int i1 = randomGenerator.nextInt(this.S.size());
            int i2 = randomGenerator.nextInt(this.S.size());
            
            if (i1 != i2) {
                //Pegando arraylist S e passando para Slinha
                Slinha = this.S;
                
                //Trocando S[i1] com S[i2]
                int aux = (int) this.S.get(i1);
                this.S.set(i1, this.S.get(i2));
                this.S.set(i2, aux);
                
                if (true) {
                    
                }
            }
        }
        return this.S;
    }
    
    public int avalia() {
        int custo = 0;
        
        for (int i = 0; i < this.S.size() - 1; i++) {
            int u = (int) this.S.get(i);
            int v = (int) this.S.get(i+1);
            int w = this.graph.adjList.get(u).get(v).weight;
            
            custo = custo + w;
        }
        
        return custo;
    }
}
