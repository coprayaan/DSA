package data_structures.graphs;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    private boolean isDirected;
    private boolean isWeighted;
    private Integer verticesCount;
    private List<Vertex> vertices;
    private List<Edge> edges;
    private LinkedList<Integer> adjcencyList[];
    private Integer[][] adjecencyMatrix;

    public  Graph(int verticesCount){
        this.verticesCount = verticesCount;
        adjcencyList = new LinkedList[verticesCount];
        for (int i = 0; i < verticesCount; i++) {
            adjcencyList[i] = new LinkedList<>();
        }
    }


    public void addEdge(Integer source, Integer destination){
        adjcencyList[source].add(destination);
    }

    public void displayGraph(){
        for (int i = 0; i < this.verticesCount; i++) {
            System.out.println("Current Vertices - "+ i );
            for (int j = 0; j < adjcencyList[i].size(); j++) {
               System.out.print(" Connected Nodes " + adjcencyList[i].get(j) );
            }
            System.out.println(" ");
        }
    }

    public void addWeightedEdge(Vertex source, Vertex destination, int weigth){
        edges.add(new Edge(source,destination,weigth));
    }

}
