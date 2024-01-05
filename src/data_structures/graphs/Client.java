package data_structures.graphs;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int num_vertices, num_edjes;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        num_vertices = sc.nextInt();
        System.out.println("Enter number of edges");
        num_edjes = sc.nextInt();
        Graph graph = new Graph(num_vertices);
        for (int i = 0; i < num_edjes; i++) {
            System.out.println("Enter Source of Edge");
            int source = sc.nextInt();
            System.out.println("Enter Destination of Edge");
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
        }
        graph.displayGraph();
    }
}
