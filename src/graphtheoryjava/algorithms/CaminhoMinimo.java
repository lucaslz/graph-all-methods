package graphtheoryjava.algorithms;
import graphtheoryjava.util.Graph;
import java.util.ArrayList;

/**
 * @author Lucas Lima
 */
public class CaminhoMinimo {

    private final Graph graph;
    public int[] dist;
    public int[] pred;
    public int[][] distMatriz;
    public int[][] predMatriz;    

    /**
     * Construtor da classe
     * @param graph 
     */
    public CaminhoMinimo(Graph graph) {
        this.graph = graph;
        this.dist = new int[this.graph.vertices.size()];
        this.pred = new int[this.graph.vertices.size()];
        this.distMatriz = new int[this.graph.vertices.size()][this.graph.vertices.size()];
        this.predMatriz = new int[this.graph.vertices.size()][this.graph.vertices.size()];        
    }
    
//    public int[] calculaCusto(ArrayList<Integer> C){
//        int [] custo = new int[C.size()];
//        
//        for (Integer i = 0; i < (C.size() - 2); i++) {
//            System.out.println("\n" + C.get(i));
//            System.out.println("\n" + C.get(i+1));
//            custo[i] = (int) this.graph.adjList.get(C.get(i)).get(C.get(i+1)).weight;
////            int v = this.graph.edges.get(C.get((Integer)i)).source;
////            int u = this.graph.edges.get(C.get((Integer)i+1)).destino;
////            custo += this.graph.adjList.get((Integer)v).get((Integer)u).weight;
//        }
//        return custo;
//    }

    /**
     * Retorna o caminho minimo
     * @param s
     * @param t
     * @param pred
     * @return ArrayList C
     */
//    public ArrayList<Integer> recCaminho(int s, int t, int[] pred) {
//        ArrayList<Integer> C = new ArrayList<>();
//        int aux;
//
//        C.add(0, t);
//        aux = t;
//
//        while (aux != s) {
//            aux = pred[aux];
//            C.add(0, aux);
//        }
//
//        return C;
//    }
//
//    /**
//     * Criei essa funcao porque nao sera usada so em um algoritimo Esse
//     * algoritimo inicia o dist e o pred
//     * @see https://www.youtube.com/watch?v=zNWhPeKGuMc
//     * @param s
//     */
//    public void iniciaDistPred(int s) {
//        for (int i = 0; i < this.graph.vertices.size(); i++) {
//            this.dist[i] = 99999999;
//            this.pred[i] = -1;
//        }
//
//        this.dist[s] = 0;
//    }
//
//    /**
//     * 
//     * @param u
//     * @param v
//     * @param w 
//     */
//    public void relaxamentoMenorPeso(int u, int v, int w) {
//        if (this.dist[v] > this.dist[u] + w) {
//            this.dist[v] = this.dist[u] + w;
//            this.pred[v] = u;
//        }
//    }
//
//    /**
//     * Encontra o menor caminho desde que o grafo nao tenha peso negativo
//     * @see https://www.youtube.com/watch?v=zNWhPeKGuMc
//     * @param s
//     */
//    public void Dikstra(int s) {
//        //Inicializando o destino e o predecessor
//        this.iniciaDistPred(s);
//        
//        ArrayList<Integer> Q = new ArrayList<>();
//
//        Q = (ArrayList<Integer>) this.graph.vertices.clone();
//
//        while (!Q.isEmpty()) {
//            int u = 0;
//            int min = 99999999;
//            for (int i = 0; i < Q.size(); i++) {
//                if (this.dist[Q.get(i)] < min) {
//                    u = Q.get(i);
//                    min = this.dist[Q.get(i)];
//                }
//            }
//
//            Q.remove((Integer)u);
//
//            for (int i = 0; i < this.graph.adjList.get(u).size(); i++) {
//                int v = this.graph.adjList.get(u).get(i).destino;
//                int w = this.graph.adjList.get(u).get(i).weight;
//
//                this.relaxamentoMenorPeso(u, v, w);
//            }
//        }
//    }
//
//    /**
//     * Avalia se o grafo tem ciclo de custo negativo
//     * @see https://www.youtube.com/watch?v=vEztwiTELWs
//     * @param s
//     * @return boolean
//     */
//    public boolean bellmanFord(int s) {
//        //Inicializando o destino e o predecessor
//        this.iniciaDistPred(s);
//
//        //Numero de vertices
//        int n = this.graph.vertices.size();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < this.graph.edges.size(); j++) {
//                int u = this.graph.edges.get(j).source;
//                int v = this.graph.edges.get(j).destino;
//                int w = this.graph.edges.get(j).weight;
//
//                this.relaxamentoMenorPeso(u, v, w);
//            }
//        }
//
//        for (int j = 0; j < this.graph.edges.size(); j++) {
//            int u = this.graph.edges.get(j).source;
//            int v = this.graph.edges.get(j).destino;
//            int w = this.graph.edges.get(j).weight;
//
//            if (this.dist[v] > this.dist[u] + w) {
//                if (this.dist[v] > this.dist[u] + w) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    /**
//     * Determina as distâncias dos menores caminhos entre todos os pares de
//     * vertices de um grafo
//     */
//    public void floydWarshall() {
//        int n = this.graph.vertices.size();
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j) {
//                    this.distMatriz[i][j] = 0;
//                } else if (this.graph.adjMatrix[i][j] > -1) {
//                    this.distMatriz[i][j] = this.graph.adjMatrix[i][j];
//                    this.predMatriz[i][j] = i;
//                } else {
//                    this.distMatriz[i][j] = 99999999;
//                    this.predMatriz[i][j] = -1;
//                }
//            }
//        }
//
//        for (int k = 0; k < n; k++) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (this.distMatriz[i][j] > (this.distMatriz[i][k] + this.distMatriz[k][i])) {
//                        this.distMatriz[i][j] = this.distMatriz[i][k] + this.distMatriz[k][j];
//                        this.predMatriz[i][j] = this.predMatriz[k][j];
//                    }
//                }
//            }
//        }
//    }
}