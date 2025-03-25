package Graph;

import java.util.ArrayList;

public class Graph {
    int vertex;
    ArrayList<ArrayList<Integer>> adjListArray;

    //constructor
    Graph(int edges){
        this.vertex = edges;
        //creating a new array list
        adjListArray = new ArrayList<>(edges);
        for(int i=0; i<edges; i++){
            adjListArray.add(new ArrayList<>());
        }
    }

    //Function to add an edge to graph
    //src: source, dest: destination
    void addEdges(int src, int dest){
        //adding an edge from src to dest
        adjListArray.get(src).add(dest);
        //for undirected graph, adding an edge from dest to src as well
        adjListArray.get(dest).add(src);
    }

    //function to print adjacency list representation of the graph
    void printAdjacencyList() {
        for(int i = 0; i< vertex; i++){
            System.out.println("Adjacency list of edges " + i);
            System.out.println("head");
            for(Integer node: adjListArray.get(i)){
                System.out.println(" -> " + node);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int edges = 5;
        Graph graph = new Graph(edges);
        graph.addEdges(0,1);
        graph.addEdges(0,4);
        graph.addEdges(1,2);
        graph.addEdges(1,3);
        graph.addEdges(1,4);
        graph.addEdges(2,3);
        graph.addEdges(3,4);

        graph.printAdjacencyList();
    }
}
