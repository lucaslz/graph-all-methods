package graphtheoryjava.util;

public class Edge {
    
    public int source;
    public int destino;
   

    public Edge(int source, int sink) {
        this.source = source;
        this.destino = sink;
        
    }

   

    @Override
    public String toString() {
       return " (" + source + "," + destino + "," + ")";
    }
    
}