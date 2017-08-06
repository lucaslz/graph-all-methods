package graphtheoryjava.util;

public class Edge {
    
    public int source;
    public int destino;
    public int weight;

    public Edge(int source, int sink, int weight) {
        this.source = source;
        this.destino = sink;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + source + ", " + destino + ", " + weight + ')';
    }
    
}