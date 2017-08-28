package graphtheoryjava;

//import graphtheoryjava.algorithms.CaminhoMinimo;
import graphtheoryjava.algorithms.ProblemasNP;
import graphtheoryjava.util.Reader;
import graphtheoryjava.util.Graph;
import java.io.IOException;
//import graphtheoryjava.algorithms.Info;
//import graphtheoryjava.algorithms.Search;
//import java.io.BufferedReader;
//import java.io.Console;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
import java.util.Scanner;
//import java.util.logging.ConsoleHandler;

public class Main {

    public static void main(String[] args) throws IOException {
//        try {
            System.out.println("Graph file: ");
            Scanner in = new Scanner(System.in);
            String fileName = in.nextLine();
            Reader reader = new Reader();

            Graph graph = reader.readFile(fileName);
            System.out.println("\nLista de Adjacencia: " + graph.adjList);
            
            ProblemasNP caxeiro = new ProblemasNP(graph);
            System.out.println("\nColocaração de Vertices: " + caxeiro.greedyCol());
            
//            Info info = new Info(graph);
            
//            int op = -1;
//            Scanner entrada = new Scanner(System.in);
//            Scanner leitor = new Scanner(System.in);
            
//            Search search = new Search(graph);

//            
//            while (op != 0) {                
//                System.out.println("\nGrafos\n\n [1] - Densidade\n [2] - Regular\n [3] - Completo\n\n Opção: ");
//                int tipo = entrada.nextInt();
//                
//                switch(tipo) {
//                    case 1:
//                        System.out.println("Densidade: " + info.density());
//                        break;
//                    case 2:
//                        System.out.println("Regular: " + info.regular());
//                        break;
//                    case 3:
//                        System.out.println("Completo: " + info.complete());
//                        break;           
//                }
//
//                System.out.println("\nGrafos\n\n [1] - Busca Largura\n [2] - Busca Profundidade\n [3] - Completo\n [4] - Grafos Conectados \n [5] - Ordem Topológica \n\n Opção: ");
//                int tipo2 = entrada.nextInt();                
//                switch(tipo2) {
//                    case 1:
//                        System.out.println("Ordem busca largura: " + search.buscaLargura(0));
//                        search.reset();                    
//                    case 2:
//                        System.out.println("Busca Profundidade: " + search.buscaProfundidade(0));          
//                        search.reset();                    
//                    case 3:
//                        System.out.println("Numero de Grafos conectados: " + search.connectedComponents());
//                        search.reset();                    
//                    case 4:
//                        System.out.println("Ordem Topológica: " + search.ordTopologica());                    
//                        search.reset();                
//                }
//            }

//            System.out.println("Informe a origem");
//            int s = entrada.nextInt();
//
//            System.out.println("Informe o destino");
//            int t = entrada.nextInt();
//
//            System.out.println("Caminho Minimo:\n [1] - Dijkstra \n [2] - Bellman-Ford \n [3] - Floyd-Warshall");
//            int alg = entrada.nextInt();
//
//            long To = System.currentTimeMillis();
//            
//            CaminhoMinimo caminhoMinimo = new CaminhoMinimo(graph);
//
//            ArrayList<Integer> C = new ArrayList<>();
//            switch (alg) {
//                case 1:
//                    caminhoMinimo.Dikstra(s);
//                    System.out.println("\nResultado algoritimo Dikstra: " + caminhoMinimo.recCaminho(s, t, caminhoMinimo.pred));
//                    System.out.println("\nCusto do caminho: " + caminhoMinimo.dist[t]);
//                    System.out.println("\nTempo de execução: " + (System.currentTimeMillis()-To));
//                    break;                    
//                case 2:
//                    boolean resultado = caminhoMinimo.bellmanFord(s);
//                    if (resultado == true) {
//                        System.out.println("Não a ciclo de custo negativo.");
//                    } else if(resultado == false) {
//                        System.out.println("Há um ciclo de custo negativo.");
//                    }
//                    System.out.println("Resultado algoritimo BellmanFord: "  + caminhoMinimo.recCaminho(s, t, caminhoMinimo.pred));
//                    System.out.println("\nCusto do caminho: " + caminhoMinimo.dist[t]);
//                    System.out.println("Tempo de execução: " + (System.currentTimeMillis()-To));
//                    break;
//                case 3:
//                    caminhoMinimo.floydWarshall();
//                    System.out.println("\nResultado algoritimo Floyd Warshall: " + caminhoMinimo.recCaminho(s, t, caminhoMinimo.predMatriz[s]));                    
//                    System.out.println("\nCusto do caminho: " + caminhoMinimo.distMatriz[s][t]);
//                    System.out.println("Tempo de execução: " + (System.currentTimeMillis()-To));
//                    break;
//            }
//        } catch (IOException e) {
//            System.err.println("Erro no systema" + e.getMessage());
//        }
    }
}
