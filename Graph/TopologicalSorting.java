package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
    static class EDGE {
        int source;
        int destination;

        public EDGE(int src, int dest){
            this.source = src;
            this.destination = dest;
        }
    }
    public static void topologicalSortingUtil(ArrayList<EDGE> graph[], int curr, boolean vis[], Stack<Integer> stack){
        vis[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            EDGE e = graph[curr].get(i);

            if(!vis[e.destination]){
                topologicalSortingUtil(graph, e.destination, vis, stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<EDGE> graph[], int V){
        //performing the operation that we also have to do in main function.
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<V; i++){
            if(!vis[i]){
                topologicalSortingUtil(graph, i, vis, stack);
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int vertex= 6;
        ArrayList<EDGE> graph[] = new ArrayList[vertex];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new EDGE(2,3));

        graph[3].add(new EDGE(3,1));

        graph[4].add(new EDGE(4,0));
        graph[4].add(new EDGE(4,1));

        graph[5].add(new EDGE(5,0));
        graph[5].add(new EDGE(5,2));

        topSort(graph, vertex);
    }
}
