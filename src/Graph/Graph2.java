package Graph;

import java.util.ArrayList;

//Second way of implementation: using two for loops
public class Graph2 {
    //adding edge
    static void addEdge(ArrayList<ArrayList<Integer>> list, int src, int dest){
        list.get(src).add(dest);
        list.get(dest).add(src);
    }
    //function to print the graph
    static void printGraph(ArrayList<ArrayList<Integer>> list){
        for(int i=0; i<list.size(); i++){
            System.out.println("Adjacency list of edges " + i);
            System.out.println("head");
            for(int j=0; j<list.get(i).size(); j++){
                System.out.println(" -> " + list.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int vertex = 5;
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<vertex; i++){
            list.add(new ArrayList<>());
        }
        addEdge(list, 0, 1);
        addEdge(list, 0, 2);
        addEdge(list, 0, 3);
        addEdge(list, 1, 2);
        addEdge(list, 1,3);
        printGraph(list);

    }
}
