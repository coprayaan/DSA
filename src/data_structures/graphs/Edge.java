package data_structures.graphs;

public class Edge {
    private Vertex source;
    private Vertex destination;
    private Integer weigth;

    public Edge(Vertex source, Vertex destination){
        this.source = source;
        this.destination = destination;
    }

    public Edge(Vertex source, Vertex destination, Integer weigth){
        this(source,destination);
        this.weigth = weigth;
    }
}
